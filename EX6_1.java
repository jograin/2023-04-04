package ch06;

class Tv{
//TV의 속성(멤버변수)
	String coclor; //색
boolean power; //전원상태
int channel; //채널

void power() {power = !power;}//tv켜거나 끄는 기능 매서드
void channelUp() {++channel;}//채널 높이는 기능 매서드
void channelDown() {--channel;}//채널을 낯주는 기능 매서드	
}





public class EX6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv t;// TV인스턴스 참조하기 위한 벼수 t를 선언
		t =new Tv();//TV인스턴스 생성
		//TV t =new TV();	
		t.channel =5;//TV인스턴스의 멤버변수 채널1의 값을 7로한다
				
		t.channelDown();//TV인스턴스 매서드 channelDown()을 호출.
		System.out.println("a현 채널은"+t.channel+"입니다");
		
		t.channelUp();////TV인스턴스의 매서드 channelUp()을 호출
		System.out.println("a현 채널은"+t.channel+"입니다");
		
		
	}

}
