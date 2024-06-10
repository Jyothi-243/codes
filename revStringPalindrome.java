import java.util.Scanner;
// palindrome and reverse both are included
/**
 * revString
 */
public class revStringPalindrome {
    public  boolean isReverse(String s){
        String s1=s;
        String s2="";
        for(int i=0;i<s1.length();i++){
            s2=s1.charAt(i)+s2;
        }
        if(s1.equals(s2)){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        revStringPalindrome obj1=new revStringPalindrome();
        boolean res=obj1.isReverse(s);
        if(res==true){
            System.out.println("given string is palindrome");
        }
        else{
            System.out.println("given string is not a palindrome");
        }
        
    }
    
}