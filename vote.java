import java.util.Scanner; 
import java.util.HashMap; 
import java.util.Set;
/**
 * @Author: BaiMiao
 * @Date: 2019/12/29 22:36
 * @Description:
 * 请实现接口： unsigned int AddCandidate (char* pCandidateName);
 * 功能：设置候选人姓名 输入： char* pCandidateName 候选人姓名 输出：无
 * 返回：输入值非法返回0，已经添加过返回0 ，添加成功返回1 Void Vote(char* pCandidateName);
 * 功能：投票 输入： char* pCandidateName 候选人姓名 输出：无 返回：无
 * unsigned int GetVoteResult (char* pCandidateName); 功能：获取候选人的票数。
 * 如果传入为空指针，返回无效的票数，同时说明本次投票活动结束，释放资源
 * 输入： char* pCandidateName 候选人姓名。当输入一个空指针时，返回无效的票数
 * 输出：无 返回：该候选人获取的票数 void Clear() // 功能：清除投票结果，释放所有资源
 * // 输入： // 输出：无 // 返回
 * 输入描述： 输入候选人的人数，第二行输入候选人的名字，第三行输入投票人的人数，第四行输入投票。
 * 输出描述： 每行输出候选人的名字和得票数量。
 */
public class Test4 {
    public static void main(String args[]) {
        //控制台输入数据
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            //候选人人数
            int n = in.nextInt();
            String[] s = new String[n];
            //记录候选人
            HashMap<String, Integer> hs = new HashMap<String, Integer>();
            for (int i = 0; i < n; i++) {
                String temp = in.next();
            }
            hs.put(temp, 0);
            s[i] = temp;
        }
        //投票人数
        int m = in.nextInt();
        Set<String> keys = hs.keySet();
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            //投票
            String tick = in.next();
            if (keys.contains(tick)) {
                hs.put(tick, hs.get(tick) + 1);
            } else {
                cnt++;
            }
        }
    }
    //输出结果
    for(
    String k:s)

    {
        System.out.println(k + " : " + hs.get(k));
    }
    System.out.println("Invalid : "+cnt);
}
in.close();
        }
}
