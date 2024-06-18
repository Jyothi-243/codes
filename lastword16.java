import java.util.*;
public class lastword16
{   
    public static int lengthOfLastWord(String strs){
        strs=strs.trim();
        String[] arr=strs.split(" ");
        int size=arr.length;
         String lastWord=arr[size-1];
         return lastWord.length();
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the string: ");
	    String strs=sc.nextLine();
		int res=lengthOfLastWord(strs);
		System.out.println(res);
        sc.close();
	}
}