class MatrixAdditionException extends RuntimeException {
	public String message(){
		return "Size of the matrices need to be the same";
	}
}