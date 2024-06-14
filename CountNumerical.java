//How can you compute the number of numericals in a string

public class CountNumerical
{   public static int countNumericalDigits(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))==true){
                
                count++;
            }
        }
        return count;
    
}
	public static void main(String[] args) {
		System.out.println("Hello World");
		int res=countNumericalDigits("12341shtrf");
		System.out.println(res);
	}
}
