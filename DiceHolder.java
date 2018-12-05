import java.util.ArrayList;
public class DiceHolder{

	private ArrayList <Die> holder;

	Die die = new Die();

	public DiceHolder(){
		holder = new ArrayList <Die>();
	}

	public int addDie(Die die){
		if(holder.size()!=6){
			holder.add(die);
			return 1;
	}
		return -1;
	}

	public void shake(){
		for(int i = 0; i<holder.size(); i++){
			Die.roll();

		}

	}

	public String toString(){
		String print = "";
		for(int i = 0; i<holder.size(); i++)
			print += "Number of sides: "+Die.holder.getSides()+", Value: "+Die.holder.getValue();
	}

}