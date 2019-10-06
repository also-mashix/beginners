package com.techelevator.parser;

public class Parser {

	public static void main(String[] args) {

		Encrypted e = new Encrypted("3127162:261111", "TUY-7.4/1", "DPOG5");

		Encrypted answer = e.decryptAll(e);

		System.out.println("Ecrypted Message:\n" + e.getFirstLine() + "\n" + e.getSecondLine() + "\n" + e.getThirdLine() + "\n");
		System.out.println("Decrypted Message:\n" + answer.getFirstLine() + "\n" + answer.getSecondLine() + "\n" + answer.getThirdLine() + "\n");
		
		String secretValue = "";
		
		String[] sub = answer.getSecondLine().split("-");
		
		secretValue = sub[sub.length-1];

		System.out.println("\nExtracted value is:  " + secretValue);
		
		
		
// 		3127162:261111
//		TUY-7.4/1
//		DPOG5
//
//		Each character in this string has been encrypted by increasing the ASCII value 
//		of original character by 1. So when decrypted, the lines look like this:
//
//		20160519150000
//		STX,6-3.0
//		CONF4
//		We need to decrypt the encrypted string and then extract the value 3.0 from the second line.
	}

}
