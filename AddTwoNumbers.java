// 2. Add Two Numbers
import java.util.*;

public class AddTwoNumbers {
    class ListNode {
        int value;
        ListNode next;
    
        ListNode(int value) {
            this.value = value;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        // l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
        LinkedList<Integer> l1 = new LinkedList<>(Arrays.asList(9,9,9,9,9,9,9));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(9,9,9,9));
        LinkedList<Integer> list = new LinkedList<>();

        int div = 0;
        int i = 0;
        while (l1 != null || l2 != null) {
            
            if(l1 == null) {
                int sum = l2.get(i) + div;
                div = 0;
                if(sum > 9){
                    int rem = sum%10;
                    div = sum/10;
                    list.add(rem);
                    i++;
                } else {
                    list.add(sum);
                    i++;
                }
            } else if (l2 == null) {
                int sum = l1.get(i)  + div;
                div = 0;
                if(sum > 9){
                    int rem = sum%10;
                    div = sum/10;
                    list.add(rem);
                    i++;
                } else {
                    list.add(sum);
                    i++;
                }
            } else {
                int sum = l1.get(i) + l2.get(i) + div;
                div = 0;
                if(sum > 9){
                    int rem = sum%10;
                    div = sum/10;
                    list.add(rem);
                    i++;
                } else {
                    list.add(sum);
                    i++;
                }
            }
        }
        System.out.println(list);
    }
}
