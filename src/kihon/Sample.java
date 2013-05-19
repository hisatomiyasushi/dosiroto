package kihon;

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/*
		int x=2, y=3;
		System.out.println(x+y);

		String a = "Hello";
		String b = "\nworld";
		System.out.println(a + b);

		for (int n = 0; n < 10; n++ ){
			System.out.println(n);
		}
		*/

		int sales[]; //宣言
		sales = new int[4]; //領域の確保
		sales[0] = 150;
		sales[1] = 200;
		sales[2] = 140;
		sales[3] = 400;

		System.out.println(sales.length);

		for (int i = 0; i < sales.length; i++){
			System.out.println(sales[i]);
		}


	}
}
