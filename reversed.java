class test{
    public static void main (String[] args){
    	
		int[] array=new int[]{9,8,7,6,5,4,3,2,1};
        Reversed(array);
    }
    public static void Reversed(int[] array){
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");


        }

    }
}
