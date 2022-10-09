package BitManupilation;

public class class1 {
	static int findIthBit(int n, int i) {
		int mask=1<<i;
		int result=n&mask;
		if(result==0)return 0;
		return 1;
	}
	static int toggleIthBit(int n, int i) {
		int mask=1<<i;
		int result=n^mask;
		return result;
	}
	static boolean isPowerofTwo(int n) {
		int mask=n-1;
		int result=n&mask;
		if(result==0)return true;
		return false;
	}
	
	static int countSetBit(int n) {
		int count=0;
		while(n!=0) {
			if(n%2!=0)count++;
			//if((n&1)==1)
			n=n>>1;
		}
		return count;
	}
	static void swap(int a,int b) {
		int mask=a^b;
		a=mask^a;
		b=mask^b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		//1011-n
		//0100-mask 
		//1111-output
		//output=15
//		System.out.println(findIthBit(n,2));
//		System.out.println(toggleIthBit(n,2));
//		System.out.println(isPowerofTwo(16));
//		System.out.println(countSetBit(15));		
	}

}
