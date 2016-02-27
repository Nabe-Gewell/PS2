package base;

public class MyInteger {
	public int iValue;
	
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}
	
	public int get() {
		return this.iValue;
	}
	public void set(int number) {
		iValue = number;

	}	
	public boolean isEven() {
		return isEven(this.iValue);
	}
	public boolean isOdd() {
		return isOdd(this.iValue);
	}
	public boolean isPrime() {
		return isPrime(this.iValue);
	}
	
	public static boolean isEven(MyInteger q) {
		return isEven(q.iValue);
	}
	public static boolean isOdd(MyInteger q) {
		return isOdd(q.iValue);
	}
	public static boolean isPrime(MyInteger q) {
		return isPrime(q.iValue);
	}
	
	public boolean equals(int q) {
		if (q == this.iValue)
			return true;
		return false;
	}
	public boolean equals(MyInteger q) {
		if (q.iValue == this.iValue)
			return true;
		return false;
	}
	
	static boolean isEven(int a) {
		if ((a%2) == 0)
			return true;
		return false;
	}
	static boolean isOdd(int a) {
		if ((a%2) != 0)
			return true;
		return false;
	}
	static boolean isPrime(int a) {
	    if (isEven(a)) return false;
	    for (int i=3; i*i<=a; i+=2) {
	        if ((a%i) == 0)
	            return false;
	    }
	    return true;
	}
}