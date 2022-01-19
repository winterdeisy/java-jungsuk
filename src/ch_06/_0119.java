package ch_06;

public class _0119 {
	//객체지향언어 = 프로그래밍 언어 + 객체지향개념(규칙)
	//1.캡슐화 2.상속 3.추상화 4.다형성
	//웹 -> JSP, spring / 앱(모바일) -> 안드로이드

	//클래스란? 객체를 정의해놓은 것, 어떤 객체가 이러이러하다. 클래스는 설계도, 객체는 제품 
	//클래스를 한번 만들어놓으면 제품을 쉽게 만든다
	
	public static void main(String[] args) {
		
	}

}

class Tv {
	//실제 세계(HW)를 SW세계로 옮겨놓은 것이 프로그램(코딩) -> 실제 세계의 특징을 파악해야 한다
	//실제 세계의 HW는 속성(변수)+기능(메소드) = 객체
	//하드웨어를 관찰해서 속성과 기능을 뽑아 속성은 변수, 기능은 메소드로 만든다
	String color;
	boolean power;
	int channnel;
	
	void power() {}
	void channelUp() {}
}
