public class Die {

	//instance variables
	private int sides;
	private int value;

	//default constructor
	public Die(){
		sides = 6;
		value = 1;
	}

	//non-default constructor
	public Die(int sides, int value){
		this.sides = sides;
		this.value = value;
	}

	//getter methods
	public int getSides(){
		return sides;
	}

	public int getValue (){
		return value;
	}

	//randomizes value
	public void roll(){
		value = (int)(Math.random()*sides)+1;
	}

	//toString
	public String toString(){
		return "Number of sides: "+sides+", Value: "+value;
	}
}