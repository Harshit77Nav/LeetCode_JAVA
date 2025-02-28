// 4. Median of Two Sorted Arrays (H)

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        //nums1 = [1,2], nums2 = [3,4]
        int nums1[] = {1,1}, nums2[] = {6};
        int check = nums1.length + nums2.length;
        int length = (nums1.length + nums2.length)/2;
        int index = 0;
        int i = 0;
        int j = 0;
        int num1 = 0;
        int num2 = 0;
        while (i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j] ) {
                if(index == length-1) {
                    num1 = nums1[i];
                } else if (index == length) {
                    num2 = nums1[i];
                }
                i++;
            } else  {
                if(index == length-1) {
                    num1 = nums2[j];
                } else if (index == length) {
                    num2 = nums2[j];
                }
                j++;
            }
             
            index++;
        }
        while(i < nums1.length) {
            if(index == length-1) {
                num1 = nums1[i];
            } else if (index == length) {
                num2 = nums1[i];
            }
            i++;
            index++;
        }
        while(j < nums2.length) {
            if(index == length-1) {
                num1 = nums2[j];
            } else if (index == length) {
                num2 = nums2[j];
            }
            j++;
            index++;
        }
        if(check%2 == 0 && nums1.length > 0 ) {
            double med = (num1 + num2)/2.0;
            System.out.println(med);
        } else if(check%2 == 0 && nums2.length > 0 ){
            double med = (num1 + num2)/2.0;
            System.out.println(med);
        } else {
            System.out.println(num2);
        }
    }
}
