package lambda;
interface Operation{
	double perform(int a,int b);
}

public class lambdaQ1 {
    public static double addition(int num1,int num2){
		return num1+num2;}
    public static double subtraction(int num1,int num2){
		return num1-num2;}
    public static double multiplication(int num1,int num2){
		return num1*num2;}
    public static double division(int num1,int num2){
		return num1/num2;}
    public static void main(String[] args) {
    	Operation addition = (a,b)->addition(a, b);
		System.out.println("addition of numbers is "+addition.perform(110, 12));
		
		Operation substaction = (a,b)->subtraction(a, b);
		System.out.println("substaction of numbers is "+substaction.perform(110, 12));
		
		Operation multiplication = (a,b)->multiplication(a, b);
		System.out.println("multiplication of numbers is "+multiplication.perform(110, 12));
		
		Operation division = (a,b)->division(a, b);
		System.out.println("division of numbers is "+division.perform(3, 2));
    }
}
