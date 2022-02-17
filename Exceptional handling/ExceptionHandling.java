
public class ExceptionHandling {
	public static void main(String[] args)
	 {
	        int a = 5;
	        int b = 5;
	        try {
	            System.out.println(a / b); 
	        }
	        catch (ArithmeticException e) {
	           
	            System.out.println(
	                "Divided by zero operation cannot possible");
	        }
	    }
	}

