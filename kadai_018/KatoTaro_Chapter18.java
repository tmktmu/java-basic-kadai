package kadai_018;

//子クラス
public class KatoTaro_Chapter18 extends Kato_Chapter18 {
	
	//setterメソッド
	public void setGivenName() {
		super.givenName="太郎";
	}
	
	//抽象メソッドのオーバーライド
	public void eachIntroduce() {
		System.out.println("Javaが得意です");
	}
}
