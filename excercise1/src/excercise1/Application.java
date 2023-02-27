package excercise1;

public class Application {

	public static void main(String[] args) {
		Player player1 = new Player();
		Player player2 = new Player();
		int count;
		int total = 0;
		int iter = 1000;

		for (int i = 0; i < iter; i++) {
			count = 0;
			while (true) {
				player1.throwDice();
				player2.throwDice();
				count++;
				if (player1.getDiceSum() == player2.getDiceSum())
					break;
			}
			total += count;
		}

		System.out.println("Kocke je, u prosjeku, potrebno baciti " + (double) total / iter
				+ " puta kako bismo dobili isti zbir.");
	}

}
