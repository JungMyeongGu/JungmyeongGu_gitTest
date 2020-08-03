package object;

import object.TV2;

class TV2 {
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

public class Exam_01 {

	public static void main(String[] args) {
		TV2 t1 = new TV2();
		TV2 t2 = new TV2();
		t2 = t1;
		t1.channel = 9;
		t2.channel = 6;
		
		t2.channelDown();
		t2.channelDown();
		System.out.println(t2.channel);
	
		System.out.println(t1.channel);
		System.out.println(t1.equals(t2));
	}
	
}	