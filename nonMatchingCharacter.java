//non matching Characters in strings
import java .util.*;
public class  nonMatchingCharacter
{   public static Set<Character> nonMatching(String str1,String str2){
        Set<Character> set1=new HashSet<>();
        Set<Character> set2=new HashSet<>();
        for(char c:str1.toCharArray()){
            set1.add(c);
        }
        for(char c:str2.toCharArray()){
            set2.add(c);
        }
        Set<Character> nonMatchinginSet1=new HashSet<>(set1);
        nonMatchinginSet1.removeAll(set2);
        
        Set<Character> nonMatchinginSet2=new HashSet<>(set2);
        nonMatchinginSet2.removeAll(set1);
        
        Set<Character> nonMatchingchar=new HashSet<>(nonMatchinginSet1);
        nonMatchingchar.addAll(nonMatchinginSet2);
    
        return nonMatchingchar;
}
	public static void main(String[] args) {
	    
	Set<Character> h1=nonMatching("riya","riya");
	
	System.out.println(h1);	
		
	}
}
