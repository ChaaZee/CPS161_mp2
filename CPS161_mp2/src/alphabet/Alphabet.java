package alphabet;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int letter = 0;
		
		while(letter < alphabet.length) {
			if(alphabet[letter] == "a" || alphabet[letter] == "e" || alphabet[letter] == "i" || alphabet[letter] == "o" || alphabet[letter] == "u" || alphabet[letter] == "y") {
				System.out.println(alphabet[letter] + " is a vowel");
			} else {
				System.out.println(alphabet[letter] + " is a constant");
			}
			
			letter += 1;
		}
	}

}
