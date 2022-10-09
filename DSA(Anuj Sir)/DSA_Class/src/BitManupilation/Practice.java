package BitManupilation;

public class Practice {
	static int countSetBit(int n) {
		int count=0;
		while(n!=0) {
			if(n%2!=0)count++;
			//if((n&1)==1)
			n=n>>1;
		}
		return count;
	}
}
