class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length()-1;
        int j = t.length()-1;
        int Skips = 0;
        int Skipt=0;
        while(i>=0 || j>=0){
            while(i>=0){
                if(s.charAt(i)== '#' ){
                    Skips++;
                    i--;
                }
                else if(Skips>0){
                    Skips--;
                    i--;

                }
                else{
                    break;
                }
            }
            while(j>=0){
                if(t.charAt(j)== '#'){
                    Skipt++;
                    j--;

                }
                else if(Skipt>0){
                    Skipt--;
                    j--;
                }
                else{
                    break;
                }
            }
            if(i>=0 && j>=0){
        if(s.charAt(i)!=t.charAt(j)){
            return false;
        }
                //i--;
                //j--;
            }
            else if(i>=0 || j>=0){
                return false;
            }
        i--;
        j--;
        }
        return true;
    }
}
