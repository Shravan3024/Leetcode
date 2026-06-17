class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = 0; i < digits.length-1; i++){
            if(digits[i] == digits.length-1){
                digits[i]+=1;
            }
        }
        return digits;
    }
}
