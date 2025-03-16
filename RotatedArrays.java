import java.util.*;
public class RotatedArrays{
    public static int[] rotatedarray(int[] nums, int k){
    int n=nums.length;
    k %= n;
    int[] rotated = new int[n];
    for(int i=0;i<n;i++){
        rotated[(i+k)%n] = nums[i];
    }
     return rotated;
}
	public static void main(String[] args) {
	    int[] arr = {1,2,3,4,5,6,7};
	    int k=3;
	    
	    int[] result=rotatedarray(arr,k);
		System.out.println(Arrays.toString(result));
	}
}
