package Array;
public class Ex6_2DimentinalArray 
{
	public static void main(String[] args)
	{
		//  0  1  2
		//0 10 20 30         2*3 
		//1 40 50 60
		//2 70 80 90
		
		//1: Array declaration
		int [][] ar=new int[3][3];
		
		//2: Array initialization
		ar[0][0]=10;
		ar[0][1]=20;
		ar[0][2]=30;
		ar[1][0]=40;
		ar[1][1]=50;
		ar[1][2]=60;
		ar[2][0]=70;
		ar[2][1]=80;
		ar[2][2]=90;
		
		System.out.println(ar[1][2]);
		System.out.println(ar.length);
		
		System.out.println("-----");
		
	
		for(int i=0; i<=2; i++)          		    //1: outer for loop -> rows
		{		
			for(int j=0; j<=2; j++)     		    //2: inner for loop -> cols
			{					//  1  2
				System.out.print(ar[i][j]+" ");     //3: print info using print statement
			}
			System.out.println();					//4: empty println statement
		}	
	}
}
