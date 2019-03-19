public class InvalidSizeException extends RuntimeException {
	public String message(){
		return "Size of the set needs to be larger than 0";
	}
}