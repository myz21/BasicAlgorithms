class Solution {
    public int strStr(String haystack, String needle) {
        
        if(needle.length() == 0){
            return 0;
        }

        int [] lps = new int [needle.length()];

        for(int i = 0; i<needle.length(); i++){
            lps[i] = 0;
        }

        int prevLPS = 0;
        int i = 1;
        //create longest prefix suffix
        while(i < needle.length()){
            if(needle.charAt(i) == needle.charAt(prevLPS)){
                lps[i] = prevLPS + 1;
                prevLPS += 1;
                i += 1;
            }
            else if (prevLPS == 0){
                lps[i] = 0;
                i += 1;
            }
            else{
                prevLPS =  lps[prevLPS -1];
            }
        }

        int k = 0;
        int l = 0;
        while( k < haystack.length()){
            if(haystack.charAt(k) == needle.charAt(l)){
                k++;
                l++;
            }
            else{
                if(l == 0){
                    k += 1;
                }
                else{
                    l = lps[l-1];
                }
            }

            if (l == needle.length()){
                return k - needle.length();
            }
        }
        return -1;
    }
}