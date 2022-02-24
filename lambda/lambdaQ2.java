package lambda;
import java.util.ArrayList;
import java.util.List;
class orderDetails{
	int price;
	String status;
	public orderDetails(int price, String status) {
		super();
		this.price = price;
		this.status = status;
	}
	public int getPrice() {
		return price;
	}
	public String getStatus() {
		return status;
	}
	public String toString() {
		return "Price:"+price+" Status:"+status;
	}
	
}

public class lambdaQ2 {

	public static void main(String[] args) {
		orderDetails obj0 = new orderDetails(15000, "Accepted");
		orderDetails obj1 = new orderDetails(5000, "Accepted");
		orderDetails obj2 = new orderDetails(25000, "notAccepted");
		orderDetails obj3 = new orderDetails(2000, "notAccepted");
		orderDetails obj4 = new orderDetails(55000, "Accepted");
		orderDetails obj5 = new orderDetails(105000, "Accepted");
		
		List<orderDetails> ordrList = new ArrayList<>();
		ordrList.add(obj0);
		ordrList.add(obj1);
		ordrList.add(obj2);
		ordrList.add(obj3);
		ordrList.add(obj4);
		ordrList.add(obj5);
		
		printAll(ordrList,condition->condition.getStatus().startsWith("A") && condition.getPrice()>10000);

	}

	private static void printAll(List<orderDetails> ordrList,Condition condition) {
		// TODO Auto-generated method stub
		for(orderDetails iDetails : ordrList)
			if(condition.test(iDetails))
				System.out.println(iDetails);
		
	}

}
interface Condition{
	boolean test(orderDetails iDetails);
}