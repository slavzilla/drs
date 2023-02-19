package excercise1;

import java.util.Random;

public class Player {
	int dice1;
	int dice2;
	
	public int getDice1() {
		return dice1;
	}
	public void setDice1(int dice1) {
		this.dice1 = dice1;
	}
	public int getDice2() {
		return dice2;
	}
	public void setDice2(int dice2) {
		this.dice2 = dice2;
	}
	public int getDiceSum()
	{
		return dice1 + dice2;
	}
	
	public void throwDice()
	{
		Random rand = new Random();
		setDice1(1 + rand.nextInt(6));
		setDice2(1 + rand.nextInt(6));
	}

}
