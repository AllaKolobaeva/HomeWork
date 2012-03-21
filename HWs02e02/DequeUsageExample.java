public class DequeUsageExample{
public static void main(String[] args) {
		Deque deq = new Deque();
		try {
			deq.popEnd();
			deq.popBegin();
		} catch (DequeOutOfBoundsException e) {
			System.out.println("Exception caught: " + e);
		}
	}
}