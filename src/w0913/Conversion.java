package w0913;

public class Conversion {

	public String rot13Convert(String message) {
		String encrypted = "";
		
		for (char c : message.toLowerCase().toCharArray()) {
			if (Character.isLetter(c)) {
				c += 13;
				if(c > 122) {
					c -= 26;
				}
			}
			encrypted += c;
		}
		
		return encrypted;
	}
	
	public long octalConvert(long decNum) {
		return Long.parseLong(Long.toOctalString(decNum));
	}
	
}
