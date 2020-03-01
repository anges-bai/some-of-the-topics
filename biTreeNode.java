class BiTreeNode {
	int data;//设数据域非负
	BiTreeNode leftChild;
	BiTreeNode rightChild;
	
	public BiTreeNode(){
		data = -1;//负数表示空
		leftChild = rightChild = null;
	}
	public BiTreeNode(int d, BiTreeNode left, BiTreeNode right){
		data = d;
		leftChild = left;
		rightChild = right;
	}
	public int getData(){
		return data;
	}
	public void setData(int d){
		data = d;
	}
	public BiTreeNode getLeftChild(){
		return leftChild; 
	}
	public BiTreeNode getRightChild(){
		return rightChild; 
	}
	public void setLeftChild(BiTreeNode left){
		leftChild = left;
	}
	public void setLeftChild(BiTreeNode right){
		rightChild = right;
	}
}
