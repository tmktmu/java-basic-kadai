package kadai_015;

//設計図クラス
public class Car_Chapter15 {
	
	//インスタンスフィールド
	private int gear;
	private int speed;
	
	//インスタンスメソッド
	public void gearChange(int afterGear) {
		this.gear = afterGear;
		switch(this.gear) {
		case 1 -> System.out.println("ギアが1から"+this.gear+"に切り替えました");
		case 2 -> System.out.println("ギアが1から"+this.gear+"に切り替えました");
		case 3 -> System.out.println("ギアが1から"+this.gear+"に切り替えました");
		case 4 -> System.out.println("ギアが1から"+this.gear+"に切り替えました");
		case 5 -> System.out.println("ギアが1から"+this.gear+"に切り替えました");
		default -> System.out.println("ギアが1から"+this.gear+"に切り替えました");
		}
	}
	
	public void run() {
		switch(this.gear) {
		case 1 -> this.speed=10;
		case 2 -> this.speed=20;
		case 3 -> this.speed=30;
		case 4 -> this.speed=40;
		case 5 -> this.speed=50;
		default -> this.speed=10;
		}
		
		System.out.println("速度は時速"+this.speed+"kmです");
	}
	
	}


