import java.util.ArrayList;
public class DiceHolder{

	private ArrayList <Die> holder;

	//Instance variable
	Die die = new Die();

	//default constructor
	public DiceHolder(){
		holder = new ArrayList <Die>();
	}
	//Adding the dice method
	public int addDie(Die die){
		if(holder.size()!=6){
			holder.add(die);
			return 1;
	}
		return -1;
	}
	//Shaking all the dice method
	public void shake(){
		for(int i = 0; i<holder.size(); i++){
			holder.get(i).roll();

		}

	}
	//output
	public String toString(){
		for(int i = 0; i<holder.size(); i++)
			System.out.println(holder.get(i)+"\n");
			return "";
	}

}