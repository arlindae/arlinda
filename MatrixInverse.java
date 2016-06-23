// MatrixInverse2x2.

import java.math.*;
public class MatrixInverse
 { private static final double TOL =1E-15;
   public static double [][] getInverse(double[][] n)
	{  double detA=A[0][0]*A[1][1]-A[0][1]*A[1][0];
	     if(Math.abs(detA<=TOL));
		  throw new IllegalArgumentException("Matrica nuk ka inverse");
		   
	
	
	}

double m=1/detA;
Inverse[0][1] = -A[0][1]*m;
Inverse[1][0] = -A[1][0]*m;
Inverse[0][0] = A[1][1]*m;
Inverse[1][1] = A[0][0]*m;
 return inverse;

}
   public static void main (String[] args)
	{ double[][]A={[1,2],[3,4]};
	  double[][]inverse=getInverse(A);
	  System.out.println(Inverse[0][0]+" "+inverse[0][1]);
	  System.out.println(Inverse[1][0]+" "inverse[1][1]);
	 }
	
	}


