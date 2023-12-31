
public class Doctor {

	private String name;
	private String branche;
	
	public Doctor(String name, String branche) {
		this.name = name;
		this.branche = branche;
	}
	
	public String getName() {
		return name;
	}

	public String getBranche() {
		return branche;
	}
	
	public String infoDoctor() {
		return "Branş: "+branche+"\nİsim: "+name;
	}
		
}
