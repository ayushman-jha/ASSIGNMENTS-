package restq2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
	@RequestMapping(value = "/hello-world", method = RequestMethod.GET)
	public String helloWorld() {
		return "Hello World";
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<String> details(@RequestBody Credentials cread) {
		if (cread.getUsername().equals("Ayush952") && cread.getPassword().equals("jha952"))
			return new ResponseEntity<String>("Valid User", HttpStatus.OK);
		else {
			return new ResponseEntity<String>("Invalid User", HttpStatus.OK);
		}
	}

}