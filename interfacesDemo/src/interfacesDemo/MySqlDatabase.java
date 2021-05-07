package interfacesDemo;

public class MySqlDatabase implements IDatabase{

	@Override
	public void add() {
		System.out.println("MySql ekleme");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql silme");
		
	}

	@Override
	public void get() {
		System.out.println("MySql getirme");
		
	}

	@Override
	public void update() {
		System.out.println("MySql guncelleme");
	}
	

}
