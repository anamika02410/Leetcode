class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>>ans=new ArrayList<>();
        List<String>list=new ArrayList<>();
        partitioning(s,list,ans);
        return ans;
    }
    public static void partitioning(String s,List<String>list, List<List<String>>ans) {
        if (s.length() == 0) {
           ans.add(new ArrayList<String>(list));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            String str = s.substring(0, i);
            if (isPalindrome(str) == true) {
                list.add(str);
                partitioning(s.substring(i),list,ans);
                list.remove(list.size()-1);
            }
        }
    }
            public static boolean isPalindrome (String str){
                int i = 0;
                int j = str.length() - 1;
                while (i < j) {
                    if (str.charAt(i) != str.charAt(j)) {
                        return false;
                    }
                    i++;
                    j--;
                }
                return true;

            }
        }