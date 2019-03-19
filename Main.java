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
			//System.out.println(matrixC.print());
		}catch(MatrixMultiplicationException e){
			System.out.println(e.message());
		}
		Matrix matrixD = matrixA.add(matrixA);
		//System.out.println(matrixD.print());

		int[] permarr1 = {3,4,2,1,5};

		/*
			(3,4,2,1,5) (3,4,2,1,5) = (2,1,4,3,5)

		*/

		Permutation perm1 = new Permutation(permarr1);

		System.out.println(patrickMath.factorial(10));

		SymmetricGroup s3 = new SymmetricGroup(3);
		System.out.println(s3.operation(perm1,perm1));
		System.out.println(matrixA.getDeterminant());

		double[][] arrC = {{4,25,78,21},{54,212,12,12},{1234,123,12,123343},{12,34212,123,1234}};

		Matrix matrixC = new Matrix(arrC);
		System.out.println(matrixC.getDeterminant().toPlainString());




	}

	





}