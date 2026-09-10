class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>list=new ArrayList<>();
        if(digits.length()==0){
            return list;
        }
        print(digits,"",list);
        return list;
    }
    static String[] code={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void print(String digits,String ans,List<String>list){
        if(digits.length()==0){
            list.add(ans);
            return;        
    }
    char ch=digits.charAt(0);
    String press=code[ch-48];
    for(int i=0;i<press.length();i++){
        print(digits.substring(1),ans+press.charAt(i),list);
    }
    }
}