import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr;
        arr = new int[N];
        while(N>0){
            int val =-1;
            int initHeight =1;
            int num = Integer.parseInt(br.readLine());
            for(int cycle = 1; cycle<=num; cycle ++){
                if(val<0){
                    initHeight*=2;
                }else{
                    initHeight+=1;
                }
                val*=(-1);
            }
            arr[N-1] = initHeight;
            N--;
        } 
        for(int counter=arr.length - 1; counter >= 0;counter--){
            System.out.println(arr[counter]);
        }
    }
}