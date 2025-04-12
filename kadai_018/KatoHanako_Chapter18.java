package kadai_018;

//子クラス
public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	
	//setterメソッド
	public void setGivenName() {
		super.givenName="一郎";
	}
	
	//抽象メソッドのオーバーライド
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
}