import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Collections;
import java.lang.Math.*;

public class Main {

	public static void main(String[] args){
		/*Right now this is just test code*/

		double[][] arrA = {{1,2},{3,4}};
		double[][] arrB = {{2,3,2},{4,5,2}};
		Matrix matrixA = new Matrix(arrA);
		Matrix matrixB = new Matrix(arrB);
		//System.out.println(matrixA.getColNum() + " " + matrixB.getRowNum());
		try{
			Matrix matrixC = matrixA.multiply(matrixB);
			System.out.println(matrixC.print());
		}catch(MatrixMultiplicationException e){
			System.out.println(e.message());
		}
		Matrix matrixD = matrixA.add(matrixA);
		System.out.println(matrixD.print());

		int[] permarr1 = {3,4,2,1};

		Permutation perm1 = new Permutation(permarr1);

		System.out.println(patrickMath.factorial(10));

		SymmetricGroup s3 = new SymmetricGroup(3);





	}

	





}