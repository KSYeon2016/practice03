package prob3;

public class Prob3 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		int len = str.length();
		char[] reStr = new char[len];
		for(int i = 0; i < len; i++){
			reStr[len-1-i] = str.charAt(i);
		}
		return reStr;
	}
	
	public static void printCharArray(char[] array){
		System.out.println(array);
	}
}
