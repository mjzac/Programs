import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] vac = line.split(" ");
        int x =  Integer.parseInt(vac[0]);
        int y =  Integer.parseInt(vac[1]);
        String res="";
        if(y>10000){
        	y%=1000;
        } 
        if(x>10000){
        	x%=1000;
        }
        res+= rec(x,y);
        int len =res.length();
        if(len >=3){
        	res = res.substring(len-3,len);
        }

        System.out.println(res);
    }
    public static int rec(int x,int y){
    	if(x==0){
    		return y+1;
    	}else if(x>0 && y==0){
    		return rec(x-1,1);
    	}else if(x >0 && y >0){
    		int temp = rec(x, y-1);
    		return rec(x-1,temp);
    	}
    	return 0;
    }
}
