
public class Permutation {

	private int[] permArray;
	

	public Permutation(int[] permArray){
		this.permArray = permArray;
	}

	/*

		1	2	3	4
		
		|	|	|	| ---> various bijections

		3	1	2	4 ---> this is the array

	permutations are in this form.
	
	*/
	public int[] getArr(){
		return permArray;
	}
	public String toString(){
		String container = "( ";
		for (int i = 0; i < this.permArray.length; i++){
			container += this.permArray[i] + " ";
		}
		container += ")";
		return container;

	}

	//thanks glen for the made up name... (I have no idea what disorderness is actually called)
	public int disorderness(){
		int disorder = 0;
		for (int i = 0; i < this.permArray.length;i++) {
			for (int j = i+1; j<this.permArray.length; j++){
				if(this.permArray[i] > this.permArray[j]){
					disorder++;
				}
			}
		}
		return disorder;
	}

	public int signature(){
		int disorder = this.disorderness();
		if (disorder%2 == 0){
			return 1;
		}
		else {
			return -1;
		}
	}

	public int getElement(int index){
		return permArray[index];
	}




}