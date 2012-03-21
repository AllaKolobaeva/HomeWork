
public class Deque {
	int[] a;

	Deque() {
		a = new int[0];
	}

	void pushEnd(int n) {
		int[] a1 = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			a1[i] = a[i];
		}
		a1[a.length] = n;
		a = a1;
	}

	int popEnd() throws DequeOutOfBoundsException {
		if (a.length == 0) {
			throw new DequeOutOfBoundsException();
		}
		int[] a1 = new int[a.length - 1];
		if (a1.length <= 0) {
			throw new DequeOutOfBoundsException();
		}
		int y = a[a.length - 1];
		for (int i = 0; i < a.length - 1; i++) {
			a1[i] = a[i];
		}
		a = a1;
		return y;
	}

	void pushBegin(int n1) {
		int[] a1 = new int[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			a1[i + 1] = a[i];
		}
		a1[0] = 1;
		a = a1;
	}

	int popBegin() throws DequeOutOfBoundsException {
		if (a.length == 0) {
			throw new DequeOutOfBoundsException();
		}
		int[] a1 = new int[a.length - 1];
		int y = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			a1[i] = a[i + 1];
		}
		a = a1;
		return y;
	}

	void print() {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
