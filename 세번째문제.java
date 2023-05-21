import java.util.Scanner;
public class 세번째문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int map [][] = new int[5][5];
		int i=0;
		int j=0;
		map[0][0]=1;
		
		while(true) {
		for(int a=0; a<map.length; a++) {
			for(int b=0; b<map[a].length; b++) {
				System.out.print(map[a][b]);
		}
			System.out.println(" ");
		}
		int input = s.nextInt();
		if(input==1) {
		map[i][j]=0;
		j++;
		map[i][j]=1;
		}
		else if(input==-1) {
			map[i][j]=0;
			j--;
			map[i][j]=1;
		}
		else if(input==2) {
			map[i][j]=0;
			i--;
			map[i][j]=1;
		}
		else if(input==-2) {
			map[i][j]=0;
			i++;
			map[i][j]=1;
		}
		else if(input==0) {
			break;
		}
	} 
	}
}