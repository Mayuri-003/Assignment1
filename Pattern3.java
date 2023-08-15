
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=14;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0 || j==0 || i==n-1 || j==n-1 ||  i+j<=(n-1)/2 || i==1 && j>6 ||
						i==2 && j>7 || i==3 && j>8 || i==4 && j>9 || i==5 && j>10 ||
						i==6 && j>11)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
