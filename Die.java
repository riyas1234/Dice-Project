public class Die {
	private int sides;
	private int value;

	public Die (){
		sides = 6;
		value = 1;
	}

	public Die(int sides, int value){
		this.sides = sides;
		this.value = value;
	}

	public int getSides (){
		return sides;
	}

	public int getValue (){
		return value;
	}

	public void roll (){
		value = (int)(Math.random()*sides)+1;
	}

	public String toString (){
		return "Number of sides: "+sides+", Value: "+value;
	}
}