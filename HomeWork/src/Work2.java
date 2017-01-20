import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {

		System.out.println("------MENU------");
		System.out.println("1.점수 5개의 평균 및 총합");
		System.out.println("2.섭씨를 화씨를 변경하는 프로그램");
		System.out.println("3.BMI를 계산하는 프로그램");
		System.out.println("4.종료");

		Scanner input = new Scanner(System.in);

		while (true) {

			System.out.println("메뉴를 입력해주세요");
			int number = input.nextInt();

			if (number == 1) {
				System.out.println("1.숫자를 입력하세요");
				int num1 = input.nextInt();

				System.out.println("2.숫자를 입력하세요");
				int num2 = input.nextInt();

				System.out.println("3.숫자를 입력하세요");
				int num3 = input.nextInt();

				System.out.println("4.숫자를 입력하세요");
				int num4 = input.nextInt();

				System.out.println("5.숫자를 입력하세요");
				int num5 = input.nextInt();

				int sum = 0;
				sum = num1 + num2 + num3 + num4 + num5;
				System.out.println("총합 : " + sum + " 평균: " + (sum / 5.));

			}

			else if (number == 2) {
				System.out.println("섭씨를 입력하세요");
				double oC = input.nextDouble();
				double oF = oC * 1.8 + 32;
				System.out.println("화씨는 :" + oF);

			}

			else if (number == 3) {

				System.out.println("몸무게를 입력하세요");
				double kg = input.nextDouble();

				System.out.println("키를 입력하세요");
				double cm = input.nextDouble() / 100;

				double bmi = kg / (cm * cm);
				System.out.println("BMI는 :" + bmi);

			}

			else if (number == 4) {
				System.out.println("종료합니다");
				break;
			}

			else {

				System.out.println("1~4사이 숫자를 입력해주세요");

			}
		}
	}

}
