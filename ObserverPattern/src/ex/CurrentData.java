package ex;

import java.util.ArrayList;

public class CurrentData implements Subject{
	private ArrayList<Observer> observers;
	private int currentNum;
	public CurrentData() {
		observers = new ArrayList<Observer>();
	}
	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}
	@Override
	public void delObserver(Observer o) {
		observers.remove(o);
	}
	@Override
	public void notifyObservers() {
		for(int i=0; i<observers.size(); i++){
			Observer observer = observers.get(i);
			observer.update(currentNum);
		}
	}
	
	public void numChanged() {
		notifyObservers();
	}
	public void setNum(int num) {
		currentNum = num;
		numChanged();
	}
}
