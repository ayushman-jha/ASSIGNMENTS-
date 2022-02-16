public class Assignment3Q3 
{
	public static void main(String args[])
		{
		String s1="Java String pool refers to collection of Strings which are stored in heap memory";
		String s1Lower=s1.toLowerCase();
		System.out.println(s1Lower);  
	    String s1Upper=s1.toUpperCase();  
	    System.out.println(s1Upper);   
		String s1replaceString=s1.replace('a','$'); 
		System.out.println(s1replaceString); 
		System.out.println(s1.contains("collection"));    
		String s2="java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		
			}
		}