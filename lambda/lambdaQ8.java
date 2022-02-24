package lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class lambdaQ8 {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5);
		Print(list,p->System.out.println(p));

	}

	private static void Print(List<Integer> list,Consumer<Integer> consumer) {
		Thread thread =new Thread(()-> {
				for (Integer i:list)
					consumer.accept(i);
				
			}
		);
		thread.start();
		
	}

}