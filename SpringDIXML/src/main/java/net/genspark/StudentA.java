package net.genspark;

public class StudentA implements Student {
	private Service service;
	
	
	
	public StudentA(Service service) {
		super();
		this.service = service;
	}



	@Override
	public void returnInfo() {
		String info = service.getInfo();
		System.out.println(info);
	}

}
