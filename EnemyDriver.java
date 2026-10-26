import java.util.ArrayList;
import java.util.Random;

public class EnemyDriver {

	public static void main(String[] args) {

		Enemy enemy1 = new Enemy ("Goomba", 100);
		System.out.println (enemy1);
		System.out.println ("Name: " + enemy1);
		System.out.println ("Health: " + enemy1.getHealth());
		
		while( enemy1.getHealth() > Stompable.DEATH);
		
		Random random = new Random();
		Enemy enemy2 = new Enemy("Enemy 2", 85);
		System.out.print(enemy2);
		
		for(int i = 0; i<10; i++) {
			enemy2.stomp(random.nextInt(25));
			System.out.println(enemy2);
		}
		
		ArrayList<Enemy> enemies = new ArrayList<Enemy>();
		
		enemies.add(new Enemy("Koopa"));
		enemies.add(new Enemy("Blooper"));
		enemies.add(new Enemy("Donkey Kong"));
		enemies.add(new Enemy("Clankers"));

		for (int i = 0; i<enemies.size(); i++) {
			enemies.get(1).stomp(random.nextInt(25));
		}

	}

}
