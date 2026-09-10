class Solution {
    public int[] plusOne(int[] digits) {
        int n[] = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            n[i] = digits[i];
        }

        int carry = 1; 
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = n[i] + carry;
            if (sum >= 10) {
                n[i] = sum % 10;
                carry = sum / 10;
            } else {
                n[i] = sum;
                carry = 0;
            }
        }
        if (carry > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = n[i];
            }
            return result;
        }

        return n;
    }
}