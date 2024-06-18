import java.util.*;
public class numpalindrome14
{   
    public static boolean isPalindrome(int num){
        int temp=num;
        int sum=0;
        int rev;
        if(num<0){
            
            return false;
        }
        else{
            while(num>0){
                rev=num%10;
                sum=sum*10+rev;
                num=num/10;
            }
            if(sum==temp){
                return true;
            }
            else{
               return false;
            }
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter your number: ");
	    int num=sc.nextInt();
		boolean b=isPalindrome(num);
		System.out.println(b);
        sc.close();
	}
}