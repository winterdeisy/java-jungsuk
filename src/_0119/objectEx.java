package _0119;

//과정: 클래스 작성 -> 객체 생성 -> 객체 사용

//객체의 생성 : Tv t = new Tv();
//객체를 다루려면 참조변수가 필요하다, 먼저 참조변수를 만들어주고 대입연산자로 객체와 연결해준다.
//객체의 사용 : 참조변수가 가리키는 변수와 메소드를 사용한다(읽기/호출) 
//참조변수와 객체의 타입은 일치해야 한다.
//객체를 생성할때는 클래스의 내용대로 만들어진다. 객체를 여러개 생성하면 각각 별도의 저장공간이 만들어진다.
//변수는 하나의 값만 저장 가능, 여러개의 참조변수가 하나의 객체를 가리킬수 있지만 반대는 불가능

public class objectEx {

	public static void main(String[] args) {
		tv1 t = new tv1();
		t.channel = 7;
		t.channelDown();
		t.channelDown();
		System.out.println("현재 채널은? "+t.channel +" 입니다.");

	}
}

class tv1 {
	String Color;
	boolean power;
	int channel;
	
	void power() {power =! power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}
