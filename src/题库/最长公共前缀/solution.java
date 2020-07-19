package 题库.最长公共前缀;

import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1[] = {"fl","flowe","floww"};
		String x=longestCommonPrefix(s1);
		System.out.println(x);
	
	}
	
	 public static String longestCommonPrefix(String[] strs) {
	        if (strs == null || strs.length == 0) return "";
	        String res = strs[0];
	        int i = 1;
	        while (i < strs.length) {
	            while (strs[i].indexOf(res) != 0) {
	                res = res.substring(0, res.length() - 1);
	            }
	            i++;
	        }
	        return res;
	        
	    }
}
