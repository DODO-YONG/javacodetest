package com.java.coding;

import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		practice_9();

	}
	public static void practice_9() {
		Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i=1; i<10; i++) {
            System.out.printf("%d * %d = %d%n", a, i, a*i);
        }
	}
	public static void practice_8() {
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}
	
	public static void practice_7() {
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}
	public static void practice_6() {
		Scanner scanner = new Scanner(System.in);
		String time = scanner.nextLine();
		System.out.println(time);
		String h_m[] = time.split(" ");
		System.out.println(h_m[0]);
		int h = Integer.parseInt(h_m[0]);
		System.out.println(h);
		int m = Integer.parseInt(h_m[1]);
		System.out.println(m);
		if (0 <=m & m < 45) {
			if (h > 0 & h <= 23) {
				System.out.printf("%d %d", h-1, m+15);
			} else if (h == 0) {
				System.out.printf("%d %d", h+23, m+15);
			}

		} else if (m <= 59 & m >= 45) {
			System.out.printf("%d %d", h, m-45);
		}
	}
	
	public static void practice_5() {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		if (x>0) {
			if (y>0) {
				System.out.println("1");
			} else if (y<0) {
				System.out.println("4");
			}
		} else if (x < 0) {
			if (y>0) {
				System.out.println("2");
			} else if (y<0) {
				System.out.println("3");
			}
		}
		
	}
	
	public static void practice_4() {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if ((year%4==0 & year%100!=0) || year%400 ==0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	
	
	public static void practice_3() {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if( score >= 70) {
			System.out.println("C");
		} else if(score >=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
	
	public static void practice_2() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if (a>b) {
			System.out.println('>');
		} else if ( a == b ) {
			System.out.println("==");
		} else if ( a < b) {
			System.out.println('<');
		}
	}

	public static void practice_1() {
		IntBuffer ib = IntBuffer.allocate(5);
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String b = scanner.next();
		
		int c = Integer.parseInt(b.substring(0,1));
		int d = Integer.parseInt(b.substring(1,2));
		int e = Integer.parseInt(b.substring(2,3));
		
		System.out.println(a*c);
		System.out.println(a*d);
		System.out.println(a*e);
		System.out.println(123*123);
		System.out.println(a*Integer.parseInt(b));
//		System.out.println(ib);
//		ib.put(1).put(2).put(3).put(4).put(5);
//		System.out.println(ib);
//		System.out.println(ib.get(0));
//		while(ib.hasRemaining()) {
//			System.out.println(ib.get());
//		}
		}

}
