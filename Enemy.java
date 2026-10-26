
public class Enemy implements Stompable, Comparable<Object>{
private String name;
private int health;

public Enemy (String name, int health) {
	super();
	this.name = name;
	this.health = health;
}
public Enemy (String name) {
	this(name,100);
}

//getters and setters
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public int getHealth() {
	return health;
}
public void setHealth(int health) {
	this.health = health;
}

public String toString() {
	String healthBar = " ";
	for(int i=0; i<health/10+1; i++)
		healthBar += "-";
	return name + ", health: " +health + " " + healthBar;
}



@Override
public int stomp() {
	health = health -25;
	return health;
}
@Override
public int stomp(int amount) {
	health = health - amount;
	return health;
}
@Override
public int compareTo(Object o) {
	return this.health - ((Enemy) o).getHealth();
	
}

}
