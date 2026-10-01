class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character,Integer>map=new HashMap<>();
        String row1="qwertyuiop";
        String row2= "asdfghjkl";
        String row3= "zxcvbnm";
        for(int i=0;i<row1.length();i++){
            char ch =row1.charAt(i);
            map.put(ch,1);

        }
        for(int i=0;i<row2.length();i++){
            char ch =row2.charAt(i);
            map.put(ch,2);

        }
          for(int i=0;i<row3.length();i++){
            char ch =row3.charAt(i);
            map.put(ch,3);

        }
        List<String>list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String w=words[i];
            int row=map.get(Character.toLowerCase(w.charAt(0)));
            boolean valid=true;
            for(int j=1;j<w.length();j++){
                char ch=Character.toLowerCase(w.charAt(j));
                if(map.get(ch)!=row){
                    valid=false;
                    break;
                }


            }
            if(valid){
                list.add(w);
            }

           
        }
        String arr[]=new String[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}