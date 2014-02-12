import java.io.*;
import java.lang.*;
import java.util.*;
public class Solution{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases=0,i,j;
		String second,rowA,rowB;
		String[] A;
		String[] B;
		int[] intA;
		int[] intB;
		int N,K;
		cases = Integer.parseInt(br.readLine());
		String res[] = new String[cases];
		for(i = 0; i<cases; i++)
			res[i] = "YES";
		for(i = 0; i < cases; i++){
			second = br.readLine();
			String[] x = second.split(" ");
			N = Integer.parseInt(x[0]);
			intA = new int[N];
			intB = new int[N];
			K = Integer.parseInt(x[1]);
			rowA = br.readLine();
			A = rowA.split(" ");
			rowB = br.readLine();
			B = rowB.split(" ");
			for (j= 0; j<N; j++){
				intA[j] = Integer.parseInt(A[j]);
				intB[j] = Integer.parseInt(B[j]);
			}
			Arrays.sort(intA);
			Arrays.sort(intB);
			for(j=0;j<=N-1;j++){
				if(intA[j]+intB[N-1-j]<K){
					res[i] = "NO";
					break;
				}
			}
		}
		for( i=0;i<cases;i++)
			System.out.println(res[i]);
	}
}