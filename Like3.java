import java.util.ArrayList;
import java.util.List;
public class Like3 {
    public static boolean  isIsogram(String str) {
        String newStr = str.toLowerCase();
        List<Boolean>comparisons = new ArrayList<Boolean>();
        int len = newStr.length();
        for(int i = 0; i<len; i++ ){
            for(int n = 0; n<len; n++){
                if(i!=n){
                    boolean comparison = newStr.charAt(i)==newStr.charAt(n);
                    comparisons.add(comparison);
                }
            }
        }
        if(comparisons.contains(true)){
            return false;
        } else{
            return true;
        }
    }
}
