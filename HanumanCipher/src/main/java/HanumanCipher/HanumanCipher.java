/**
 *   ----> Ciphered -------> ? Test "What is the meaning of the universe??"
 */ 


package HanumanCipher;


public class HanumanCipher {
	
	
	public static final char LETTER_A = 'a';
	public static final char LETTER_Z = 'z';	
    
	public static final int ALPHABET_SIZE = 26;
	
	
	// The first method for encrypting the String.
	
	
	public String Cipher(String message, int offset) {
	
		
    offset %= ALPHABET_SIZE;		
    
	char[] character = message.toCharArray();
	// Calling a method defined bellow, instruction for decryption. args character and offset.
	offsetBy(character, offset);
				
		return new String(character);
	}

	private void offsetBy(char[] character, int offset) {		
/**
 * 	A method to offset the String.
 */
	// LOOP
		for (int i = 0; i < character.length; i++) {
			character[i] = offsetChar(character[i], offset, LETTER_A, LETTER_Z);
		}
		
	}

	private char offsetChar(char c, int offset, char letterA, char letterZ) {
		
		c += offset;
		
		if (c < letterA) {
			return (char) (c + ALPHABET_SIZE);
			
		};
		
		if (c > letterZ) {
			return (char) (c - ALPHABET_SIZE);
		}
		return c;
	};
	
		
}
