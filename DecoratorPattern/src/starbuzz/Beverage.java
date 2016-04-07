package starbuzz;

public abstract class Beverage {
	public enum Size { TALL, GRANDE, VENTI };
	Size size = Size.TALL;
	protected String description = "제목 없음";
	public String getDescription(){
		return description;
	}
	
	public void setSize(Size size) {
		this.size = size;
		description += " "+size;
	}
	public Size getSize() {
		return size;
	}
	
	public abstract double cost();
}
