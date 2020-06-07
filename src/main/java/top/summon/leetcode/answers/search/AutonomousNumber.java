
import java.util.*;

/**
 * 自守数
 * 
 * @author sumoon
 * @since 2020-06-07
 */
public class AutonomousNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            calculateNum(num);
        }
        
    }
    
    private static void calculateNum(int num) {
        int count = 0;
        while (num >= 0) {
            int num2 = num * num;
            String strNum = Integer.toString(num);
            String strNum2 = Integer.toString(num2);
            int len1 = strNum.length();
            int len2 = strNum2.length();
            if (strNum2.substring(len2 - len1).equals(strNum)) {
                count++;
            }
            num--;
        }
       System.out.println(count);
    }
    
}