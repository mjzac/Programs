import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        System.out.println(findTrailingZeros(N));
    }
    public  static  int  findTrailingZeros(int  number)  {
    	int count = 0;
    	if(number == 5){
    		return 1; 
    	}
    	for ( int j = 5; number/j >= 1; j *= 5 ){
    		count  +=  number  /  j;
    	}
    	return count;
    }
}
