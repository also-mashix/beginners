package com.techelevator.parser;

public class Encrypted {
	private String firstLine;
	private String secondLine;
	private String thirdLine;

	public Encrypted() {
		this("First Line", "Second Line", "Third Line");
	}

	public Encrypted(String firstLine, String secondLine, String thirdLine) {
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.thirdLine = thirdLine;
	}

	public Encrypted decryptAll(Encrypted e) {
		String firstLineDecrypted = decryptLine(e.getFirstLine());
		String secondLineDecrypted = decryptLine(e.getSecondLine());
		String thirdLineDecrypted = decryptLine(e.getThirdLine());

		Encrypted decrypted = new Encrypted(firstLineDecrypted, secondLineDecrypted, thirdLineDecrypted);
		return decrypted;
	}

	private String decryptLine(String oneLine) {
		String translatedLine = "";
		for (int i = 0; i < oneLine.length(); i++) {
			char charax = oneLine.charAt(i);
			charax = (char) (((int) charax) - 1);
			translatedLine = translatedLine + charax;
		}
		return translatedLine;
	}

	public String getFirstLine() {
		return firstLine;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public String getThirdLine() {
		return thirdLine;
	}

}
