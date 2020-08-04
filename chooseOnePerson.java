public class test{
      public static void main(String[] args) {
          char i,j,k;  //假设a的对手是i，b的对手是j，c的对手是k
          for (i = 'x'; i <='z';i++) {               //i可能是x,y,z中的任意一个，对i进行遍历
              for (j = 'x'; j <='z';j++) {           //j可能是x,y,z中的任意一个，对j进行遍历
                  for (k = 'x'; k <='z';k++) {       //k可能是x,y,z中的任意一个，对k进行遍历
                      if(i!=j&&i!=k&&j!=k){           //要满足i,j,k互不相等，首先要满足 i!=j其次要满足 i!=k    最后要满足j!=k
                          if(i!='x'&&k!='x'&&k!='z'){//a的对手是i,a不与x比，即i!='x'    c的对手是k,c不与x,z比,即k!=‘x’&& k!='z'
                              System.out.println("a的对手是"+i+"  b的对手是"+j+"  c的对手是"+k);
                         }
                     }
                 }
             }
         }
     }
 }
 /*运行结果
 a的对手是z  b的对手是x  c的对手是y
 */
