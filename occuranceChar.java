import java.util.Scanner;
public class occuranceChar {
    public static int occurance(String s,char c){
        String s1=s;
        char key=c;
        int count=0;
        for(int i=0;i<s1.length();i++){
            char s2=s1.charAt(i);
            if(s2==key){
                count++;
            }
        } 
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  the string: ");
        String s=sc.nextLine();
        System.out.println("enter  the Character: ");
        String c=sc.nextLine();
        if(c.length()!=1){
            System.out.println("please enter a Character");
        }
        else{
            char Character1=c.charAt(0);
            int res= occurance(s,Character1);
            System.out.println("occurance : "+res);
       
        }

        sc.close();
    }
    
}
