package restq3;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Zipcode {
	DetailsRepo repo = new DetailsRepo();

	@RequestMapping(value = "/zipcodes", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public List<ZipcodeDetails> zipcodes() {
		return repo.getZipcodes();
	}

	@RequestMapping(value = "/zipcode/{zipcode}", method = RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public ZipcodeDetails zipcode(@PathVariable("zipcode") long zip) {
		return repo.getZipcodeDetails(zip);

	}

}
