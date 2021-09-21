public class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        
        int i = 0;
        int index = 0;
        
        int result = Integer.MIN_VALUE;
        
        Set < Character > hash = new HashSet < Character >();
        
        
         while (i < s.length() && index < s.length()) {
             
            if (!hash.contains(s.charAt(index))){
                
                hash.add(s.charAt(index));
                
                result = Math.max(result, index - i + 1);
                
                index++;
                
            }
            else{
                
                hash.remove(s.charAt(i));
                
                i++;
            }
         }
        
        return result != Integer.MIN_VALUE ? result : 0;
    }
}