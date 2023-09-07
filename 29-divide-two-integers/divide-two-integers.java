class Solution {
    public int divide(int dividend, int divisor) {

    // Handle overflow cases
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Take the absolute values of dividend and divisor
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        long quotient = 0;

        // Perform long division
        while (absDividend >= absDivisor) {
            long tempDivisor = absDivisor;
            long tempQuotient = 1;
            
            while (absDividend >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                tempQuotient <<= 1;
            }

            absDividend -= tempDivisor;
            quotient += tempQuotient;
        }

        // Apply the sign to the result
        if (negative) {
            quotient = -quotient;
        }

        // Ensure the result is within the 32-bit signed integer range
        if (quotient < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if (quotient > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return (int) quotient;
        }    


  
    }
}