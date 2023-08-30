package work;

public class PlaneTest {

	public static void main(String[] args) {
		Plane[] plane = {(new Airplane("L747",1000)),
						(new Cargoplane("C40",1000))};
		printInfo(plane);
		System.out.println("[100 운항]");
		for(Plane p : plane) {
			p.flight(100);
		}
		printInfo(plane);
		System.out.println("[200 주유]");
		for(Plane p : plane) {
			p.refuel(200);
		}
		printInfo(plane);

	}
	public static void printInfo(Plane[] list) {
		 // 타이틀 출력
		System.out.printf("%s\t%s\n","Plane","fuelSize");
		System.out.println("-----------------");
		 // Plane 객체들의 데이터 출력(출력 결과 참조)
		for(Plane p : list) {
			System.out.printf("%s\t%5d\n",p.getPlaneName(),p.getFuelSize());
		}
		System.out.println();
	}

}
