package comparableQ;
import java.io.*;
import java.util.*;

public class ComparableQuestionTest {
	public static void main(String[] args) {
		ArrayList<ComparableQuestion> list = new ArrayList<ComparableQuestion>();
		
		list.add(new ComparableQuestion("Force Awakens", 8.3, 2015));
		list.add(new ComparableQuestion("Star Wars", 8.7, 1977));
		list.add(new ComparableQuestion("Empire Strikes Back", 8.8, 1980));
		list.add(new ComparableQuestion("Return of the Jedi", 8.4, 1983));
		
		for(ComparableQuestion q : list) {
			System.out.println(q.getName() + " " + q.getRating() + " " + q.getYear());
		}
		
		Collections.sort(list);
		
		for(ComparableQuestion q : list) {
			System.out.println(q.getName() + " " + q.getRating() + " " + q.getYear());
		}
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println("Testing");
		}
				
	}
}
