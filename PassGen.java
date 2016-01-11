import java.util.Random;

public class PassGen {

	public static void main(String[] args) {
		
		String finalPass = new String();
		
		Random rand = new Random();		
		//randomly generating length of password between 8 and 16 chars
		int randomNum = rand.nextInt((16 - 8) + 1) + 8;
		
		//randomly generate the characters
		for (int i = 1; i <= randomNum; i++){
			
			//generate the first random number to determine if the letter will be a special char (ASCII 33-47,58-64,91-96,123-126), a number (ascii 48-57),
			//a capital letter (ASCII 65-90), or a lower case letter (ASCII 97-122)
			int randomFirst = rand.nextInt((4 - 1) + 1) + 1;
			
			//if random number is a special char
			if (randomFirst==1){
				int midFirst = rand.nextInt((4 - 1) + 1) + 1;
				if (midFirst==1){
					int randomFinal = rand.nextInt((47 - 33) + 1) + 33;
					finalPass += (char)randomFinal;
				}else if (midFirst==2){
					int randomFinal = rand.nextInt((64 - 58) + 1) + 58;
					finalPass += (char)randomFinal;
				}else if (midFirst==3){
					int randomFinal = rand.nextInt((96 - 91) + 1) +91;
					finalPass += (char)randomFinal;
				}else if (midFirst==4){
					int randomFinal = rand.nextInt((126 - 123) + 1) + 126;
					finalPass += (char)randomFinal;
				}
				//if random number is a number
			}else if (randomFirst==2){
				int randomFinal = rand.nextInt((57 - 48) + 1) + 48;
				finalPass += (char)randomFinal;
				//if random number is a upper case letter
			}else if (randomFirst==3){
				int randomFinal = rand.nextInt((90 - 65) + 1) + 65;
				finalPass += (char)randomFinal;
				//if random number is a lower case letter
			}else if (randomFirst==4){
				int randomFinal = rand.nextInt((122 - 97) + 1) + 97;
				finalPass += (char)randomFinal;
			}
		}
		
		System.out.println(finalPass);
		
	}
}