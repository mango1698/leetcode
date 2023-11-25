import java.util.ArrayList;
import java.util.List;

/**
 * @author shw
 * @date 2023/11/25 13:14
 * @description 有效的括号
 */
public class Hot20 {
    /***
     * @author shw
     * @date 2023/11/25 13:33
     * @return boolean 使用栈
     */
    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        List<Character> stack = new ArrayList<>();
        for (int i=charArray.length-1;i>=0;i--){
            if (stack.size()==0){
                stack.add(charArray[i]);
            }else{
                if (charArray[i]=='[' || charArray[i]=='(' || charArray[i]=='{'){
                    char top = (char)stack.remove(stack.size() - 1);
                    switch (charArray[i]){
                        case '[':
                            if (top!=']'){
                                return false;
                            }
                            break;
                        case '(':
                            if (top!=')'){
                                return false;
                            }
                            break;
                        case '{':
                            if (top!='}'){
                                return false;
                            }
                            break;
                    }
                }else{
                    stack.add(charArray[i]);
                }
            }
        }
        return stack.size() == 0;
    }
}
