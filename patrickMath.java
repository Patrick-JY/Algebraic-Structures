import java.lang.Math.*;
public class patrickMath{
	public static int factorial(int number){
		//using the naive method since the efficiency of the complicated method doesn't affect integers
		if (number == 1 || number == 0){
			return 1;
		}
		for (int i = (number-1); i > 0; i--){
			number *= i;
		}
		return number;
	}

}