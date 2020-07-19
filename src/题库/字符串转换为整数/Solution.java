package 题库.字符串转换为整数;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s1=input.next();
		int x=myAtoi(s1);
		System.out.println(x);
	}

	 public static int myAtoi(String str) {
		int len=str.length(),i=0,flag=1;
		long res=0;
		int ma=0;
		while(i<len&&str.charAt(i)==' ')i++;
		if(i==len) return 0;
		if(str.charAt(i)=='+'||str.charAt(i)=='-') {
			if(str.charAt(i)=='-') {
				flag=-1;
				i++;
			}
		}	
		while(i<len&&(str.charAt(i)<='9'&&str.charAt(i)>='0')) {
			int num=str.charAt(i)-'0';//str.charAt(i)-'0' 是去取字符的uincode值，ASCII上的值对应的相减
			System.out.println(str.charAt(i));
			if(flag==1&&(res>214748364||res==214748364&&str.charAt(i)>=7)) {
			
				return Integer.MAX_VALUE;
			}	
			if(flag==-1&&(res<-214748364||res==-214748364&&str.charAt(i)<-7)) {
				
				return Integer.MIN_VALUE;
			}	

			res=res*10+num;
			i++;

		}
		ma=(int) (res*flag);
		 return ma;
	       
	    }

}
