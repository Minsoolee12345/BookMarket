package NoOOP;

import java.util.Scanner;

public class KTHBookMarket {

	static String[][] bookList = { { "ID2401", "쉽게 배우는 자바 프로그래밍 2판", "우종정", "한빛아카데미", "20,000원" },
			{ "ID2402", "코딩 자율학습 HTML+CSS+자바스크립트", "김기수", "길벗", "30,000원" },
			{ "ID2403", "Do It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편", "보요시바타", "이지스 퍼블리싱", "25,000원" } };
	static int[] cartList = { 0, 0, 0 };
	static int numCartItem = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("*      Welcome to KTH Book Market       *");
		System.out.println("*****************************************");

		System.out.println();

		String a1; // 메인 입력
		String a2; // ID 입력

		int n1 = 0; // 메인 반복 스위치
		int n2 = 0; // 메인 메뉴 스위치
		int n3 = 0; // 장바구니 id 입력 반복 스위치

		while (n1 == 0) {
			if (n2 == 0) {
				System.out.print("=========================================\r\n" + "1. 도서 목록 보기\r\n" + "2. 장바구니 보기\r\n"
						+ "3. 장바구니에 도서 추가\r\n" + "4. 장바구니 비우기\r\n" + "0. 종료\r\n"
						+ "=========================================\r\n" + ">> 메뉴 선택 : ");
			} else {
				n2 = 0;
			}

			a1 = sc.nextLine();
			
			if (a1.equals("1")) {

				System.out.println();
				System.out.println(
						">> 도서 목록\r\n" + "------------------------------------------------------------------------");
				for (int i = 0; i < bookList.length; i++) {
					for (int j = 0; j < bookList[0].length; j++) {
						if (j == bookList[i].length - 1) {
							System.out.print(bookList[i][j]);
						} else {
							System.out.print(bookList[i][j] + ", ");
						}
					}
					System.out.println();
				}
				System.out.println("------------------------------------------------------------------------");
				System.out.println();

			} else if (a1.equals("2")) {
				System.out.println();
				System.out.println(
						">> 장바구니 보기\r\n" + "------------------------------------------------------------------------");

				if (cartList[0] > 0) {
					System.out.println(cartList[0] + "권, ID2401, 쉽게 배우는 자바 프로그래밍 2판, 우종정, 한빛아카데미, 20,000원");
				}
				if (cartList[1] > 0) {
					System.out.println(cartList[1] + "권, ID2402, 코딩 자율학습 HTML+CSS+자바스크립트, 김기수, 길벗, 30,000원");
				}
				if (cartList[2] > 0) {
					System.out.println(cartList[2] + "권, Do It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편, 보요시바타, 이지스퍼블리싱, 25,000원");
				}

				if (cartList[0] == 0 && cartList[1] == 0 && cartList[2] == 0) {
					System.out.println("장바구니가 비어 있습니다.");
				}
				System.out.println("------------------------------------------------------------------------");
				System.out.println();

			} else if (a1.equals("3")) {

				n3 = 0;
				while (n3 == 0) {

					System.out.println();
					System.out.println(">> 도서 목록\r\n"
							+ "------------------------------------------------------------------------");
					for (int i = 0; i < bookList.length; i++) {
						for (int j = 0; j < bookList[0].length; j++) {
							if (j == 4) {
								System.out.print(bookList[i][j]);
							} else {
								System.out.print(bookList[i][j] + ", ");
							}
						}
						System.out.println();
					}
					System.out.println("------------------------------------------------------------------------");

					System.out.print("추가할 도서 ID 입력 : ");
					a2 = sc.nextLine();

					if (a2.equals("ID2401")) {
						cartList[0] += 1;
						System.out.println("장바구니 추가 : 쉽게 배우는 자바 프로그래밍 2판");
						n3 = 1;
					} else if (a2.equals("ID2402")) {
						cartList[1] += 1;
						System.out.println("장바구니 추가 : 코딩 자율학습 HTML+CSS+자바스크립트");
						n3 = 1;
					} else if (a2.equals("ID2403")) {
						cartList[2] += 1;
						System.out.println("장바구니 추가 : Do It! 자료구조와 함께 배우는 알고리즘 입문 - 자바편");
						n3 = 1;
					} else {
						System.out.println("없는 ID입니다. 도서 목록에 있는 ID를 입력하세요.");
					}

				}
				n3 = 0;

			} else if (a1.equals("4")) {
				cartList[0] = 0;
				cartList[1] = 0;
				cartList[2] = 0;
				System.out.println();
				System.out.println(">> 장바구니가 비어 있습니다.\n\n>> 장바구니에 있는 아이템을 모두 삭제하였습니다.");
				System.out.println();

			} else if (a1.equals("0")) {
				System.out.println();
				System.out.println(">> KTH Book Market을 종료합니다.");
				System.out.println();
				n1 = 1;

			} else {
				System.out.println();
				System.out.println("잘못 입력하셨습니다.");
				System.out.println();

			}

		}
		n1 = 0;

		sc.close();

	}
}
