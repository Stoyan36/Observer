package stoyan;

public class Gamer implements Observer {
	
	private String name;
	private Horse game;
	
	public Gamer(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
String message = (String) this.game.getUpdate(this);
		
		System.out.println("Observer: " + this.name + " Horse is eating. " 
		+ "Message:" + message);
	}

	@Override
	public void setHorse(Horse horse) {
		// TODO Auto-generated method stub
		this.game = horse;
	}

	}


