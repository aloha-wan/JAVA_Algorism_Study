package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 3.
 * ���� ���� : ����
 * ���� ��ȣ : 2753
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
 *         ���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. 
 *         ������, 2000���� 400�� ����̱� ������ �����̴�.
 *
 * ��    �� : ù° �ٿ� ������ �־�����. ������ 1���� ũ�ų� ����, 4000���� �۰ų� ���� �ڿ����̴�.
 *
 * ��    �� : ù° �ٿ� �����̸� 1, �ƴϸ� 0�� ����Ѵ�.
 *
 * 
 **/
public class Main_2753 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year % 4 == 0) {
			if(year % 100 != 0 || year % 400 == 0) {
    	        System.out.println("1");
			}else {
		        System.out.println("0");
			}
		}else {
	        System.out.println("0");
		}
	}
}