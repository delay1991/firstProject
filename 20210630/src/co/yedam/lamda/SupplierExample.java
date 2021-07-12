package co.yedam.lamda;

import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample { // 매값은 없음, 반환값은 있음.
	public static void main(String[] args) {
		Supplier<String> sup = ()-> {
			return "Hellow World";
					};
		System.out.println(sup.get());
	
	IntSupplier intSup = ()-> { 
			return new Random().nextInt(40);
		};
	System.out.println(intSup.getAsInt());
	
	DoubleSupplier dsup = null;
	}

}
