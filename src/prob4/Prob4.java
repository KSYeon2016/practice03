package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int intArray[] = new int[5];
        final int LEN = intArray.length;
        double sum = 0;

        System.out.println(LEN + "개의 숫자를 입력하세요");
        /* 키보드에서 배열 크기만큼 입력 받아 배열에 정장하는 코드 */
        for(int i = 0; i < LEN; i++){
        	intArray[i] = scanner.nextInt();
        	/* 배열에 저장된 정수 값 더하기 */
        	sum = sum + intArray[i];
        }

        /* 출력 */
        System.out.println("평균은 " + sum/LEN + " 입니다.");
        
        /* 자원정리 */
        scanner.close();
	}

}
