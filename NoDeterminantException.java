public class NoDeterminantException extends RuntimeException {
	public String message(){
		return "Only Square matrices have determinants";
	}
}