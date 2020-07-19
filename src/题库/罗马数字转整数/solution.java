package 题库.罗马数字转整数;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.next();
		int x=romanToInt(s1);
		System.out.println(x);
		
	}
	 public static int romanToInt(String s) {
		    int roTo=0;
		    int i=0;
	        Map<String, Integer> map = new HashMap<>();
	        map.put("I",1);
	        map.put("V",5);
	        map.put("X",10);
	        map.put("L",50);
	        map.put("C",100);
	        map.put("D",500);
	        map.put("M",1000);
	        map.put("IV",4);
	        map.put("IX",9);
	        map.put("XL",40);
	        map.put("XC",90);
	        map.put("CD",400);
	        map.put("CM",900);
			
	       while(i<s.length()) {
		    
            if((i+1)<s.length()&&map.get(s.substring(i, i+2)) != null) {
            	 roTo=roTo+map.get(s.substring(i, i+2));
            	 i=i+2;
            }
            else {  String str=""+ s.charAt(i);
	    	 roTo=roTo+map.get(str);
	    	 i++;
	    	 }
	       }
	        return roTo;
	    }

	}
