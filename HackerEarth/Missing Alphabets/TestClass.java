
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
class TestClass {
    public static ArrayList<String> res;
    static void sort(String dictionary, String[] words, int count){
        String eng = "abcdefghijklmnopqrstuvwxyz";
        String[] tempArray = new String[count];
        String temp="";
        char ch;
        int index, m=0;
        for(String x : words){
            temp = "";
            for(int l =0 ;l<x.length(); l++){
                ch = x.charAt(l);
                index = dictionary.indexOf(ch);
                temp = temp + eng.charAt(index);
            }
            tempArray[m] = temp;
            m++;
        }
        Arrays.sort(tempArray);
        for(String x : tempArray){
            temp = "";
            for(int l =0 ;l<x.length(); l++){
                ch = x.charAt(l);
                index = eng.indexOf(ch);
                temp = temp + dictionary.charAt(index);
            }
            res.add(temp);
            
        }
    }
    public static void main(String args[] ) throws Exception {
        res = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int count;
        String [] words;
        String dictionary;
        for (int i = 0; i < N; i++) {
            dictionary = br.readLine();
            count = Integer.parseInt(br.readLine());
            words = new String[count];
            for(int j =0; j<count; j++){
                words[j] = br.readLine();
            }
            sort(dictionary,words,count);
        }
        for(String x : res)
        System.out.println(x);
    }
}
