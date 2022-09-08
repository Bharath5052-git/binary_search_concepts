package java_programming;

public class binaryConcepts {
//	
//	private rootnode root;
//	
//	private class rootnode{
//		
//		private int data ;
//		private rootnode right;
//		private rootnode left ;
//		
//		private rootnode (int data) {
//			this.data = data;
//		}
//}
//	
//	public void createBinaryTree(){
//		
//		rootnode frist = new rootnode(1);
//		rootnode second = new rootnode (2);
//		rootnode third = new rootnode (3);
//		rootnode fourth = new rootnode (4);
//		rootnode five = new rootnode (5);
//		
//		
//		root = frist;
//		frist.left = second;
//		frist.right=third;
//		
//		second.left=fourth;
//		second.right=five;
//		
//		
//	}
//
//	public static void main(String[] args) {
//		
//		
//		
//		
//	}

	
	
	  public static class Node{    
	        int data;    
	        Node left;    
	        Node right;    
	        public Node(int data){    
	            //Assign data to the new node, set left and right children to null    
	            this.data = data;    
	            this.left = null;    
	            this.right = null;    
	            }    
	        }    
	    //Represent the root of binary tree    
	    public Node root;    
	    public binaryConcepts(){    
	        root = null;    
	    }    
	    //factorial() will calculate the factorial of given number    
	    public int factorial(int num) {    
	        int fact = 1;    
	        if(num == 0)    
	            return 1;    
	        else {    
	            while(num > 1) {    
	                fact = fact * num;    
	                num--;    
	            }    
	            return fact;    
	        }    
	    }    
	    //numOfBST() will calculate the total number of possible BST by calculating Catalan Number for given key    
	    public int numOfBST(int key) {    
	        int catalanNumber = factorial(2 * key)/(factorial(key + 1) * factorial(key));    
	        return catalanNumber;    
	    }    
	    public static void main(String[] args) {    
	    	binaryConcepts bt = new binaryConcepts();    
	        //Display total number of possible binary search tree with key 5    
	        System.out.println("Total number of possible Binary Search Trees with given key: " + bt.numOfBST(5));    
	      }    
	
	
	
	
	
	
	
}
