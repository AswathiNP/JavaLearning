import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		
		int[] someNumbers= {1,3,4,5};
		int key=0;
		
		process(someNumbers,key, wrapperLamda((v,t)-> System.out.println(v/t)));
		
		process(someNumbers,key, (v,t)-> System.out.println(v+t));

	}

	public static void process(int[] someNumbers, int key, BiConsumer<Integer,Integer> biconsumer) {
		for(int num:someNumbers)
			biconsumer.accept(num, key);	
	}
	
	private static BiConsumer<Integer,Integer> wrapperLamda(BiConsumer<Integer,Integer> biconsumer)
	{
		return (v,t)->{
			try {
			biconsumer.accept(v, t);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Exception happened");
			}
		
		};
		
	}

}
