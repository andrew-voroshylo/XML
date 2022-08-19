package net.genspark;

public class ServiceA implements Service {
	
	private int id = 1;
	private String name = "Bob";
	private int ph = 42324243;
	private String add = "120 94rd";

	@Override
	public String getInfo() {
		String fullInfo = "Name:" + name + " Id:" + id + " Phone:" + ph + " Address: " + add;
		return fullInfo;
	}

}
