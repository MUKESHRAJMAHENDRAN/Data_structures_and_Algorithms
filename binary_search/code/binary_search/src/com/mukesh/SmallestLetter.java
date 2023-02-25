package ImportantProblems;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetter {
    public static void main(String[] args){
        char[] letters = {'c','f','j'}; 
        char target = 'f';
        char ans = nextchar(letters, target);
        System.out.println(ans);

    }
    static char nextchar(char[] letters, char target){
        int start = 0;
        int end = letters.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
// We are not find the same number only Smallest Letter Greater Than Target.
            // if(target == letters[mid]){
            //     return letters[mid];}
            if(target >= letters[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
}
