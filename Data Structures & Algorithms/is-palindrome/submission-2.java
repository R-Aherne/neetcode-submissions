class Solution {
    public boolean isPalindrome(String s) {
        char[] forward = new char[s.length()];
        char[] backward = new char[s.length()];
        forward = s.toCharArray();
        int index=0;
        for(int i=(s.length()-1);i>=0;i--)
            {
                backward[index] = forward[i];
                index++;
            }
            String sf=new String(forward);
            String sb=new String(backward);
            
            sf=sf.replaceAll("[^a-zA-Z0-9]", "");
            sb=sb.replaceAll("[^a-zA-Z0-9]", "");
            System.out.println(sf + " --- " + sb);
        return (sf.equalsIgnoreCase(sb)); 
       
    }
}
