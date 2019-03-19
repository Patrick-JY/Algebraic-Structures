
//may at some point make the group hierachy more involved
public class SymmetricGroup extends Group<Permutation>{

	private int amountOfElements;
	private Permutation[] groupElements;
	private Permutation identity;
	//this is the amount of elements in the set that has the permutations acting on it.
	
	public SymmetricGroup (int amountOfElements){
		this.amountOfElements = amountOfElements;
		groupElements = new Permutation[patrickMath.factorial(amountOfElements)];
		//generating the elements of the group
		if(amountOfElements < 1 || amountOfElements > 7){
			throw new InvalidSizeException();
		}
		else {
			int[] identityarr = new int[amountOfElements];
			for(int i = 0;i < amountOfElements; i++){
				identityarr[i] = i+1;
			}
			this.identity = new Permutation(identityarr);
			heapPermutation(identityarr,amountOfElements);
			
			
		}
			
	}
	//implementing the heap permutation recursively (will look in doing it non recursively)
	static int counter = 0;
	public void heapPermutation(int[] a, int size){
		

		if(size == 1){
			
			this.groupElements[counter] = new Permutation(a.clone());
			
			/*for (int i = 0; i<a.length; i++){
				//System.out.println(i + " " + groupElements[i]);
				System.out.print(a[i]);
			}*/
			counter++;
		}

		for (int i = 0; i<size; i++){
			
			heapPermutation(a,size-1);
			if(size % 2 == 1){
				int temp = a[0];
				a[0] = a[size-1];
				a[size-1] = temp;
			}
			else {
				int temp = a[i];
				a[i] = a[size-1];
				a[size-1] = temp;
			}
		}
	}

	


	public Permutation getElement(int index){
		return groupElements[index];
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

	public String toString(){
		String container = "";
		for(int i = 0; i<groupElements.length;i++){
			//System.out.println(groupElements[i].toString());
			container += groupElements[i].toString();
			container += "\r\n";
		}
		return container;
	}
	


}