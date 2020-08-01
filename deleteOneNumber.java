class test {
	public static void main(String[] args) {
		int []arrInt={1,2,5,6,7,0,0,3,9};
		int j=0;
		for(int i=0;i<arrInt.length;i++){
		if(arrInt[i]!=0){
		j++;
		}
		}
		int []newarr=new int[j];
		j=0; 
		for(int i=0;i<arrInt.length;i++){
		if(arrInt[i]!=0){
		newarr[j]=arrInt[i];
		j++;} 
		} 
		for(int i=0;i<newarr.length;i++){
		System.out.print(newarr[i]); 
		}
	}
}
