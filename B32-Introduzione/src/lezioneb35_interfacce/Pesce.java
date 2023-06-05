package lezioneb35_interfacce;

public class Pesce implements Preda, Predatore {

	@Override
	public void caccia() {
		System.out.println("Il pesce caccia un pesce più piccolo");
	}

	@Override
	public void scappa() {
		System.out.println("Il pesce scappa da un pesce più grande");
	}

}
