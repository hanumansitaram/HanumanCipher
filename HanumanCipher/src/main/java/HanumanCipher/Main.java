package HanumanCipher;

public class Main {

	public static void main(String[] args) {
		
		String message = "I want to buy 2kg of cocaine";
		int offset = 12;
		
		HanumanCipher Cipher = new HanumanCipher();
		String cipheredMessage = Cipher.Cipher(message, offset);
		
		
		System.out.println("Welcome to math encryption");
		System.out.println("Message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered Message: " + cipheredMessage);
		
		

	}

}
