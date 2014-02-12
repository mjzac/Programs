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
		for(i = 0; i<m ; i++){
			grid[i] = br.readLine();
			int x= grid[i].indexOf(item);
			if(x!=-1){
				p = i;
				c = x;
			}
		}

		int pos = (m+1)/2-1;
		//System.out.println("princess is at "+p+" position = "+c+"\n we at "+pos+","+pos);
		if(p > pos){
			//princess in lower row
			if(c > pos){
				for(i=pos,j=pos;i<m&&j<c; i++,j++){
					System.out.println("DOWN");
					System.out.println("RIGHT");
				}
			}else{
				for(i=pos,j=pos;i<m&&j>c; i++,j--){
					System.out.println("DOWN");
					System.out.println("LEFT");
				}
			}
		}else{
			//pricess in first row
			if(c > pos){
				for(i=pos,j=pos;i>=0&&j<c; i--,j++){
					System.out.println("UP");
					System.out.println("RIGHT");
				}
			}else{
				for(i=pos,j=pos;i>=0&&j>c; i--,j--){
					System.out.println("DOWN");
					System.out.println("LEFT");
				}
			}
		}
	}
}