import java.util.*;
public class anagram {
    public static boolean IsAnagram(String s1,String s2){
        String str1=s1.replaceAll("\\s","").toLowerCase();
        String str2=s2.replaceAll("\\s","").toLowerCase();
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(str1.length()!=str2.length()){
            return false;
        }
        else{
            return Arrays.equals(ch1, ch2);
        }

    }
    public static void main(String[] args) {
       boolean res= IsAnagram("this is priya","priya is this");
        //System.out.println(res);
        if(res==true)
            System.out.println("given strings are anagrams");
        
        else
             System.out.println("given strings are not anagrams");
    }
}
