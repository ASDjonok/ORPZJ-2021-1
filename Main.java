package ia91.gritsenko;

public class Main {

	public static void main(String[] args) {
		int zalik_book = 9106;

		int x = zalik_book % 2;
		int y = zalik_book % 3;
		int z = zalik_book % 5;
		int d = zalik_book % 7;
		System.out.println("С2 = " + x);
		System.out.println("С3 = " + y);
		System.out.println("С5 = " + z);
		System.out.println("С7 = " + d);

		int c = y;

		int a = 4;
		int b = 2;
		int n = 10;
		int m = 10;

		float finalSum = 0;

		if(n < a || m < b){
			System.out.println("Відповідь: "+ finalSum);
		}else if(a > -c){
			// C7 = 6, тоді за умовою тип індексів i та j: double
			for(double i = a; i <= n; i++){
				// C2 = 0, тоді за умовою операція O1: +
				double znam = i + c;
				for(double j = b; j <= m; j++){
					// C5 = 1, тоді за умовою операція O2: /
					finalSum += (float) (i / j) / znam;
				}
			}
			System.out.println("Відповідь: " + finalSum);
		}else{
			System.out.println("Ділення на нуль не можливе.");
		}
	}
}
