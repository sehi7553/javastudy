
public class Calculatormpl implements Calculator{

	@Override
	public int plus(int x, int y) {
		return x+y;
	}

	@Override
	public int minus(int x, int y) {
		return x-y;
	}

	@Override
	public int multiplication(int x, int y) {
		return x*y;
	}

	@Override
	public int division(int x, int y) {
		return x/y;
	}

}
