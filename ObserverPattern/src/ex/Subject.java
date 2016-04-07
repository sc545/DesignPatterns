package ex;

public interface Subject {
	public void addObserver(Observer o);
	public void delObserver(Observer o);
	public void notifyObservers();
}
