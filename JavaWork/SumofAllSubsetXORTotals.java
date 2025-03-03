//1863. Sum of All Subset XOR Totals
import java.util.*;

public class SumofAllSubsetXORTotals {              // FIRST APPROACH NOT WORKED AS EXPECTED 
    public static void main(String[] args) {
        //arr[] = {1, 5, 6}
        int arr[] = {3,4,5,6,7,8};
        List<Integer> sets = new ArrayList<>();
        getSubset(0, arr, 0, 0, sets);
        System.out.println(sets.get(0));

    }

    public static void getSubset(int index, int[] arr, int curr, int res,List<Integer> sets) {
        res += curr;
        if(sets.size() != 0)
        sets.set(0,sets.get(0)+res);
        else
        sets.add(res);
        for(int i=index; i<arr.length; i++) {
            curr = curr ^ arr[i];
            getSubset(i+1, arr, curr, res, sets);
        }
    }
}

// public class SubsetXORSum {
//     public static void main(String[] args) {
//         int arr[] = {3, 4, 5, 6, 7, 8};
//         int result = getSubset(0, arr, 0);
//         System.out.println(result);
//     }

//     public static int getSubset(int index, int[] arr, int curr) {
//         int res = curr;

//         for (int i = index; i < arr.length; i++) {
//             res += getSubset(i + 1, arr, curr ^ arr[i]);
//         }

//         return res;
//     }
// }

