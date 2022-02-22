import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
int AuthorID();
String Author()default"None";
String Supervisor() default"None";
String Date();
String Time();
String Version();
String Description() default"NA";
}
@info(AuthorID=2244,Author="Ayushman jha",Date="22-02-2022",Time="10:21",Version="Java 8")
class developer{
	void dev() {
		System.out.println("Hi");
	}
}
public class AnnotationQ2 {
	public static void main(String[] args) {
	developer s = new developer();
	s.dev();
    @SuppressWarnings("rawtypes")
	Class a = s.getClass();
    @SuppressWarnings("unchecked")
	java.lang.annotation.Annotation p = a.getAnnotation(info.class);
    info i = (info)p;
    System.out.println(i);

}
}