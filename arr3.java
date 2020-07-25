import java.util.*;

class Demo3{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the number of bslls to drop:");
		int ballsCount=scanner.nextInt();//定义球的个数
		System.out.print("Enter the number of solts in the bean machine:");
		int soltsCount=scanner.nextInt();//定义槽子的个数
		String[] paths=new String[ballsCount];//路径
		int[] solts=new int[soltsCount];//槽中球的个数
		paths=Lujing(paths,soltsCount);
		solts=count(paths,solts);
		print(paths);
		print(solts);
	}
	public static String[] Lujing(String[] paths,int soltsCount){
		for(int i=0;i<paths.length;i++){
			String path="";
			for(int j=0;j<soltsCount-1;j++){
				if((int)(Math.random()*2)==0){
					path+="L";
				}else{
					path+="R";
				}
			}
			paths[i]=path;
		}
		return paths;
	}
	public static int[] count(String[] paths,int[] solts){
		for(int i=0;i<paths.length;i++){
			int count=0;
			String path=paths[i];
			for(int j=0;j<path.length();j++){
				if(path.charAt(j)=='R'){
					count++;
				}
			}
			solts[count]++;
		}
	return solts;
	}
	public static void print(String[] paths){
		for(int i=0;i<paths.length;i++){
			System.out.println(paths[i]);
		}
		
	}
	public static void print(int[] solts){
		for(int i=0;i<solts.length;i++){
			System.out.println("第"+(i+1)+"个槽："+solts[i]);
		}
		
	}
}
