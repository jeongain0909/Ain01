import java.util.Scanner;
public class 두번째문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int map [] = new int[10];
		
		int b = 0;
		map [b] = 1;
		for (int a=0; a<map.length;a++) {
			System.out.print(map[a]+" ");
		}
		int c=0;
		while(true) {
			System.out.println("입력");
			
			int input = s.nextInt();
			map[c]=0;
			
			if(input==1) {
				
				b=b+1;
				c++;
				if(b>9) {
					b=0;
				}
			}
			else if (input == -1) {
				b=b-1;
				c--;
			}
			map[b]=1;
			for (int a=0; a<map.length; a++) {
				System.out.print(map[a]+" ");
			}
		}
				
	}

}
