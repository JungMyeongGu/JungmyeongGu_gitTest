package object;

public class P295_TEST_THIS {

	public static void main(String[] args) {
		Car c1 = new Car();
		
		Car c2 = new Car("aa","Auto", 4);
		
		System.out.println(c1.color);
		System.out.println(c2.color);
	}

}

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		this("abc","auto",14);
	}
	Car(String c, String g, int d){
		this.color = c;
		this.gearType = g;
		this.door = d;
	}
}
