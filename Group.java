/*I decided on group being an abstract class that the other group classes inherit from*/

//Group may in the future extend an even more abstract algebraic structure

//The <Type> is so I can use different types of objects for different types of Groups
public abstract class Group<Type>{

	//The basic needs of any group.
	public abstract Type getIdentity();

	public abstract Type getInverse(Type object);

	public abstract Type operation(Type object1,Type object2);

	





}