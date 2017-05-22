import java.util.PriorityQueue;
import java.util.Queue;

import org.omg.CORBA.Principal;

public class Starter {

	public static void main(String[] args) {
		Queue<Integer> test = new PriorityQueue<>();
		test.add(5);
		test.add(3);
		
		System.out.println(test.poll());

	}

}
