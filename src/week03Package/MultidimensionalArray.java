package week03Package;

import java.util.Arrays;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 3;
	    int[][] arr = new int[a][b];
	    
	    if (a > 2 && b > 2) {
    	    for(int i = 0; i < a; i++) {
    	        for(int j = 0; j < b; j++) {
    	            arr[i][j] = j;
    	        }
    	    }
	        System.out.println(arr[0][arr[0].length - 1]);
	    } else {
	        System.out.println("Both numbers need to be greater than 2.");
	    }
	    System.out.println(Arrays.deepToString(arr));
	}

}
