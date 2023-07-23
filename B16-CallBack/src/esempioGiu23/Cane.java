package esempioGiu23;

/**
 * Modella un cane e i suoi comportamenti
 */
public class Cane {
	/**
	 * Ottiene se il cane ha abbiato o no
	 * @return callBack
	 */
	public CaneCallBack getCallBack() {
		return callBack;
	}

	/**
	 * Associa se un cane ha abbiato
	 * @param callBack
	 */
	public void setCallBack(CaneCallBack callBack) {
		this.callBack = callBack;
	}
	
	/**
	 * Il cane che abbaia
	 */
	public void abbaia() {
		System.out.println("Il cane abbaia...");
		if(callBack!=null)
			callBack.onAbbaia();
	}

	private CaneCallBack callBack;
}
