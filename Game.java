interface StarPlayer{
	int DURATION = 10000; //10,000 ms = 10sec
	void extraPowers();
}
// interface = abstract methods + Constants
abstract interface IPlayer{  // Interface is 100% Abstract
//interface IPlayer{
	void attack();  // public abstract void attack();
	void jump();
	void run();
	int DEFAULT_SPEED = 10;  // public static final int DEFAULT_SPEED = 10;
	int MAX_SPEED = 100;  //public static final int MAX_SPEED = 100;
}
// How to Do
class RedPlayer implements IPlayer, StarPlayer{
	int speed = DEFAULT_SPEED;
	@Override
	public void attack(){
		System.out.println("RedPlayer Kick Attack");
	}
	@Override
	public void jump(){
		System.out.println("RedPlayer Jump High");
	}
	public void run(){
		if(speed<MAX_SPEED){
			speed++;
		}
	}
	@Override
	public void extraPowers() {
		// TODO Auto-generated method stub
		
	}
}
class WhitePlayer implements IPlayer{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPlayer r = new RedPlayer(); // Upcasting
		//RedPlayer r = new RedPlayer();
		r.attack();
		r.jump();
		r.run();
	}

}
