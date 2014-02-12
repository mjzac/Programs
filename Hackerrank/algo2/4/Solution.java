import java.io.*;
import java.lang.*;
import java.util.*;
public class Solution{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String x = br.readLine();
		String[] xx = x.split(" ");
		int[] arr = new int[a];
		for(int i=0;i<a;i++){
			arr[i] = Integer.parseInt(xx[i]);
		}
		int b = Integer.parseInt(br.readLine());
		String x2 = br.readLine();
		String[] xx2 = x2.split(" ");
		int arr2[] = new int[b];
		for(int i=0;i<b;i++){
			arr2[i] = Integer.parseInt(xx2[i]);
		}
		int missing = b-a;
		int mnums[] = new int[missing];
		int j=0,k=0;
		for(int i=0;i<a; i++){
			if(arr[i]-arr2[i+j] !=0){
				System.out.println("i-j = "+i+"i+j = "+(i+j));
				mnums[k] = arr2[i+j];
				k++;
				j++;
				i--;
			}
		}
		Arrays.sort(mnums);
		for(int i =0 ;i<missing;i++)
			System.out.println(mnums[i]);
	}
}