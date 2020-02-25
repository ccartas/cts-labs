package ro.ase.cts.initial;

public class Helper {
	public static double compute(Account a, double r) throws Exception {
		double i = 0;
		if(r < 0) {
			throw new Exception();
		}
		i = a.getTotal() * 12 * r;
		if(i > 2000) {
			i += 300;
		} else {
			i += 50;
		}
		return i;
	}
	
	public static void shift(Account a1, Account a2, double a) throws Exception {
		if(a < 0 || a > 5000) {
			throw new Exception();
		}
		if(a1.getTotal() < a) {
			throw new Exception();
		}
		a1.setTotal(a1.getTotal() - a);
		a2.setTotal(a2.getTotal() + a);
	}
}
