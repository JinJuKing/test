
// 전달받은 배열 문자(12 45 55 88)중에서 가장 큰 수를 구하는 프로그램을 작성하시오

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		
		int input1, input2, input3, input4, input5;
		int max;
		System.out.println("5번 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		input1 = sc.nextInt();
		input2 = sc.nextInt();
		input3 = sc.nextInt();
		input4 = sc.nextInt();
		input5 = sc.nextInt();
		
		max = input1;
		
		if(max <= input2) {
			max=input2;
		}
		if (max <= input3) {
			max=input3;
		}
		if (max <= input4) {
			max=input4;
		}
		if (max <= input5) {
			max=input5;
		}
		System.out.println(max);
		
	}
}
