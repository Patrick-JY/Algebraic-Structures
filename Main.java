import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Collections;
import java.lang.Math.*;

public class Main {

	public static void main(String[] args){
		//pregenerating the symmetric groups
		SymmetricGroup[] symgroups = new SymmetricGroup[7];
		for(int i = 0; i < 7; i++){
			symgroups[i] = new SymmetricGroup(i+1);
		}

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

		
		System.out.println(symgroups[2].operation(perm1,perm1));
		System.out.println(matrixA.getDeterminant(symgroups[arrA.length-1]));

		double[][] arrC = 
		{{4,25,78,21,12,123,12},
{54,212,12,12,123,123,125},
{1234,123,12,123343,532,252,234},
{12,34212,123,1234,256,2367,212},
{12,453,345,6546,465,475,456},
{1254,345,23534,234543,345,345,345},
{3453,345346,346345,346342,23423,23543,345}};

		Matrix matrixC = new Matrix(arrC);
		System.out.println(matrixC.getDeterminant(symgroups[arrC.length-1]).toPlainString());




	}

	





}