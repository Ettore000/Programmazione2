package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class TransazioneOnline extends Transazione {
	public TransazioneOnline(int id, String data, String ip) {
		super(id, data);
		this.ip = ip;
	}

	public String getIp() {
		return ip;
	}

	private String ip;
}
