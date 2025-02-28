//21. Merge Two Sorted Lists
import java.util.*;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        LinkedList <Integer> l1 = new LinkedList<>(Arrays.asList(1,2,3));
        LinkedList <Integer> l2 = new LinkedList<>(Arrays.asList(1,3,4));
        LinkedList <Integer> list = new LinkedList<>();
        int i = 0;
        int j = 0;
        if(l1.size() == 0){
            System.out.println(l2);
        } else if(l2.size() == 0){
            System.out.println(l1);
        }
        while (i<l1.size() && j<l2.size()){
            if(l1.get(i) == l2.get(j)){
                list.add(l1.get(i));
                list.add(l2.get(j));
                i++; j++;
            } else if(l1.get(i) < l2.get(j)){
                list.add(l1.get(i));
                i++;
            } else if(l2.get(j) < l1.get(i)) {
                list.add(l2.get(j));
                j++;
            }
        }
        System.out.println(list);
    }
}


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
//         ListNode list = new ListNode(0);
//         ListNode curr = list;
//         while (list1 != null && list2 != null){
//             if(list1.val <= list2.val){
//                 curr.next = list1;
//                 list1 = list1.next;
//             } else {
//                 curr.next = list2;
//                 list2 = list2.next;
//             }
//             curr = curr.next;
//         }
//         curr.next = list1 != null ? list1 : list2;
//     return list.next;
//     }
// }