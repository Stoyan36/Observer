package stoyan;

public class ObserverMain {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Game myGame = new Game();
	
	Gamer obs1 = new Gamer("Obs_1");
	Gamer obs2 = new Gamer("Obs_2");
	Gamer obs3 = new Gamer("Obs_3");
	
	myGame.register(obs1);
	myGame.register(obs2);
	myGame.register(obs3);
	
	myGame.postMessage("Horse eating");
	
}
}
