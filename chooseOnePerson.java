public class test{
 2     public static void main(String[] args) {
 3         char i,j,k;  //假设a的对手是i，b的对手是j，c的对手是k
 4         for (i = 'x'; i <='z';i++) {               //i可能是x,y,z中的任意一个，对i进行遍历
 5             for (j = 'x'; j <='z';j++) {           //j可能是x,y,z中的任意一个，对j进行遍历
 6                 for (k = 'x'; k <='z';k++) {       //k可能是x,y,z中的任意一个，对k进行遍历
 7                     if(i!=j&&i!=k&&j!=k){           //要满足i,j,k互不相等，首先要满足 i!=j其次要满足 i!=k    最后要满足j!=k
 8                         if(i!='x'&&k!='x'&&k!='z'){//a的对手是i,a不与x比，即i!='x'    c的对手是k,c不与x,z比,即k!=‘x’&& k!='z'
 9                             System.out.println("a的对手是"+i+"  b的对手是"+j+"  c的对手是"+k);
10                         }
11                     }
12                 }
13             }
14         }
15     }
16 }
17 /*运行结果
18 a的对手是z  b的对手是x  c的对手是y
19 */
