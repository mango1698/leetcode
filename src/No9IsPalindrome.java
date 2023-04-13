/**
 * @author shw
 * @createTime 2023年04月13日 20:57:00
 * @description 第九题 回文数
 * 将数字转为字符数组，在数组两端设置标记i和j，将i和j对应的字符进行比较，如果比较不同，则不为回文数，否则至循环正常结束，为回文数
 */
public class No9IsPalindrome {
    public boolean isPalindrome(int x) {
        String temp = String.valueOf(x);
        char[] chars = temp.toCharArray();
        int i=0,j=chars.length-1;
        boolean flag =true;
        while(i!=j && i<j){
            if (chars[i]!=chars[j]){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }
}
