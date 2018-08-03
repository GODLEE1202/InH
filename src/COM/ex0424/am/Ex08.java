package COM.ex0424.am;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;

public class Ex08 {
	public static void main(String[] args) {
	
		Consumer<String> con1 = t ->System.out.println(t+10);
		con1.accept("java");
	
		BiConsumer<String, String> con2 = (t,u)->System.out.println(t+u);
		con2.accept("java", "10");
				
		DoubleConsumer con3 = d -> System.out.println("java"+d);
		con3.accept(10.0);
		
		ObjDoubleConsumer<String> con4 = (t,i) ->System.out.println(t+i);
		con4.accept("java", 10);
	
	
	
	
	
	
	
	
	
	
	}
}
