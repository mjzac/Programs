import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String vaccines = br.readLine();
        String[] vac = vaccines.split(" ");
        String patients= br.readLine();
        String[] pat = patients.split(" ");  
        int[] vacValue = new int[N];
        int[] patValue = new int[N];
        boolean flag =true;
        for(int i =0;i <N ; i++){
        	vacValue[i] = Integer.parseInt(vac[i]);
        	patValue[i] = Integer.parseInt(pat[i]);
        	if(vacValue[i]<patValue[i]){
        		flag = false;
        		break;
        	}
        }
        if(flag){
        	System.out.println("Yes");
        }else{
        	System.out.println("No");
        }
    }
}
