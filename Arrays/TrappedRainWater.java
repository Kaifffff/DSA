public class TrappedRainWater {

    // complaxity O(n)
    public static int trappedWater(int height[]){
        int n = height.length;

        //calculate left max boundry -array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1 ; i < n ; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate right max boundry - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2 ; i >= 0 ; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trapewater = 0;
        //loop
        for(int i = 0 ; i < n ; i++){
            //waterlevel = min(leftmax bound , rightmax bound)
            int waterLevel = Math.min(leftMax[i] , rightMax[i]);

            //trapped water = waterlevel - height[i]
            trapewater += waterLevel - height[i];
        }

        return trapewater;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int result = trappedWater(height);
        System.out.println("trapped water is : " + result);
    }
}
