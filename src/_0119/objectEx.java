package _0119;

//����: Ŭ���� �ۼ� -> ��ü ���� -> ��ü ���

//��ü�� ���� : Tv t = new Tv();
//��ü�� �ٷ���� ���������� �ʿ��ϴ�, ���� ���������� ������ְ� ���Կ����ڷ� ��ü�� �������ش�.
//��ü�� ��� : ���������� ����Ű�� ������ �޼ҵ带 ����Ѵ�(�б�/ȣ��) 
//���������� ��ü�� Ÿ���� ��ġ�ؾ� �Ѵ�.
//��ü�� �����Ҷ��� Ŭ������ ������ ���������. ��ü�� ������ �����ϸ� ���� ������ ��������� ���������.
//������ �ϳ��� ���� ���� ����, �������� ���������� �ϳ��� ��ü�� ����ų�� ������ �ݴ�� �Ұ���

public class objectEx {

	public static void main(String[] args) {
		tv1 t = new tv1();
		t.channel = 7;
		t.channelDown();
		t.channelDown();
		System.out.println("���� ä����? "+t.channel +" �Դϴ�.");

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
