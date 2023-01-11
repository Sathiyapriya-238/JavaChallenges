package week3.day2;

public class JavaChallenge {

	public static void main(String[] args) {
	String str="Fly me to the Moon ";
	String lastWord="";
	String[] word = str.split(" " );
	for (int i = 0; i < word.length; i++) {
		lastWord=word[word.length-1];
		if(i==word.length-1) {
			int length=word[i].length();
			System.out.println("The lastword of the string is "+lastWord);
			System.out.println("The length of the lastword is "+length);
		}
	}
	}

}
