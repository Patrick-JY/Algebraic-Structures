
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
			
		}
			
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