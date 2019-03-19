class MatrixMultiplicationException extends RuntimeException {
	private Matrix matrixa;
	private Matrix matrixb;

	public MatrixMultiplicationException(Matrix matrixa, Matrix matrixb){
		this.matrixa = matrixa;
		this.matrixb = matrixb;
	}

	public String message(){
		return "Invalid Multiplication, The first matrix does not have a column number that matches the second matrix's row number";
	}
}