import java.util.Scanner;
 
//出租车计费问题
public class Work4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double cost = 0;
		System.out.println("打车时间：");
		int time = input.nextInt();
		System.out.println("打车距离：");
		int distence = input.nextInt();
	    input.close();
	    //在06：00~21:00时间段
	    if(6<=time&&time<=21){
	    	if(distence<=2)
	    		cost = 1+6;
	    	else
	    		cost = 1+6+(distence-2)*1.5;
	    }else{//在当日22:00-次日05:00
	    	if(distence<=2)
	    		cost = 1+7;
	    	else
	    		cost = 1+7+(distence-2)*1.5;
	    }
	   System.out.println("本次打车的费用为："+cost);
	}
 
}
