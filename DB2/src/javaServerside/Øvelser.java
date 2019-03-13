package javaServerside;

public class Øvelser {
	
	private int øvelsesID;
	private String navn;
	private int prestasjon;
	

	public Øvelser(int øvelsesID, String navn, int prestasjon) {
		this.øvelsesID = øvelsesID;
		this.navn = navn;
		this.prestasjon = prestasjon;
	}
	
	public int getØvelsesID() {
		return øvelsesID;
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


class Apparatøvelse extends Øvelser {
	
	private int apparatID;
	
	public Apparatøvelse(int øvelsesID, String navn, int prestasjon, int apparatID) {
		super(øvelsesID, navn, prestasjon);
		this.apparatID = apparatID;
	}

	public int getApparatID() {
		return apparatID;
	}

	public void setApparatID(int apparatID) {
		this.apparatID = apparatID;
	}	
}


class Friøvelse extends Øvelser {
	
	private String beskrivelse;
	
	public Friøvelse(int øvelsesID, String navn, int prestasjon, String beskrivelse) {
		super(øvelsesID, navn, prestasjon);
		this.beskrivelse = beskrivelse;
	}

	public String getBeskrivelse() {
		return beskrivelse;
	}

	public void setBeskrivelse(String beskrivelse) {
		this.beskrivelse = beskrivelse;
	}
}