package lambda;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class lambdaQ5{
	static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

	public static void main(String[] args) {
		PrintString(list,p->System.out.println(p));

	}

	private static void PrintString(List<String> list2,Consumer<StringBuilder> consumer) {
		StringBuilder stringBuilder = new StringBuilder();
		for(String s:list)
			stringBuilder.append(s.charAt(0));
		consumer.accept(stringBuilder);
	}

}
