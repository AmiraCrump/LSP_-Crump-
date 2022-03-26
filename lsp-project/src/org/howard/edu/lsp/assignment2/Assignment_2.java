package org.howard.edu.lsp.assignment2;
import java.util.Arrays;
import java.util.Scanner;


public class Assignment_2{
	
	  public static int sum = 0,token= 0, product = 1;
	  
	  public static void scanString() {
	    Scanner scanner = new Scanner(System.in);
	    
	    while(true)
       {
	    System.out.println("string?");
	    String input = scanner.nextLine();
	  
	    
	    if(input.charAt(0) == ' ')
      break;
	    
	    else 
	    scanString(input);
	    }
	        
	    	System.out.println("Token: " + token);
		    System.out.println("Sum: " + sum);
		    System.out.println("Product: " + product);
		}
	  
	  public static void scanString(String input) {
	    int num, beginIndex = 0, index = 0;
	    
	    while(true) {
	      index = input.indexOf(' ');
	      
	      if(index == -1) break;
	      
	      else {
	        num = Integer.parseInt(input.substring(beginIndex, index));
	        sum += num;
	        product *= num;
	        input = input.substring(index + 1, input.length());
	        }
	      }
	      num = Integer.parseInt(input);
	      sum += num;
	      product *= num;
	    }
	  
	    public static void main(String args[]) {
	      scanString();
	    }
	}
