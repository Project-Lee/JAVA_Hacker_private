package com.jy.hacker;

public class T3 {
	
	public static void main(String[] args) {
		
		Program p1 = new Program();
		
		int num = (int)(Math.random() * 10 +1);
		
		p1.setMax(500); // 해킹프로그램 몇회 돌릴지 범위 지정 (현재 500회)
		p1.setPassWord(50); // Lock이 랜덤값으로 1~50까지 하나의 난수 지정
		p1.checkPass(); // 프로그램 돌리기 (Program 클래스)
		
	}
}
