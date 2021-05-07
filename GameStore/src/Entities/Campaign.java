package Entities;

public class Campaign {
	
	private int id;
	private String name;
	private int inception;
	private int finish;
	
	public Campaign() {}
	
	public Campaign(int id, String name, int inception, int finish) {
		this.id = id;
		this.name = name;
		this.inception = inception;
		this.finish = finish;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getInception() {
		return inception;
	}
	public void setInception(int inception) {
		this.inception = inception;
	}
	
	public int getFinish() {
		return finish;
	}
	public void setFinish(int finish) {
		this.finish = finish;
	}
}
