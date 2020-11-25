
public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {50,50,2,200,2,200};
		int firstMax=a[0];
		int secondMax=a[1];
		int size=a.length;
		for(int i=2;i<size;i++) {
			if(a[i]>firstMax) {
				secondMax=firstMax;
				firstMax=a[i];
			}
			else if(secondMax<firstMax&&firstMax!=secondMax&&a[i]>secondMax) {
				
				secondMax=a[i];
			}
			
			
		}
		System.out.println("1stMax"+" "+firstMax);
		System.out.println("2ndMax"+" "+secondMax);

	}

}
