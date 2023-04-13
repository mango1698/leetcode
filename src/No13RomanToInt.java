/**
 * @author shw
 * @createTime 2023年04月13日 21:12:00
 * @description 第13题 罗马数字转整数
 *
 * 将字符串转为字符数组，循环遍历数组，判断当前字符和下一个字符形成的组合，如果为IV IX XL XC CD CM，则进行合并转为数字，否则正常转为对应数字，最后将结果进行相加。
 */
public class No13RomanToInt {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        for(int i=0;i<chars.length;i++){
            if (chars[i]=='I' && i+1<= chars.length-1 && chars[i+1]=='V'){
                sum = sum + 4;
                i++;
                continue;
            }else if(chars[i]=='I' && i+1<= chars.length-1  && chars[i+1]=='X'){
                sum = sum + 9;
                i++;
                continue;
            }else if (chars[i]=='I'){
                sum = sum + 1;
                continue;
            }

            if (chars[i]=='X' && i+1<= chars.length-1  && chars[i+1]=='L'){
                sum = sum + 40;
                i++;
                continue;
            }else if (chars[i]=='X' && i+1<= chars.length-1  && chars[i+1]=='C'){
                sum = sum + 90;
                i++;
                continue;
            }else if (chars[i]=='X'){
                sum = sum + 10;
                continue;
            }

            if (chars[i]=='C' && i+1<= chars.length-1  && chars[i+1]=='D'){
                sum = sum +400;
                i++;
                continue;
            }else if (chars[i]=='C' && i+1<= chars.length-1  && chars[i+1]=='M'){
                sum = sum + 900;
                i++;
                continue;
            }else if (chars[i]=='C'){
                sum = sum + 100;
                continue;
            }

            if (chars[i]=='V'){
                sum = sum+5;
            }else if (chars[i] == 'L'){
                sum = sum + 50;
            }else if (chars[i] == 'D'){
                sum = sum + 500;
            }else if (chars[i] == 'M'){
                sum = sum + 1000;
            }
        }
        return sum;
    }
}
