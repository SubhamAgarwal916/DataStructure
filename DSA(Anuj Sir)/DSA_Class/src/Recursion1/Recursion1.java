package Recursion1;

import java.util.*;

public class Recursion1 {
	

	static void generateAllSubsets(String s) {
		Set<String> set =new HashSet<>();
		utilGenerateAllSubsets(s, 0,"",set);
		for(String c:set) {
			System.out.println(c);
		}
	}
	static void utilGenerateAllSubsets(String s,int i,String cur, Set<String> set) {
		if(i==s.length()) {
			set.add(cur);
			return;
		}
		utilGenerateAllSubsets(s, i+1, cur,set);
		utilGenerateAllSubsets(s, i+1, cur+s.charAt(i),set);
	}
	
	//problem 2:
	static void TowerOfHanoi(int n, char src,char helper,char dest) {
		if(n==0) return;
		TowerOfHanoi(n-1,src,dest,helper);
		System.out.println(" Transfer disk "+n+" from "+src+" to "+ dest);
		TowerOfHanoi(n-1,helper,src,dest);
	}
	static String swap(String str, int i, int j)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
	//problem 3:
	static void allPermudationOfString(String str) {
		Set<String> set=new HashSet<>();
		utilAllPermudationOfString(0,str,set);
		for(String s:set) {
			System.out.println(s+" ");
		}
	}
	static void utilAllPermudationOfString(int n,String str,Set<String> set) {
		if(n==str.length()-1){
			set.add(str);
		}
		for(int i=n;i<str.length();i++) {
			str=swap(str,n,i);
			utilAllPermudationOfString(n+1,str,set);
			str=swap(str,i,n);
		}
	}
	static int JosephusProblem(int n,int k) {
		if(n==1) {
			return 0;
		}
		return (JosephusProblem(n-1,k)+k)%n;
	}
	
	
	public static void main(String[] args) {
		//generateAllSubsets("aaa");
		//TowerOfHanoi(2,'A','B','C');
		//allPermudationOfString("AAB");
		System.out.println(JosephusProblem(5,2));
		
	}

}
