package geethanjali.testcomponents;

public class Addition {
	
	public static void Fibo(int n) {
		int first=0;
		int second=1;
		int next;
		for(int i=2;i<=n;i++)
		{
			next=first+second;
			System.out.print(first+",");
			first=second;
			second=next;
		}
		
	}
	
	public static void main(String[] args) {
		int a=10;
		Fibo(a);

	}

}
