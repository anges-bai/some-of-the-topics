class BinaryTree {
	BiTreeNode root;//根结点
	
	public BinaryTree(){
		root = null;
	}
	public BiTreeNode getRoot(){
		return root;
	}
	public boolean isEmpty(){
		return root == null;
	}
	//获取当前结点的父结点
	public BiTreeNode getParent(BiTreeNode current){
		return parent(root, current);
	}
	public BiTreeNode getParent(BiTreeNode start, BiTreeNode current){
		if(start==null) return null;
		if(start.leftChild==current || start.rightChild==current)
			return start;
		BiTreeNode p;
		if(p=parent(start.leftChild, current)!=null)
			return p;
		else
			return parent(start.rightChild, current);
	}
	public BiTreeNode findNode(int d){}
	public BiTreeNode insertNode(int d){}
	public BiTreeNode removeNode(){int d}
	//二叉树的先序遍历
	private void preOrder(){//从根结点开始
		preOrder ( root );
	}
	private void preOrder(BiTreeNode current){//从某个结点开始
		if (current != null){
			System.out.print(current.data);
			preOrder(current.leftChild );
			preOrder(current.rightChild );
		}
	}
	//二叉树的中序遍历
	private void inOrder(){//从根结点开始
		inOrder ( root );
	}
	private void inOrder(BiTreeNode current){//从某个结点开始
		if (current != null){
			inOrder(current.leftChild );
			System.out.print(current.data);
			inOrder(current.rightChild );
		}
	}
	//二叉树的后序遍历
	private void postOrder(){//从根结点开始
		postOrder ( root );
	}
	private void postOrder(BiTreeNode current){//从某个结点开始
		if (current != null){
			postOrder(current.leftChild );
			postOrder(current.rightChild );
			System.out.print(current.data);
		}
	}
	//获取二叉树的结点个数
	private int getSize(){//获取整棵二叉树的结点数
		return getSize(root);
	}
	private int getSize(BiTreeNode current){//获取某个结点构成的子树的结点总数
		if (current == null) return 0;
		else
			return 1+getSize(current.leftChild)+getSize(current.rightChild);
	}
	//获取二叉树的高度
	public int getHeight(){//整棵树
		return getHeight(root);
	}
	public int getHeight(BiTreeNode current){//某结点构成的子树
		if (current == null) return 0;
		else
			return 1+max(getHeight(current.leftChild)+getHeight(current.rightChild);
		//max(int a, int b)是Math库中的函数，取二者中最大的
	}
}
