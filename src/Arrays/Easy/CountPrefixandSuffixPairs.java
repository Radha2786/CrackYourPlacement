package Arrays.Easy;

public class CountPrefixandSuffixPairs {
    public static void main(String[] args) {
        String[] words = {"pa","papa","ma","mama"};
       int ans= countPrefixSuffixPairs(words);
        System.out.println(ans);

    }
    public static int countPrefixSuffixPairs(String[] words) {
        int ans=0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                String str1 = words[i];
                String str2 = words[j];
                if(isPrefixSuffixPair(str1,str2)){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static boolean isPrefixSuffixPair(String str1, String str2){
        if(str1.length()>str2.length()){
            return false;
        }
        boolean isPrefix = true;
        boolean isSuffix = true;
        // checking prefix
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                isPrefix=false;
                return false;
            }
        }
        int i=str1.length()-1;
        int j=str2.length()-1;
        while(i>=0){
            if(str1.charAt(i)!=str2.charAt(j)){
                isSuffix=false;
                return false;
            }
            i--;
            j--;
        }
        if(isPrefix == true && isSuffix==true){
            return true;
        }else{
            return false;
        }

    }
}
