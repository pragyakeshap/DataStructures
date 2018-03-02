package com.mylearnings;

public class FibonacciWithRecursion {


	  public static void main(String[] args) {
	  
	    for(int i = 0; i < 15; i++){
	      System.out.println(fib(i) + " ");
	    }
	    
	  }
	  
	  public static int fib(int i){
	    if(i < 0){
	      return  -1;
	    }
	    if(i== 0 || i == 1){
	      return i;
	    }else{
	     return fib(i-1)+ fib(i-2); 
	    }
	    
	  }
}

