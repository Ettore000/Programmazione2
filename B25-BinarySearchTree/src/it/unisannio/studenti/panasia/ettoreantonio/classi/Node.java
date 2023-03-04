package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Node {
	//Il costruttore prende come parametro un numero intero rappresentante un oggetto
	//item in ingresso al metodo del costruttore rappresenta la nostra key
	//vengono inizializzate left e right come null
	public Node(int item) {
		this.key=item;
		this.left=null;
		this.right=null;
	}
	
	public int getKey() {
		return key;
	}
	public Node getLeft() {
		return left;
	}
	public Node getRight() {
		return right;
	}
	public void setLeft(Node left) {
		this.left = left;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	private int key;
	private Node left, right; //lato di inserimento rispetto a un elemento
}
