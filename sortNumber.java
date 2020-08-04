
 public class  {
 2     public static void main(String[] args) {
 3         int [] arr= {1,3,5,7,9,0,2,4,6,8};
 4         //排序前
 5         System.out.println("排序前");
 6         for(int k=0;k<arr.length;k++) {
 7             System.out.print(" "+arr[k]);
 8         }
 9         System.out.println();
10         for(int i=0;i<arr.length;i++) {
11             for(int j=i+1;j<arr.length;j++) {
12                 if(arr[i]>arr[j]) {
13                     arr[i]=arr[i]+arr[j];
14                     arr[j]=arr[i]-arr[j];
15                     arr[i]=arr[i]-arr[j];
16                 }
17             }
18         }
19         //排序后
20         System.out.println("排序后");
21         for(int k=0;k<arr.length;k++) {
22             System.out.print(" "+arr[k]);
23         }
24  
25     }
26 }
27 /*运行结果
28 排序前
29  1 3 5 7 9 0 2 4 6 8
30 排序后
31  0 1 2 3 4 5 6 7 8 9
32 */
