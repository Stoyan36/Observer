package stoyan;

import java.util.ArrayList;
import java.util.List;

public class Game implements Horse  {
	
	private List<Observer> observers = new ArrayList<>();
	private String message;

	@Override
	public void register(Observer obs) {
		// TODO Auto-generated method stub
		this.observers.add(obs);
		obs.setHorse(this);
		
	}

	@Override
	public void unregister(Observer obs) {
		// TODO Auto-generated method stub
		this.observers.remove(obs);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer obs: this.observers) {
			obs.update();
		}
		
	}

	@Override
	public Object getUpdate(Observer obs) {
		// TODO Auto-generated method stub
		return this.message;
	}
	
	public void postMessage(String message) {
		this.message = message;
		notifyObservers();
	}

}
