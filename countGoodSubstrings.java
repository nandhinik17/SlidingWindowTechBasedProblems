class Solution {
    public boolean isUnique(String str){
         return str.charAt(0)!= str.charAt(1)
             && str.charAt(1)!= str.charAt(2)
              && str.charAt(2)!= str.charAt(0);
     }
    public int countGoodSubstrings(String s) {
        int k=3;
      int count=0;

     
      for(int i=0; i<=s.length()-k; i++){
       String sub = s.substring(i, i+k);
        if(isUnique(sub)){
            count++;
        }


      }
      return count;



    }
}
