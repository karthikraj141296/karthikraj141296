package org.tcs;


public class Employee {
       
	  public static void main(String[] args) {
	
	System.out.println("===immo====");
	
	StringBuffer s = new StringBuffer("java");
	System.out.println(s);
	int x = System.identityHashCode(s);
	System.out.println(x);
	


	StringBuffer s1 = new StringBuffer("karthik");
	System.out.println(s1);
	 int y = System.identityHashCode(s1);
   System.out.println(y);
    
   StringBuffer append= s.append(s1);
   System.out.println(append);
   int z = System.identityHashCode(append);
   System.out.println(z);
   
	  }
	  
	
	}
	  

