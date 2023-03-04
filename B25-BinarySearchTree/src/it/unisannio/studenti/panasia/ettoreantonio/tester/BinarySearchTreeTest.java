package it.unisannio.studenti.panasia.ettoreantonio.tester;

import it.unisannio.studenti.panasia.ettoreantonio.classi.BinarySearchTree;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		//Crea l'istanza
		BinarySearchTree bst=new BinarySearchTree();
		
		//popolamento Tree
		bst.insert(50);
		bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        
        //stampa se l'elemento si trova all'interno della BST o no
        if(bst.search(60))System.out.println("Elemento trovato nella BST");
        else System.out.println("Elemento non trovato nella BST");
	}

}
