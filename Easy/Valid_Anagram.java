//==========================================================
// LeetCode #242 - Valid Anagram
// Difficulty : Easy
//==========================================================
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        char index[] = new char[26];
        for(int i=0; i<s.length(); i++)
        {
            index[s.charAt(i) - 'a']++;
        }
        for(int i=0; i<t.length(); i++)
        {
            index[t.charAt(i) - 'a']--;
        }
        for(int i=0; i<26; i++)
        {
            if(index[i] != 0) 
            return false;
        }
        return true;

        
    }
}
