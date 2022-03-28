package springrestq6;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Operations {

	@RequestMapping(value = "/Add", method = RequestMethod.GET)
	public String Add(@RequestParam long firstNum, @RequestParam long secondNum) {
		long Sum = firstNum + secondNum;
		return "Sum of two Number " + firstNum + " and " + secondNum + " = " + Sum;
	}

	@RequestMapping(value = "/Sub", method = RequestMethod.GET)
	public String Sub(@RequestParam long firstNum, @RequestParam long secondNum) {
		long Sum = firstNum - secondNum;
		return "Substraction of two Number " + firstNum + " and " + secondNum + " = " + Sum;
	}

	@RequestMapping(value = "/Mul", method = RequestMethod.GET)
	public String Mul(@RequestParam long firstNum, @RequestParam long secondNum) {
		long Sum = firstNum * secondNum;
		return "Multiple of two Number " + firstNum + " and " + secondNum + " = " + Sum;
	}

	@RequestMapping(value = "/Div", method = RequestMethod.GET)
	public String Div(@RequestParam long firstNum, @RequestParam long secondNum) {
		long Sum = firstNum / secondNum;
		return "Sum of two Number " + firstNum + " and " + secondNum + " = " + Sum;
	}

	@RequestMapping(value = "/Pow", method = RequestMethod.GET)
	public String Pow(@RequestParam long firstNum, @RequestParam long secondNum) {
		long Sum = (long) Math.pow(firstNum, secondNum);
		return "Sum of two Number " + firstNum + " and " + secondNum + " = " + Sum;
	}

}
