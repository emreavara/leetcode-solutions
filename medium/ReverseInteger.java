// Without long  (used only int)

class Solution {
    public int reverse(int x) {
        int reversedNumber = 0;
        boolean sign = false;
        if(x < 0){
            sign = true;
        }
        x = Math.abs(x);
        while(x>0){
            if(reversedNumber ==  ((reversedNumber*10 + x%10)/10)){
                reversedNumber = reversedNumber*10 + x%10;
            } else {
                return 0;
            }
            x = x / 10;
        }
        if(sign == true){
            return -1* reversedNumber;
        }
        return reversedNumber;
    }
}

// !!! Using long which is not allowed

class Solution {
    public int reverse(int x) {
        long reversedNumber = 0;
        boolean sign = false;
        if(x < 0){
            sign = true;
        }
//        x = Math.abs(x);
        while(x>0){
            reversedNumber = reversedNumber*10 + x%10;
            x = x / 10;
        }
        if(reversedNumber > Integer.MAX_VALUE || reversedNumber < Integer.MIN_VALUE){
            return 0;
        }
        if(sign == true){
            return (int) (-1* reversedNumber);
        }
        return (int) reversedNumber;
    }
}



