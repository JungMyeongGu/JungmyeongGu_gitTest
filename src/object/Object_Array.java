package object;

import object.TV;
//�ڹ� å 240�� ��ü �迭
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
		TV[] tvArr = new TV[3]; // �������� �迭 (��ü �迭�� �����ߴ�.) ���̰� 3�� tv Ÿ���� �������� �迭�� �����ߴ�. �� �޸𸮰���.
		
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
