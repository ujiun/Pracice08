package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1); //주소값 같아서 true		
		System.out.println(p1.equals(p2));//object클래스에 equals 메소드가 있음
		System.out.println(p4.equals(p1));
	}		
		
		
}


