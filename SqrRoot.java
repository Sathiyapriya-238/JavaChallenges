package week3.day2;

public class SqrRoot {

	public static void main(String[] args) {
		int n=8,m,s;
		int l=1;
		int r=n/2;
		while(l<=r) {
			m=(l+r)/2;
			s=m*m;
			if(s>n) {
				r=m-1;
			}else  {
				l=m+1;
			}
				
			
		}
		System.out.println(r);
	}
}