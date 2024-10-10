package com.example.app;

/**
 * Hello world!
 *
 */
public class App {

	    public int add(int a, int b) {
	        return a + b;
	    }

	    public int subtract(int a, int b) {
	        return a - b;
	    }

	    public int multiply(int a, int b) {
	        return a * b;
	    }

	    public int divide(int a, int b) {
	        if (b != 0) {
	            return a / b;
	        } else {
	            throw new ArithmeticException("Cannot divide by zero");
	        }
	    }
	    public boolean isPalindrome(String inputString) {
	        if (inputString.length() == 0) {
	            return true;
	        } else {
	            char firstChar = inputString.charAt(0);
	            char lastChar = inputString.charAt(inputString.length() - 1);
	            String mid = inputString.substring(1, inputString.length() - 1);
	            return (firstChar == lastChar) && isPalindrome(mid);
	        }
	    }

}
