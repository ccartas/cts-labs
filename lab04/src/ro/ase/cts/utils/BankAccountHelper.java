package ro.ase.cts.utils;

public class BankAccountHelper {
	public static double computeAnuallyInterestValue(double balance, double interestRate) throws Exception {
		if(balance <= 0 || balance > Double.MAX_VALUE / 12) {
			throw new Exception();
		}
		double interestValue = balance * interestRate * 12;
		return interestValue;
	}
	
	public static double computeBalanceFromAnualInterestValue(double interestValue, double rate) {
		return interestValue / 12 / rate;
	}
}
