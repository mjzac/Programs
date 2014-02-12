import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
class TestClass{
    public static void main(String args[] ) throws Exception {
        ArrayList<Double> res = new ArrayList<Double>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        double l,b,h,min;
        double rad;
        for (int i = 0; i < N; i++) {
            line = br.readLine();
            String[] str = line.split(" ");
            l = Double.parseDouble(str[0]);
            b = Double.parseDouble(str[1]);
            h = Double.parseDouble(str[2]);
            min =l;
            if(b<min)
                min = b;
            if(h<min)
                min = h;
            rad = min/2;
            res.add(rad);
            
        }
        DecimalFormat df = new DecimalFormat("0.0");
        for(double x : res)
        System.out.println(df.format(x));
    }
}