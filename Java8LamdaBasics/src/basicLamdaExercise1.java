import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class basicLamdaExercise1 {
	
	public static void main(String[] args)
	{
		List<Person> personList= Arrays.asList(new Person("Zain","malik",20),
				                               new Person("Twinkle","khana",32),
				                               new Person("Maya","chaoudari",21),
				                               new Person("arya","siva",24),
				                               new Person("manu","chaitra",24));
		Collections.sort(personList, new Comparator<Person>() {

			@Override
			public int compare(Person arg0, Person arg1) {
				return arg0.getLastName().compareTo(arg1.getLastName());
			}
		});
		
		//sort persons based on lastName
		
		Collections.sort(personList,(p1,p2)-> p1.getLastName().compareTo(p2.getLastName()));
		
		//Create a method to print all the elements of list
		printConditionally(personList, p->true, p-> System.out.println(p));
		
		//Create a method to print all the elements whose last name start with c
		printConditionally(personList, p -> p.getLastName().startsWith("c"), p-> System.out.println(p));
		
	}

	public static void printConditionally(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p:personList)
		{
			if(predicate.test(p))
			{
				consumer.accept(p);
			}
		}
		
	}

	

}
