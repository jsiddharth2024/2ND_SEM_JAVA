import java.util.Scanner;

class Symmetric{
	
	public static void main(String[] args){
                System.out.println("J SIDDHARTH");
                System.out.println("SJC22MCA-2034");
                System.out.println("04-04-2023");
                System.out.println("20MCA132 , Object Oriented Programming Lab \n");
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of rows : ");
		int rows = sc.nextInt();
		
		System.out.println("enter the number of columns : ");
		int cols = sc.nextInt();
		
		int matrix[][] = new int[rows][cols];
		System.out.println("Enter the elements : ");
		for(int i=0; i<rows; i++)
			for(int j=0; j<cols; j++)
				matrix[i][j] = sc.nextInt();
		
		sc.close();
		System.out.println("Printing input matrix : ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
				System.out.print(matrix[i][j]+"\t");
			System.out.println();
		}
		
		if (rows != cols)
			System.out.println("The given matrix is not a square matix");
		else
		{
			boolean Symmetric = true;
			for(int i=0; i<rows; i++)
				for(int j=0; j<cols; j++)
					if(matrix[i][j] != matrix[j][i])
					{
						Symmetric = false;
						break;
					}
			if(Symmetric)
			{
				System.out.println("The given matrix is symmetric..");
			}
			else
			{
				System.out.println("The given matrix is not symmetric..");
			}
		}
	
	}
}
