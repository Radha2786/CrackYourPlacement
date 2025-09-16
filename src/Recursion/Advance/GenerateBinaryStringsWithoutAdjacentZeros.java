package Recursion.Advance;
import java.util.*;

public class GenerateBinaryStringsWithoutAdjacentZeros {
    public static void main(String[] args) {
        int n = 3;
        String str ="";
        List<String> list = new ArrayList<>();
        validStrings( n, 0, str,list);
        System.out.println(list.size());
    }
    public static List<String> validStrings(int n,int i, String str, List<String> list) {
        if(i==n){
            list.add(str);
            return list;
//            return list;
        }
//        for(int j=i;j<n;j++){
            if(i==0 || str.charAt(i-1)!='0'){
                validStrings(n, i+1, str+"0",list);
            }
            validStrings(n,i+1,str+"1",list);

//        }

        return list;

    }
}
