
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int commentIndex;
        String substring;
        String res="";
        String[] temp;
        do{
            line = br.readLine();
            if(line==null)
                break;
            commentIndex = line.indexOf("//");

            //System.out.println(line+"  "+commentIndex);
            if(commentIndex!=-1){
                temp = line.split("//");
                substring = temp[0];
                
                substring=substring.replace("->",".");
                //System.out.println(substring);
                substring+= line.substring(commentIndex);
            }
            else{
                substring = line;
            }
        
           res+=substring+"\n";
        }while(line!=null);
        System.out.print(res);
    }
}
