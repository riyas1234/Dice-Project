import java.util.ArrayList;
public class DiceRunner{
	public static void main(String[]args){

		//Test 1
		Die die1 = new Die();
		Die die2 = new Die();
		int counter = 0;
		die1.roll();
		die2.roll();
		for(int i = 0; i<100; i++){
			die1.roll();
			die2.roll();
			counter++;
			System.out.println(die1 +" "+ die2+"\n");
			if(die1.getValue()==1 && die2.getValue()==1)
				i=100;
		}
		System.out.println(counter);
		System.out.println();

		//Test 2

		ArrayList<Die>holder = new ArrayList<>();
		for(int i = 0; i<6; i++){
			Die die3 = new Die((int)(Math.random()*16)+4,(int)(Math.random()*6)+1);
			holder.add(die3);
			System.out.println(holder+"\n");
			System.out.println();
		}
		for(int i = 0; i<6; i++){
			holder.get(i).roll();
		}
		System.out.println();
		System.out.println(holder+"\n");
	}
}