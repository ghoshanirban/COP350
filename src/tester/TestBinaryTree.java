package tester;

import trees.BinaryTree;

public class TestBinaryTree {
	public static void main(String[] args) {
		BinaryTree<Character> T = new BinaryTree<>();
		
		T.insert('A',"root");
		T.insert('B', "0");
		T.insert('K', "1");
		T.insert('C', "00");
		T.insert('H', "01");
		T.insert('L', "10");
		T.insert('N', "11");
		T.insert('D', "000");
		T.insert('G', "001");
		T.insert('I', "010");
		T.insert('J', "011");
		T.insert('M', "100");
		T.insert('S', "101");
		T.insert('O', "110");
		T.insert('P', "111");
		T.insert('E', "0000");
		T.insert('F', "0001");

		System.out.print("PreOrder: ");
		T.printPreOrder();
		
		System.out.print("\nInOrder: ");
		T.printInOrder();
		
		System.out.print("\nPostOrder: ");
		T.printPostOrder();
		
		System.out.print("\nNumber of nodes in the tree: " + T.countNodes( T.getRoot() ) + "\n");

		for( var item : T ) // Using the inorder iterator for the binary tree class
			System.out.print(item + " ");

		System.out.println(T.doSomething());
	}
}