package restq4;
public class CardFilter {
	public String cardValidation(long num) {
		String result = "Invalid";
		if (String.valueOf(num).length() >= 10 && String.valueOf(num).length() <= 19) {
			if (String.valueOf(num).length() == 10) {
				num = (long) (num / Math.pow(10, 10));
				if (num >= 601100 && num <= 601109 || num >= 601120 && num <= 601149 || num == 601120
						|| num >= 601177 && num <= 601179 || num >= 601186 && num <= 601199
						|| num >= 644000 && num <= 659999) {
					result = "Valid Express Card";
				} else if (num >= 510000 && num <= 559999 || num >= 222100 && num <= 272099) {
					result = "Valid Master Card";
				}
			} else if (String.valueOf(num).length() > 10) {
				num = (long) (num / Math.pow(10, String.valueOf(num).length() - 4));
				if (String.valueOf(num).charAt(0) == '3') {
					result = "Valid Visa Card";
				} else if (num >= 3528 && num <= 3589) {
					result = "Valid JCB Card";
				}
			}
		} else if (String.valueOf(num).length() == 15) {
			num = (long) (num / Math.pow(10, 11));
			if (num >= 2022 && num <= 2258) {
				result = "Valid enRoute Card";
			}
		}
		return result;
	}
}
