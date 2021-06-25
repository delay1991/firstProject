package conditions;

public class ForExample2 {
	public static void main(String[] args) {
//System.out.println("2*1=2"); 구구단	
		int val = 5;
		for (int i = 1; i <= 9; i++) {
			System.out.println(val + " * " + i + " = " + val * i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
