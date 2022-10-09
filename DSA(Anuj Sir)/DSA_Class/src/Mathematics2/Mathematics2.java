package Mathematics2;

public class Mathematics2 {
	
	static boolean isPrime(int n) {
		if(n==1)return false;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0)return false;
		}
		return true;
	}
	
	static boolean isPrimeEfficient(int n) {
		if(n==1)return false;
		if(n==2 || n==3)return true;
		if(n%2==0||n%3==0)return false;
		for(int i=5,j=7;j<=Math.sqrt(n);i+=6,j+=6) {
			if(n%i==0 || n%j==0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrimeEfficient(117));
	}

}
