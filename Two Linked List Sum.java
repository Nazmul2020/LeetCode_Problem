import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
public class Test{
    public static void main(String[] args) throws IOException {
        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
        LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
        LinkedList<Integer> linkedList3 = new LinkedList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String lines = br.readLine();
        String[] strs = lines.trim().split("\\s+");

        for (int i = 0; i< strs.length; i++){
            linkedList1.add(Integer.parseInt(strs[i]));
        }
        lines = br.readLine();

        strs = lines.trim().split("\\s+");

        for (int i = 0; i< strs.length; i++){
            linkedList2.add(Integer.parseInt(strs[i]));
        }

        int carry = 0;
        if(linkedList1.size()>=linkedList2.size()){
            Iterator<Integer> iter = linkedList2.iterator();
            for(int i:linkedList1){
                if(iter.hasNext()){
                    int value = iter.next();
                    linkedList3.add((carry+i+value)%10);
                    carry = (i+value)/10;
                }
                else {
                    linkedList3.add((parity+i)%10);
                    carry = (i+carry)/10;

                }
            }
        }
        else {
            Iterator<Integer> iter = linkedList1.iterator();
            for(int i:linkedList2){
                if(iter.hasNext()){
                    int value = iter.next();
                    linkedList3.add((carry+i+value)%10);
                    carry = (i+value)/10;
                }
                else {
                    linkedList3.add((carry+i)%10);
                    carry = (i+parity)/10;

                }
            }
        }

        if(carry>0){
            linkedList3.add(carry);
        }

        System.out.println(linkedList3);

    }
}
