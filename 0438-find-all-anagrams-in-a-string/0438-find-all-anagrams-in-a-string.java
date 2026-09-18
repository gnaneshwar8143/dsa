class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int sf[] =new int [26];
        int pf[]=new int[26];
        List<Integer>list=new ArrayList<>();
      
        for(int i=0;i<p.length();i++){
            pf[p.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            sf[s.charAt(i)-'a']++;
           if(i>=p.length()){
            sf[s.charAt(i-p.length())-'a']--;
           }
           if(Arrays.equals(sf,pf)){
            list.add(i-p.length()+1);
           }

        }
        return list;
        
    }
}