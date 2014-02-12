
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.*;
class TestClass {
    static boolean checkPrime(long n){
        int res;
        if(n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            res=(int)n%i;
            if(res==0)
            {
                return false;
            }
        }
        //System.out.println(n +" is prime!");
        return true;
    }
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //
        int size=0, maxSixe =100000000;
        List<Double> myList= new ArrayList<Double>();
        
        int total=1,primes=0,adder=2;
        for(int i=3,k=1;i<maxSixe;i+=adder,k++){
                //diaCount += 
                if(checkPrime(i)){
                    primes++;
                    //myList.add(curr);
                }
                total++;
                if(k%4==0){
                    double percent = ((double)primes/(double)total) *100.0;
                    myList.add(percent);
                    adder+=2;
                }
        }
        //System.out.println("done!");
       int testCase = Integer.parseInt(br.readLine());
       DecimalFormat df = new DecimalFormat("##.000000");
       while(testCase-->0){
        size = Integer.parseInt(br.readLine());
        System.out.println(df.format(myList.get(((size-1)/2)-1)));
       }
        
    }
}
