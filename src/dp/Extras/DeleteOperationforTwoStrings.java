package dp.Extras;

public class DeleteOperationforTwoStrings {
    public static void main(String[] args){
        String word1 = "sea", word2 = "eat";
        int ans=Delete(word1,  word2, 0,0);
        System.out.println(ans);
    }
    public static int Delete(String word1, String word2,int i, int j){
        if(i==word1.length()){
            return word2.length()-j;
        }
        if(j==word2.length()){
            return word1.length()-i;
        }
        int step1=0;
        int step2=0;
        int ans=0;
        if(word1.charAt(i)==word2.charAt(j)){
            ans=ans+Delete( word1,  word2, i+1,  j+1);
        }else {
            // delete from string 1
            step1= 1+ Delete(word1, word2, i + 1, j);
            // delete from string 2
            step2= 1+ Delete(word1, word2, i , j+1);
        }
        return ans+Math.min(step1,step2);
    }
}
