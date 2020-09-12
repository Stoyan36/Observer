package stoyan;


public interface Horse {
	public void register(Observer obs);
	public void unregister(Observer obs);
	
	public void notifyObservers();
	
	public Object getUpdate(Observer obs);

}
