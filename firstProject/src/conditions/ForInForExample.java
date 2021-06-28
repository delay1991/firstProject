package conditions;

public class ForInForExample {
	public static void main(String[] args) {
		// 1~5
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
			 System.out.print("*");
			 try{
				 Thread.sleep(500);
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
			}System.out.println(); //for문개행
		}
		
		
	}
	
	public static void ex1(){
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print("i의 값: " + i + " j의 값: " + j + "\t"); // tap 공란4칸띄움
			}//ln은 줄자꿈, 없으면 한줄
			System.out.println();
		}
	}
	}

