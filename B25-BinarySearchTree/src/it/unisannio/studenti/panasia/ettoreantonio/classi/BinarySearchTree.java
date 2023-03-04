package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class BinarySearchTree {
	//il costruttore non ha nessun parametro, ma inizializza un identificatore di tipo Node come null
	public BinarySearchTree() {
		this.root=null;
	}
	
	public Node getRoot() {
		return root;
	}
	
	//Richiere l'inserimento di un elemento alla BST
	public void insert(int key) {
		root=insertRec(root, key);
	}
	
	//Registra l'inserimento di un elemento alla BST
	//come parametri la radice e la chiave dell'elemento
	public Node insertRec(Node root, int key) {
		//se non ci sono elementi allora root crea un nodo
		if(root==null) {
			root=new Node(key);
			
			return root;
		}
		
		//se la chiave dell'elemento è minore della chiave di root allora l'elemento viene inserito nel lato sinistro rispetto a root
		if(key<root.getKey()) {
			root.setLeft(insertRec(root.getLeft(), key));
		} else {
			//in caso contrario l'elemento viene inserito nel lato destro rispetto a root
			root.setRight(insertRec(root.getRight(), key));
		}
		
		return root;
	}
	
	//Indica se un elemento è stato trovato
	public Boolean search(int key) {
		//Istanzia il nodo da cercare
		Node node=searchRec(root, key);
		
		//restituisce true se il nodo è stato trovato
		if(node!=null)return true;
		
		//false altrimenti
		return false;
	}
	
	//processo di ricerca
	public Node searchRec(Node root, int key) {
		//restituisce null se il nodo non esiste
		//oppure esce dal ciclo di richiami restituendo root se il nodo è stato trovato
		if(root==null || root.getKey()==key)return root;
		//Indica il lato rispetto a root verso dove continuare il processo di ricerca
		if(root.getKey()>key)return searchRec(root.getLeft(), key); //continua nel lato sinistro
		
		return searchRec(root.getRight(), key); //continua nel lato destro
	}

	private Node root; //radice
}
