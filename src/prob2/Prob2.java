package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] bill = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int len = bill.length;
		int[] n = new int[len];
		
		System.out.print("금액 : ");
		int money = scanner.nextInt();
		
		for(int i = 0; i < len; i++){
			n[i] = money / bill[i];			// 몫
			money = money - bill[i]*n[i];	// 잔액
			System.out.println(bill[i] + "원 : " + n[i] + "개");
		}
	}
}

