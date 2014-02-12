import java.io.*;
import java.lang.*;
public class Solution{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size=0,p=0,c=0,i,j;
		size = Integer.parseInt(br.readLine());
		String[] grid = new String[size];
		int m = size;
		int item= 'p';
		String bt = br.readLine();
		String[] bot = bt.split(" "); 
		int botRow = Integer.parseInt(bot[0]);
		int botColomn = Integer.parseInt(bot[1]);
		for(i = 0; i<m ; i++){
			grid[i] = br.readLine();
			int x= grid[i].indexOf(item);
			if(x!=-1){
				p = i;
				c = x;
			}
		}

		if(p==botRow){
			if(c>botColomn){
				System.out.println("RIGHT");
			}else{
				System.out.println("LEFT");
			}
		}else{
			if(p>botRow)
				System.out.println("DOWN");
			else
				System.out.println("UP");
		}
		//System.out.println("princess is at "+p+" position = "+c+"\n we at "+pos+","+pos);
		
	}
}