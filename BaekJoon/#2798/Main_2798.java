package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 3.
 * ���� ���� : ������
 * ���� ��ȣ : 2798
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ī���뿡�� ���� �α� �ִ� ���� �������� ��Ģ�� ����� ����. ī���� ���� 21�� ���� �ʴ� �ѵ� ������, ī���� ���� �ִ��� ũ�� ����� �����̴�. �������� ī���븶�� �پ��� ������ �ִ�.
 *        �ѱ� �ְ��� ������ ���� �������� ���ο� ������ ��Ģ�� ����� ���, â���̿� �����Ϸ��� �Ѵ�. ������ ������ �����迡�� �� ī�忡�� ���� ������ ���� �ִ�. 
 *        �� ����, ������ N���� ī�带 ��� ���ڰ� ���̵��� �ٴڿ� ���´�. �׷� �Ŀ� ������ ���� M�� ũ�� ��ģ��. ���� �÷��̾�� ���ѵ� �ð� �ȿ� N���� ī�� �߿��� 3���� ī�带 ���� �Ѵ�. 
 *        ������ ���� �����̱� ������, �÷��̾ ���� ī���� ���� M�� ���� �����鼭 M�� �ִ��� ������ ������ �Ѵ�.
 *        N���� ī�忡 ���� �ִ� ���ڰ� �־����� ��, M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ���� ����Ͻÿ�.
 * 
 * ��    �� : ù° �ٿ� ī���� ���� N(3 �� N �� 100)�� M(10 �� M �� 300,000)�� �־�����. ��° �ٿ��� ī�忡 ���� �ִ� ���� �־�����, �� ���� 100,000�� ���� �ʴ´�.
 *        ���� M�� ���� �ʴ� ī�� 3���� ã�� �� �ִ� ��츸 �Է����� �־�����.
 * 
 * ��    �� : ù° �ٿ� M�� ���� �����鼭 M�� �ִ��� ����� ī�� 3���� ���� ����Ѵ�.
 * 
 * 
 **/
public class Main_2798 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int min = M;
		
		int []black = new int [N];
		
		for(int i = 0; i< black.length; i++) {
			black[i] = sc.nextInt();
		}
		
		int sum = 0;
		
		for(int i = 0; i< black.length-2; i++) {
			for(int j = i+1; j < black.length-1; j++) {
				for(int z = j + 1; z < black.length; z++) {
					sum = black[i] + black[j] + black[z];
					if(sum <= M && M - sum < min) {
						min = M-sum;
					}
				}
			}
		}
		System.out.println(M-min);
	}
}