package 题库.整数转罗马数字;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int s1 = input.nextInt();
		String x=intToRoman(s1);
		System.out.println(x);
		
	}
	public static String intToRoman(int num) {
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[]    nums =  {1000, 900, 500,  400, 100,  90,   50,  40,   10,   9,   5,    4,    1};
        int index = 0;
        StringBuilder result = new StringBuilder();
        while (index < 13) {
            if (num >= nums[index]) {
                result.append(romans[index]);
                num=num- nums[index];
            } else {
                index ++;
            }
        }
        return result.toString();
    }

	
	}
