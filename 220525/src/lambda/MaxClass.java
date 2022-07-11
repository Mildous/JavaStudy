package lambda;

public class MaxClass implements MyFunction  {

	@Override
	public int max(int a, int b) {
		return a > b ? a : b;
	}

}
