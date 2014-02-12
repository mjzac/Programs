import java.io.*;
class TestClass{
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        line = br.readLine();
        String[] str = line.split(" ");
        int lcm = 15, three =3, five = 5;
        int x;
        String msg;
        for (int i = 0; i < N; i++) {
            x = Integer.parseInt(str[i]);
            for(int j =1; j<=x; j++){
                msg = "";
                if(j%lcm == 0)
                    msg = "FizzBuzz";
                else if (j%five == 0)
                    msg = "Buzz";
                else if(j%three == 0)
                    msg = "Fizz";
                else
                    msg = msg+j;
                System.out.println(msg);
            }
        }
    }
}