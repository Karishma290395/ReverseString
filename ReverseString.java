package test5;

public class ReverseString {
	public static void main(String[] args) {
		String Country = "japan" ;
		String ReverseString = "";
		for (int i = Country.length()-1; i >= 0; i--) {
			ReverseString = ReverseString + Country.charAt(i);
		}
		System.out.print("ReverseString of Country :" + ReverseString);
	}

}
