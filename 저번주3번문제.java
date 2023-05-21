import java.util.Scanner;
public class 저번주3번문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int cnt = 1;
		for (int i=3; i<=input; i++) {
			for (int j=2; j<i; j++) {
				if(i%j==0) {
					break;
				}
				if(j==i-1) {
					cnt++;
				}
				
			}
		}
		System.out.println(cnt);
	}

}
