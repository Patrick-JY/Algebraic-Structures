class MiscMath {
/*
	public static int factorial(int number){
		//currently not very efficient (in fact Im sure its worse than the naive method) just need to figure the jist of it first
		//Predefining the table of primes (up to 100 for now) since its not like they change...
		//ok in the normal one I will use the naive approach however I shall finish this for the sake of it
		//not so sure we need this...
		int[] primetable = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
		if(number == 0 || number == 1){
			return 1;
		}
		List<Integer> primeFactorList = primeFactors(number);
		Collections.sort(primeFactorList);
		Map<Integer,Integer> primeExponents = new HashMap<Integer,Integer>();

		for (int i = 0; i<primetable.length;i++){
			if(primeFactorList.get(primeFactorList.size()-1) < primetable[i]){
				break;
			}
			final int prime = primetable[i];
			primeExponents.put(primetable[i],(int)primeFactorList.stream().filter(a -> a == prime).count());
		}
		long[] digits = new long[(int)(Math.log10(number)+1)];

		for (int i = 0; i < digits.length; i++){
			int c = 1;
			long a = 0;
			long pow2 = (long) Math.pow(2,(i+1));
			for (int j = 0; j<primeExponents.size(); j++){
				while(pow2 * c < convertToBinary(primeExponents.get(j))){
					if (pow2 %)
				}
			}

		}


		return primeExponents.get(2);

	}

	public static List<Integer> primeFactors(int number){
		int n = number;
		List<Integer> factors = new ArrayList<Integer>();
		for (int i = 2; i < n/i; i++){
			
			while (n % i == 0){
				factors.add(i);
				n /= i;
			}
		}
		if (n > 1) {
			factors.add(n);
		}
		return factors;
	}
	public static long convertToBinary(int n){
		int a = 0;
		String x = "";
		while(n > 0){
			a = n % 2;
			x += " " + a;
			n = n/2;
		}
		return Long.parseLong(x);
	} */
}