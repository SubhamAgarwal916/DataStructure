package Recursion2;

public class Recrsion2 {
	//Problem 1
	static boolean RatInMaze(int a[][],boolean vis[][],int i,int j){
		// Base condition 
		if(i== a.length || j>=a.length || a[i][j]==0 || vis[i][j]==true) {
			return false;
		}
		//Base condition for successfully reached 
		if(i==a.length-1 && j== a.length-1) return true;
		//mark this cell as visited
		vis[i][j]=true;
		//if path is possible from down
		if(RatInMaze(a, vis, i+1, j)) return true;
		//if path is possible from right
		if(RatInMaze(a, vis, i, j+1)) return true;
		//backtracking
		vis[i][j]=false;
		return false;
	}
	//Problem 2
	static boolean isSafe(int a[][],int n,int row,int col) {
		//check col
		for(int i=0;i<n;i++) {
			if(a[i][col]==1) return false;
		}
		//for left upper diagonal
		for(int i=row,j=col;i>=0 && j>=0; i--, j--) {
			if(a[i][j]==1) return false;
		}
		//for right upper diagonal
		for(int i=row,j=col;i>=0 && j<n;i--,j++) {
			if(a[i][j]==1) return false;
		}
		return true;
	}
	static boolean NQueen(int a[][],int n,int row) {
		
		if(row==n)return true;
		for(int col=0;col<n;col++) {
			if(isSafe(a,n,row,col)) {
				a[row][col]=1;
				if(NQueen(a,n,row+1)) {
					return true;
				}
				a[row][col]=0;
			}
		}
		return false;
	}
	
	// main method
	
	public static void main(String[] args) {
	/*	int a[][]= {
				{1,1,0,1},
				{1,1,1,1},
				{0,0,1,0},
				{1,1,1,1}
		};
		boolean vis[][]=new boolean[a.length][a.length];
		System.out.println(RatInMaze(a,vis,0,0));
		
	*/	int n=4;
		int a[][]=new int[n][n];
		System.out.println(NQueen(a,n,0));
		for(int[]i:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}