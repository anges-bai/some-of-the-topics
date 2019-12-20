/**
 * @Author: BaiMiao
 * @Date: 2019/12/20 23:34
 * @Description: 现有一个小写英文字母组成的字符串s和一个包含较短小写英文字符串的数组p，
 * 请设计一个高效算法，对于p 中的每一个较短字符串，判断其是否为s的子串。
 * 给定一个string数组p和它的大小n，同时给定string s，为母串，请返回一个bool数组，
 * 每个元素代表p中的对 应字符串是否为s的子串。保证p中的串长度小于等于8，
 * 且p中的串的个数小于等于500，同时保证s的长度小于等于1000。
 */

 class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // 创建boolean数组
        boolean[] hasSub = new boolean[p.length];
        //遍历数组 使用集合中特有功能
        for (int i = 0; i < p.length; i++) {
            hasSub[i] = s.contains(p[i]);
        }
        return hasSub;
    }
}
