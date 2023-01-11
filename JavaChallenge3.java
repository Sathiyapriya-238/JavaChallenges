package week3.day2;

public class JavaChallenge3 {

	public static void main(String[] args) {
		String s="A man, a plan,a canal: Panama",revValue="";
		String lowerCase = s.toLowerCase();
		String replaceAll = lowerCase.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("String after replace: "+replaceAll);
		for (int i = replaceAll.length()-1; i>=0; i--) {
			revValue = revValue + replaceAll.charAt(i);
		}
		if(replaceAll.equals(revValue)) {
			System.out.println(s+" is a palindrome");
		}
		else {
			System.out.println(s+ " is not a palindrome");
		}
	}

}
