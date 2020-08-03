package object;

import object.TV;
//자바 책 240쪽 객체 배열
class TV {
	int channel;
	boolean power;
	String color;
	
	public void channelUp() {
		channel ++;
	};
	public void channelDown() {
		channel --;
	}
}
public class Object_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV[] tvArr = new TV[3]; // 참조변수 배열 (객체 배열을 생성했다.) 길이가 3인 tv 타입의 참조변수 배열을 선언했다. 빈 메모리공간.
		
		tvArr[0] = new TV();
		tvArr[1] = new TV();
		tvArr[2] = new TV();
		
		TV[] tvArr2 = new TV[1000];

		for(int i = 0; i<tvArr2.length; i++) {
			tvArr2[i] = new TV();
			tvArr2[i].channel = 7;
			tvArr2[i].channelUp();
			System.out.println(tvArr2[i].channel);
		}
		
	}

}
