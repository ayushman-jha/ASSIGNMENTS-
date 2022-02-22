import java.lang.annotation.*;  
import java.lang.reflect.*;  
  
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface Execute{  
int Sequence();
}  
@interface Order{
	int value();
}
class Myclass{  
@Order(value=1)
@Execute(Sequence=2) 
public void myMethod1(){System.out.println("one");}  
@Order(value=2)
@Execute(Sequence=1)
public void myMethod2() {System.out.println("Two");}
@Order(value=3)
@Execute(Sequence=3)
public void myMethod3() {System.out.println("Three");}
}  
public class AnnotationQ3 {
	public static void main(String args[])throws Exception{  
		  
		Myclass h=new Myclass();  
		Method m=h.getClass().getMethod("myMethod1");  
		Method z=h.getClass().getMethod("myMethod2");
		Method q=h.getClass().getMethod("myMethod3");  
		Execute manno=m.getAnnotation(Execute.class);
		Execute ma=z.getAnnotation(Execute.class);
		Execute no=q.getAnnotation(Execute.class);
		System.out.println(manno);  
		System.out.println(ma);
		System.out.println(no);
		}}