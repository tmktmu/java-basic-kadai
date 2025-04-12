package kadai_018;

//実行用クラス
public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		//子クラスのインスタンス化
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
		
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();
		
		taro.CommonIntroduce();
		taro.execIntroduce();
		taro.eachIntroduce();
		System.out.println("");
		
		ichiro.CommonIntroduce();
		ichiro.execIntroduce();
		ichiro.eachIntroduce();
		System.out.println("");
		
		hanako.CommonIntroduce();
		hanako.execIntroduce();
		hanako.eachIntroduce();
		System.out.println("");

	}

}
