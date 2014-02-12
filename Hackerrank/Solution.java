import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double num;
        double sum = 0, prob;
        while(N>0){
        	num = Double.parseDouble(br.readLine());
        	//prob = (num/2);
        	sum+=num;
        	N--;
        } 
        sum/=2;
        System.out.printf("%.1f", sum);
    }
}