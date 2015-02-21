
public class TreeNode {
	int value;
	TreeNode lChild;
	TreeNode rChild;
	
	public TreeNode() {
		super();
		this.lChild = null;
		this.rChild = null;
	}

	public TreeNode(int value) {
		super();
		this.value = value;
		this.lChild = null;
		this.rChild = null;
	}

	public TreeNode(int value, TreeNode lChild, TreeNode rChild) {
		super();
		this.value = value;
		this.lChild = lChild;
		this.rChild = rChild;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getlChild() {
		return lChild;
	}

	public void setlChild(TreeNode lChild) {
		this.lChild = lChild;
	}

	public TreeNode getrChild() {
		return rChild;
	}

	public void setrChild(TreeNode rChild) {
		this.rChild = rChild;
	}
	
	public int getMinFromSub(){
		
		if(this.getlChild() == null){
			return this.getValue();
		}
		
		TreeNode currentPointer = this;
		while(currentPointer.getlChild() != null){
			currentPointer = currentPointer.getlChild();
		}
		
		return currentPointer.getValue();
	}
	
	public int getMaxFromSub(){
		
		if(this.getrChild() == null){
			return this.getValue();
		}
		
		TreeNode currentPointer = this;
		while(currentPointer.getrChild() != null){
			currentPointer = currentPointer.getrChild();
		}
		
		return currentPointer.getValue();
	}
	
}
