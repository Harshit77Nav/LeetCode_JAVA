// 42. Trapping Rain Water
import java.util.*;

public class TrappingRainWater {
    public static void main(String[] args) {
        //height = [0,1,0,2,1,0,1,3,2,1,2,1]
        int height[] = {4,2,0,3,2,5};
        int leftMax[] = new int[height.length];
        int rightmax[] = new int[height.length];
        int max = 0;
        for(int i=0; i<height.length; i++) {
            leftMax[i] = max;
            max = Math.max(max, height[i]);
        }
        max = 0;
        for(int i=height.length-1; i>=0; i--) {
            rightmax[i] = max;
            max = Math.max(max, height[i]);
        }
        int res = 0;
        for(int i=0; i<height.length; i++) {
            int min = Math.min(rightmax[i], leftMax[i]);
            int waterStore = min - height[i];
            if(waterStore > 0) {
                res += waterStore;
            }
        }
        System.out.println(res);

    }
}
