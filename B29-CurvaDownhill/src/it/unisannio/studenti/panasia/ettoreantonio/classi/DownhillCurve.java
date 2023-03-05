package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class DownhillCurve {
	public DownhillCurve(double raggio) {
		this.raggio = raggio;
	}

	public double getRaggio() {
		return raggio;
	}
	
	public double attraversa(double velocita) {
		double velocitaMax=Math.sqrt(9.81*raggio);
		
		if(velocita>velocitaMax) {
            System.out.println("Attenzione: velocita' troppo alta per la curva!");
		}
		return velocitaMax;
	}
	
	private double raggio;
}
