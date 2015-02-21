
public class findNearestNodeInBST {
	public static void main(String[] args) {
		BST bst1 = new BST();
		
		//initialize the tree node
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		TreeNode node8 = new TreeNode(8);
		TreeNode node9 = new TreeNode(9);
		TreeNode node10 = new TreeNode(10);
		
		bst1.insertNode(node5);
		bst1.insertNode(node3);
		bst1.insertNode(node2);
		bst1.insertNode(node1);
		bst1.insertNode(node4);
		bst1.insertNode(node8);
		bst1.insertNode(node7);
		bst1.insertNode(node6);
		bst1.insertNode(node9);
		bst1.insertNode(node10);
		
		System.out.println(bst1.getRoot().getMinFromSub());
		System.out.println(bst1.getRoot().getMaxFromSub());
		
		BST bst2 = new BST();
		bst2.addNode(5);
		bst2.addNode(3);
		bst2.addNode(2);
		bst2.addNode(1);
		bst2.addNode(4);
		bst2.addNode(8);
		bst2.addNode(7);
		bst2.addNode(6);
		bst2.addNode(9);
		bst2.addNode(10);
		
		System.out.println(bst2.getRoot().getMinFromSub());
		System.out.println(bst2.getRoot().getMaxFromSub());
		
		BST bst3 = new BST();
		bst3.addNode(20);
		bst3.addNode(15);
		bst3.addNode(13);
		bst3.addNode(16);
		bst3.addNode(23);
		bst3.addNode(21);
		bst3.addNode(25);
		
		System.out.println(bst3.getRoot().getMinFromSub());
		System.out.println(bst3.getRoot().getMaxFromSub());
		
		System.out.println();
		
		int [] range = new int [2];
		range[0] = Integer.MIN_VALUE;
		range[1] = Integer.MAX_VALUE;
		
		System.out.println(findNearestNode(bst3.getRoot(), 17, range));
		
		range[0] = Integer.MIN_VALUE;
		range[1] = Integer.MAX_VALUE;
		System.out.println(findNearestNode(bst3.getRoot(), 19, range));
	
		
		System.out.println("********************");
		
		TreeNode previousPointer = null;
		
		System.out.println(findNearestNode2(bst3.getRoot(), 20, previousPointer));
		
	}
	
	//
	public static int findNearestNode (TreeNode node, int value, int []range){
		System.out.println(range[0] + "\t" + range[1]);
		//终止条件
		if(node == null){
			if(value - range[0] > range[1] - value){
				return range[0];
			}
			else{
				return range[1];
			}
		}
		//终止条件
		if(value == node.getValue()){
			return value;
		}
		else if(value < node.getValue()){
			range[0] = node.getValue();
			return findNearestNode(node.getlChild(), value, range);
		}
		else{
			range[1] = node.getValue();
			return findNearestNode(node.getrChild(), value, range);
		}
		
	}
	
	//using getMinSub() and getMaxSub()
	public static int findNearestNode2(TreeNode node, int value, TreeNode previousPointer){
		
		if(node == null){
			return previousPointer.getValue();
		}
		
		int leftAbs = Math.abs(value - node.getMinFromSub());//
				
		int rightAbs = Math.abs(value - node.getMaxFromSub());//
		
		System.out.println("leftAbs = "+leftAbs+" rightAbs = "+rightAbs);
		
		if(leftAbs < rightAbs){
			previousPointer = node;
			return findNearestNode2(node.getlChild(), value, previousPointer);
		}
		else{
			previousPointer = node;
			return findNearestNode2(node.getrChild(), value, previousPointer);
		}
	}
	
	
	
}
