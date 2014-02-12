import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T,N,C,M,count = 0,wrappers=0;
        T = scanner.nextInt();
        int[] res = new int[T];
        int i=0;
        while(T>0){
        	N = scanner.nextInt();
        	C = scanner.nextInt();
        	M = scanner.nextInt();
        	wrappers = N/C;
        	count = wrappers;
        	while(wrappers>=M){
        		count = count+1;
        		wrappers = (wrappers+1)-M;
        	}
        	res[i] = count;
        	count =0;
        	i++;
        	T--;
        }
        for(int result :res)
        	System.out.println(result);

    }
}