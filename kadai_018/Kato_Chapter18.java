package kadai_018;

//抽象クラス
abstract public class Kato_Chapter18 {
	
	//フィールド
	public String familyName="加藤";
	public String givenName;
	public String address="東京都中野区〇×";
	
	//具象メソッド
	public void CommonIntroduce() {
		System.out.println("名前は"+familyName+givenName+"です");
	}
	
	//具象メソッド
	public void execIntroduce() {
		System.out.println("住所は東京都中野区〇×です");
	}
	
	//抽象メソッド
	abstract public void eachIntroduce();
	
	
	

}
