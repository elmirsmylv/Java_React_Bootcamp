package interfacesDemo;

public class MongoDB implements IDatabase{
	
	@Override
	public void add() {
		System.out.println("MongoDB ekleme");
		
	}

	@Override
	public void delete() {
		System.out.println("MongoDB silme");
		
	}

	@Override
	public void get() {
		System.out.println("MongoDB getirme");
		
	}

	@Override
	public void update() {
		System.out.println("MongoDB guncelleme");
	}

}
