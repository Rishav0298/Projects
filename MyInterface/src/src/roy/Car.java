package src.roy;

public abstract class Car implements Interface1,Interface2 {
	private String name;
	private int maxspeed;
	
	public Car() {}
	public Car(String name,int maxspeed) 
	{
		super();
		this.maxspeed=maxspeed;
		this.name=name;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxspeed() {
		return maxspeed;
	}
	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}
	
	@Override
	public abstract  void greetings(); 
	
}
