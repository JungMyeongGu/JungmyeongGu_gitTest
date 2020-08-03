package object;

class Data {int x;}
public class JVM_PARAMETER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x="+d.x);
		
		change(d.x);
		System.out.println("after change(a.x)");
		System.out.println("main() : x =" + d.x);
	}
	static void change(int x) {//d.x가 매개변수 x에 복사됨 
		x = 1000; //x가 1000으로 바뀜
		System.out.println("change x ="+x);
	}
}
