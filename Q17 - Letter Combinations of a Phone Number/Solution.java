class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> currentStrings = new ArrayList<>();
        if(digits.length() == 0){
            return currentStrings;
        }
        HashMap<Character, String> numsAndStrings = new HashMap<>();
        numsAndStrings.put('2', "abc");
        numsAndStrings.put('3', "def");
        numsAndStrings.put('4', "ghi");
        numsAndStrings.put('5', "jkl");
        numsAndStrings.put('6', "mno");
        numsAndStrings.put('7', "pqrs");
        numsAndStrings.put('8', "tuv");
        numsAndStrings.put('9', "wxyz");
        currentStrings.add("");
        for(int i = 0; i < digits.length(); i++){
            ArrayList<String> newList = new ArrayList<>();
            for(String s: currentStrings){
                for (Character c: numsAndStrings.get(digits.charAt(i)).toCharArray()){
                    newList.add(s.concat(String.valueOf(c)));
                }
            }
            currentStrings = newList;
        }
        return currentStrings;
    }
}