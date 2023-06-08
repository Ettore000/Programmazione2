package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Transazione {
	public Transazione(int id, int data) {
		this.id=id;
		this.data=data;
	}
	
	public int getId() {
		return id;
	}

	public int getData() {
		return data;
	}

	private int id, data;
}
