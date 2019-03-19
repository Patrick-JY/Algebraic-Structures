
//may at some point make the group hierachy more involved
public class SymmetricGroup extends Group<Permutation>{

	private int amountOfElements;
	private Permutation[] groupElements;
	private Permutation identity;
	//this is the amount of elements in the set that has the permutations acting on it.
	
	public SymmetricGroup (int amountOfElements){
		this.amountOfElements = amountOfElements;
		groupElements = new Permutation[Main.factorial(amountOfElements)];
		//generating the elements of the group
		if(amountOfElements < 1){
			throw new InvalidSizeException();
		}
		else {
			int[] baseArr = new int[amountOfElements];
			for (int i = 0; i<amountOfElements; i++){
				baseArr[i] = i+1;
			}
			Permutation identity = new Permutation(baseArr);
			this.identity = identity;
			//For this I am implementing the SteinHaus-Johnson-Trotter Algorithm (May also implement Even's speedup in future)
			
			

			
			
			for (int i = 0; i < Main.factorial(amountOfElements); i++ ){
				if (i == 0){
					baseArr = permute(true,baseArr,amountOfElements);

				}else{
					baseArr = permute(false,baseArr,amountOfElements);
				}
				groupElements[i] = new Permutation(baseArr);
			}




		}
	}
	static int elementnum = amountOfElements;
	static int[] p = new int[elementnum];
	static int[] d = new int[elementnum];
	public static int[] permute(boolean first,int[] x,int n){
		//note this is direct from the papers pseudo code I will clean it up later
		
		int k;
		int q;
		int t;

		if (first){
			for (int i = 1; i< n; i++){
				p[i] = 0;
				d[i] = 1;
			}
		}
		k = -1;
		while (true){
			q = p[n-1] + d[n-1];
			p[n-1] = q;
			if (q == n){
				d[n-1] = -1;
			}
			else if (q > 1){
				q = q + k;
				t = x[q-1];
				x[q-1] = x[q];
				x[q] = t;
				break;
			}
			d[n-1] = 1;
			k = k + 1;
			if (n > 2){
				n = n-1;
			}
		}
		
			
		

		return x;
		
	}

	public Permutation getIdentity(){
		return this.identity;
	}

	public Permutation getInverse(Permutation object){
		return null;
	}

	public Permutation operation(Permutation object1, Permutation object2){
		return null;
	}




}