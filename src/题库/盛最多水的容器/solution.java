package 题库.盛最多水的容器;

import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int s1[] = {1,8,6,2,5,4,8,3,7};
		int x=maxArea(s1);
		System.out.println(x);
	
	}
	
	 public static int maxArea(int[] height) {
	        int i = 0, len = height.length-1;
	        
	        int ans = 0;
	        while (i < len) {
	            int area = Math.min(height[i], height[len]) * (len - i);
	            ans = Math.max(ans, area);
	            if (height[i] < height[len]) {
	                i++;
	            }
	            else {
	                len--;
	            }
	        }
	        return ans;
	    }

	}
