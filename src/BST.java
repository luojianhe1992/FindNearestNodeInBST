
public class BST {
	TreeNode root;
	int size;
	
	public BST() {
		super();
		this.root = null;
		this.size = 0;
	}

	public BST(TreeNode root) {
		super();
		this.root = root;
		this.size = 0;
	}

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void insertNode(TreeNode node){
		if(root == null){
			root = node;
			size++;
		}
		else{
			
			TreeNode tempPrevious = null;
			TreeNode tempCurrent = root;
			
			while(tempCurrent != null){
				if(node.getValue()<tempCurrent.getValue()){
					tempPrevious = tempCurrent;
					tempCurrent = tempCurrent.getlChild();
				}
				else{
					tempPrevious = tempCurrent;
					tempCurrent = tempCurrent.getrChild();
				}
			}
			
			//adding the node to the tree
			if(tempPrevious.getValue()>node.getValue()){
				tempPrevious.setlChild(node);
				size++;
			}
			else{
				tempPrevious.setrChild(node);
				size++;
			}
		}
	}
	
	public void addNode(int value){
		
		TreeNode node = new TreeNode(value);
		if(root == null){
			root = node;
			size++;
		}
		else{
			
			TreeNode previousPointer = null;
			TreeNode currentPointer = root;
			
			while(currentPointer != null){
				if(value < currentPointer.getValue()){
					previousPointer = currentPointer;
					currentPointer = currentPointer.getlChild();
				}
				else{
					previousPointer = currentPointer;
					currentPointer = currentPointer.getrChild();
				}
			}
			
			if(value < previousPointer.getValue()){
				previousPointer.setlChild(node);
				size++;
			}
			else{
				previousPointer.setrChild(node);
				size++;
			}
			
		}
		
	}
	
}
