import java.math.*;
public class Matrix {
	private int rownum;
	private int colnum;
	private double[][] matrixArray;
	//private SymmetricGroup symGroup = null;

	//creates an the empty matrix with specified dimensions.
	//and if its a square matrix it makes it the identity matrix
	public Matrix(int rownum,int colnum){
		if(rownum == colnum){
			
		}
		this.rownum = rownum;
		this.colnum = colnum;
		this.matrixArray = new double[rownum][colnum];
	}
	//populates all the values based on the predefined array
	public Matrix(double[][] matrixArray){
		this.rownum = matrixArray.length;
		this.colnum = matrixArray[0].length;

		/*if(this.rownum == this.colnum){
			symGroup = new SymmetricGroup(rownum);
		}*/
		this.matrixArray = matrixArray;
	}

	public void arrayToMatrix(double[][] matrixArray){
		this.matrixArray = matrixArray;
	}

	public double[][] matrixToArray(){
		return this.matrixArray;
	}

	//remember matrix multiplication is not abelian/commutative

	public boolean canBeMultiplied(Matrix matrixB){
		if(this.colnum == matrixB.getRowNum()){
			return true;
		}else{
			return false;
		}
	}

	public Matrix multiply(Matrix matrixB) throws MatrixMultiplicationException {
		if(this.colnum == matrixB.getRowNum()){
			double[][] multipliedArr = new double[this.rownum][matrixB.getColNum()];
			for (int i = 0; i < this.rownum; i++){
				for (int j = 0; j< matrixB.getColNum(); j++){
					double value = 0;
					for (int k = 0; k < this.colnum; k++){
						value += this.matrixArray[i][k] * matrixB.getValue(k,j);
					}
					multipliedArr[i][j] = value;
				}
			}
			return new Matrix(multipliedArr);
		}
		else{
			throw new MatrixMultiplicationException(this,matrixB);
		}
		
	}


	public Matrix add(Matrix matrixB) throws MatrixAdditionException{
		double[][] additionArr = new double[this.rownum][this.colnum];
		if (matrixB.getRowNum() != this.rownum || matrixB.getColNum() != this.colnum){
			throw new MatrixAdditionException();
		}
		else {
			for (int i = 0; i< this.rownum; i++){
				for (int j = 0; j < this.colnum; j++){
					additionArr[i][j] = this.matrixArray[i][j] + matrixB.getValue(i,j);
				}
			}
			return new Matrix(additionArr);
		}
	}


	public String print(){
		String container = "";
		for (int i = 0; i < this.rownum; i++){
			for (int j = 0; j < this.colnum; j++){
				container += this.matrixArray[i][j] + " ";
			}
			container += "\n";
		}
		return container;
	}


	public int getRowNum(){
		return this.rownum;
	}
	public int getColNum(){
		return this.colnum;
	}

	public double getValue(int rowCoord, int colCoord){
		return this.matrixArray[rowCoord][colCoord];
	}

	
	//going to use LU decomposition
	public BigDecimal getDeterminant(){

	}




	//this function is purely for interesting purposes, its actually a pretty bad algorithm when it comes to run time
	public BigDecimal getDeterminant(SymmetricGroup symGroup){
		if(rownum != colnum){
			throw new NoDeterminantException();
		}
		else{
			BigDecimal det = new BigDecimal(0);
			for (int i = 0; i<symGroup.getSize();i++){
				BigDecimal temp = new BigDecimal(1);
				Permutation theta = symGroup.getElement(i);
				for(int j = 0; j<rownum;j++){
					temp = temp.multiply(new BigDecimal(matrixArray[j][theta.getElement(j)-1])); //because computer science likes to count from 0
				}
				if(theta.signature() == -1){
					temp = temp.negate();
				}
				det = det.add(temp);

				
			}
			return det;
		}
		
	}



























}