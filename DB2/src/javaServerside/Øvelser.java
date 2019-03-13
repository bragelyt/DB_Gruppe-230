package javaServerside;

public class �velser {
	
	private int �velsesID;
	private String navn;
	private int prestasjon;
	

	public �velser(int �velsesID, String navn, int prestasjon) {
		this.�velsesID = �velsesID;
		this.navn = navn;
		this.prestasjon = prestasjon;
	}
	
	public int get�velsesID() {
		return �velsesID;
	}
	
	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getPrestasjon() {
		return prestasjon;
	}

	public void setPrestasjon(int prestasjon) {
		this.prestasjon = prestasjon;
	}
}


class Apparat�velse extends �velser {
	
	private int apparatID;
	
	public Apparat�velse(int �velsesID, String navn, int prestasjon, int apparatID) {
		super(�velsesID, navn, prestasjon);
		this.apparatID = apparatID;
	}

	public int getApparatID() {
		return apparatID;
	}

	public void setApparatID(int apparatID) {
		this.apparatID = apparatID;
	}	
}


class Fri�velse extends �velser {
	
	private String beskrivelse;
	
	public Fri�velse(int �velsesID, String navn, int prestasjon, String beskrivelse) {
		super(�velsesID, navn, prestasjon);
		this.beskrivelse = beskrivelse;
	}

	public String getBeskrivelse() {
		return beskrivelse;
	}

	public void setBeskrivelse(String beskrivelse) {
		this.beskrivelse = beskrivelse;
	}
}