// maximum Element in an array
public class maxinArray
{
	public static void main(String[] args) {
		int arr[]={12,13,14,11,134};
		int max=arr[0];
		int index=0;
		for(int i=1;i<arr.length;i++){
		    if(arr[i]>max){
		        max=arr[i];
		        index=i;
		    }
		}
		System.out.println(max);
		System.out.println(index);
	}
}
 
