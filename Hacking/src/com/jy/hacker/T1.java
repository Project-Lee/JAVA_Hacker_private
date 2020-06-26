package com.jy.hacker;


//비밀번호가 걸려있는 자물쇠
class Lock {

	// 1~3까지 랜덤한 비밀번호 부여
	private int passWord;

	// get을 사용하여 private 걸려있는 비밀번호를 반환하여 사용할수있게 함
	public int getPassWord() {
		return passWord;
	}

	// Lock에 랜덤으로 사용자도 모르는 비밀번호 1 ~ num까지 지정해줌
	public void setPassWord(int num) {
		num = (int) (Math.random() * num + 1);
		passWord = num;
	}
}

//잠겨있는 비밀번호를 푸는 '해커'클래스   ( Lock에 상속받음 )
class Hacker extends Lock {

	// 굳이 private 으로 안줘도 되지만 공부연습겸 일부로 public 대신 private 줬음
	private int num;

	
	// ☆ 이부분 업데이트필요 ☆
	// 
	public void setNum(int number) {
		number = (int) (Math.random() * number + 1);
		num = number;
	}

	public int getNum() {
		return num;
	}
}


public class T1 {

}
