class Solution {
    public boolean isAnagram(String s, String t) {
        ArrayList<Character> sorted_s = new ArrayList<Character>();
        for(int i=0;i<s.length();i++)
        {
            sorted_s.add(s.charAt(i));
        }
        ArrayList<Character> sorted_t = new ArrayList<Character>();
        for(int j=0;j<t.length();j++)
        {
            sorted_t.add(t.charAt(j));
        }
        Collections.sort(sorted_s);
        Collections.sort(sorted_t);
        if(sorted_s.equals(sorted_t)) return true;
        return false;
    }
}