
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line,word1,word2;
        String[] words;
        int T = Integer.parseInt(br.readLine());
        //String res[] = new String[T];
        //int i=0;
        while(T-->0){
            line = br.readLine();
            words = line.split(" ");
            word1 = words[0].replace("#","");
            word2 = words[1].replace("#","");
            if(word1.equals(word2))
                System.out.println("Yes");
            else
                System.out.println("No");
            //i++;
        }
        //for(String x : res)
            //x);
    }
}
