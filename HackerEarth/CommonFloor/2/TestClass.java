import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int N,W,V;
        int A[], B[];
        int maxVal=0, index, currentWeight=0;
        HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
        List<Integer> list = new ArrayList<Integer>();
        while(T-- >0){
            N= scanner.nextInt();
            W = scanner.nextInt();
            A = new int[N];
            B = new int[N];
            for(int i = 0;i<N; i++){
                A[i] = scanner.nextInt();
            }
            for(int j = 0; j< N; j++){
                B[j] = scanner.nextInt();
            }
            for(int i = 0; i<N; i++){
                map.put(B[i],A[i]);
            }
            Arrays.sort(B);
            System.out.println(map);
            int i =N-1;
            currentWeight =0;
            while(currentWeight<=W && i>=0){
                
               int max = map.get(B[i]);
                if(currentWeight+max <= W){
                    currentWeight+=max;
                    maxVal += B[i];
                    //map.remove(B[i]);
                }
                i--;
            }
            list.add(maxVal);
            maxVal =0;
        }
        for(int item : list)
            System.out.println(item);
    }
}
