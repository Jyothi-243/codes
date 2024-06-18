import java.util.*;
public class target13
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter the size of array: ");
	    int l=sc.nextInt();
		int arr[]=new int[l];
		for(int i=0;i<l;i++){
		    System.out.print("enter the element: ");
		    int a=sc.nextInt();
		    arr[i]=a;
		    }
		System.out.print("enter target: ");
		int target=sc.nextInt();
		for(int i=0;i<arr.length;i++){
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[i]+arr[j]==target){
		            System.out.println("[ "+i+","+j+" ]");
		           
		            
		        }
		    }
		}
		
	}
}