package restq3;
import java.util.ArrayList;
import java.util.List;

public class DetailsRepo {
	List<ZipcodeDetails> zipList = new ArrayList<ZipcodeDetails>();

	public List<ZipcodeDetails> getZipcodes() {
		ZipcodeDetails code1 = new ZipcodeDetails("Kurnool", "AP", "India", 518001);
		ZipcodeDetails code2 = new ZipcodeDetails("Anantapur", "AP", "India", 515001);
		ZipcodeDetails code3 = new ZipcodeDetails("Chittor", "AP", "India", 517001);
		ZipcodeDetails code4 = new ZipcodeDetails("Guntur", "AP", "India", 522002);
		ZipcodeDetails code5 = new ZipcodeDetails("Adhoni", "AP", "India", 518301);

		zipList.add(code1);
		zipList.add(code2);
		zipList.add(code3);
		zipList.add(code4);
		zipList.add(code5);

		return zipList;
	}

	public ZipcodeDetails getZipcodeDetails(long zip) {
		// TODO Auto-generated method stub
		for (ZipcodeDetails code : zipList) {
			if (code.getZipcode() == zip)
				return code;
		}
		return null;
	}

}
