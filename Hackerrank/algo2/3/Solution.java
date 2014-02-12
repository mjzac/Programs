import java.io.*;
import java.lang.*;
import java.util.*;
public class Solution{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		String[] xx = x.split(" ");
		int N = Integer.parseInt(xx[0]);
		int K = Integer.parseInt(xx[1]);
		x = br.readLine();
		String[] input = x.split(" ");
		int[] arr = new int[N];
		for(int i =0;i<N; i++){
			arr[i]  =  Integer.parseInt(input[i]);
		}
		Arrays.sort(arr);
		int spent = 0;
		int i=0;
		while(spent<K){
			spent += arr[i];
			i++;
		}
		System.out.println(i-1);
	}
}