package Hashing;

import java.util.*;

public class HashingProblem1 {
	
	//Find length of Longest SubArray With Zero Sum;
	static int LargestSubarrayWithZeroSum(int a[]){
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0,-1);
		int ans=0;
		int cursum=0;
		for(int i=0;i<a.length;i++) {
			cursum+=a[i];
			if(map.containsKey(cursum)) {
				ans=Math.max(ans,i-map.get(cursum));
			}
			else map.put(cursum, i);
		}
		return ans;
	}
	
	//Problem 2: Find Longest Consecutive Subsequence
	
	static int LongestConsecutiveSubsequence(int a[]) {
		int ans=0;
		Set<Integer> set=new HashSet<>();
		//Adding element to Hashset
		for(int e:a)set.add(e);
		//Set traversal
		for(int e:set) {
			int l=1;
			if(!set.contains(e-1))
				while(set.contains(++e))l++;
			
			ans=Math.max(ans, l);
		}
		return ans;
	}	
	
	//Problem 3:Find any quadruple whose sum is equal to the given sum
	
	
	
	public static void main(String[] args) {

//		execution Problem 1
		//int a[]= {1,1,5,-3,-4,3,4,1};
		//System.out.println(LargestSubarrayWithZeroSum(a));
		//
//		execution Problem 2
		//int a[]= {2,4,6,8};
		//System.out.println(LongestConsecutiveSubsequence(a));
	}

}
