package classtest;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		System.out.println("제작회사는"+myCar.company);
		System.out.println("모델명:" + myCar.model);
		System.out.println("차량색상:" +myCar.color);
		System.out.println("차량최고속도:" + myCar.maxspeed);
		System.out.println("차량현재속도:" + myCar.speed);
		System.out.println("시동켜졌니?" + myCar.power);
		
		myCar.speed = 60;
		System.out.println("차량현재속도:"+myCar.speed);
		
		

	}

}
