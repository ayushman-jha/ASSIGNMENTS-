package restq3;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "zipcode" })
public class ZipcodeDetails {
	String city;
	String state;
	String contry;
	long zipcode;

	public ZipcodeDetails(String city, String state, String contry, long zipcode) {
		super();
		this.city = city;
		this.state = state;
		this.contry = contry;
		this.zipcode = zipcode;
	}

	public String getState() {
		return state;
	}

	public String getCity() {
		return city;
	}

	public String getContry() {
		return contry;
	}

	public long getZipcode() {
		return zipcode;
	}

	@Override
	public String toString() {
		return "ZipcodeDetails [state=" + state + ", city=" + city + ", contry=" + contry + ", zipcode=" + zipcode
				+ "]";
	}

}
