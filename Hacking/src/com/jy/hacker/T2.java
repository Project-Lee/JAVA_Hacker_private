package com.jy.hacker;

//Hacker 상속받은 program 클래스  ( 실질적으로 해킹프로그램 클래스 )
class Program extends Hacker {
	private int max;   // 범위 지정 변수
	private int count; // 총 몇회에 맞췄는지 담을 변수 
	
	
	// for문으로 지속적으로 랜덤값을 출력하기 위한 메소드
	// 참고로) setNum(100) 1~100까지 랜덤으로 값을 추적하는 범위
	// 6.26 / 지정값 고정되어있음
	// ☆ 이부분 추후 객체화로 빼서 업데이트 필요 / 시간관계상 생략 ☆
	public void abc() {
		for(int i=0; i<getMax(); i++) {
			setNum(100); // 1 ~ 100 랜덤값 돌린단 뜻 
		}
	}
	
	// 값 확인하는 메소드
	// setMax(n) 지정한 값까지 반복돌림
	// abc(); <-- 위에 상세내용 기입 
	public void checkPass() {
		getPassWord(); // 랜덤으로 정해진값이 for문 위에 '값' 변동없이 고정으로 위치
		for(int i=0; i<getMax(); i++) {
			abc(); // ☆
			if(getPassWord() == getNum()) {
				System.out.printf("Lock 비밀번호 : %d\n"
						+ "Hacker가 입력한 비밀번호 : %d\n"
						,getPassWord(),getNum());
				break;
				
			} else {
				getCount();
			}
		}
		System.out.printf("[%d회 만에 해킹성공]\n",getCount());
	}
	
		
	// max(범위조절) 셋,겟 메소드
	public void setMax(int num) {
		max = num;
	}
	
	public int getMax() {
		return max;
	}	
	
	// 카운터 셋,겟 메소드            
	public void setCount(int num) {
		count = num;
	}
	
	public int getCount() {
		return count++;
	}
	
}
public class T2 {

}
