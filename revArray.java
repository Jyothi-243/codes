 // reverse of an array
import java.util.*;
public class revArray
{
	public static void main(String[] args) {
		int[] arr={12,13,15,17,11,10};
		int size=arr.length;
		for(int i=0;i<arr.length/2;i++){
		    int temp=arr[i];
		    arr[i]=arr[size-i-1];
		     arr[size-i-1]=temp;
		   	}
		System.out.println(Arrays.toString(arr));
	}
}