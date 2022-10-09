package StackProblems;

import java.util.*;

public class Part1 {
	
	static boolean isOperator(char c) {
		return c=='+' || c=='-' || c=='*' || c=='/';
	}
	
	static int precedence(char c) {
		if(c=='+'|| c=='-')return 1;
		else if (c=='*' || c=='/')return 2;
		else return -1;
		
	}
	
	static int calculate(int a, int b, char c) {
		switch(c) {
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		case '/':
			return a/b;
		}
		return 0;
	}
	static String infixToPostfix(String s){
		StringBuilder sb=new StringBuilder();
		ArrayDeque<Character> stack=new ArrayDeque<>();
		
		for(int i=0; i<s.length();i++) {
			char cur=s.charAt(i);
			if(cur =='(') {
				stack.push(cur);
			}
			else if(cur==')') {
				while(stack.peek() !='(') {
					sb.append(stack.pop());
				}
				stack.pop();
			}
			else if(isOperator(cur)) {
				while(!stack.isEmpty() && precedence(cur)<=precedence(stack.peek())) {
					sb.append(stack.pop());
				}
				stack.push(cur);
			}
			else {
				sb.append(cur);
			}
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		return sb.toString();
	}
	
	static int evaluatepostfix(String s) {
		ArrayDeque<Integer> stack=new ArrayDeque<>();
		for(int i=0; i<s.length();i++) {
			char cur=s.charAt(i);
			if(isOperator(cur)) {
				int second=stack.pop();
				int first=stack.pop();
				int eval=calculate(first,second,cur);
				stack.push(eval);
			}
			else stack.push(cur-'0');//cur-'0' is used to convert character value to integer value for ex: ascii value of '0' is 48 and '1' is so '1'-'0'=49-48=1.
		}
		return stack.pop();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="(6+5/4)*((4/2)-1)";//(7)*()=-6
		String output=infixToPostfix(input);
		System.out.println(output);
		int res=evaluatepostfix(output);
		System.out.println(res);
		
	}

}

