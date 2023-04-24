class Solution {
    public int romanToInt(String s) {
        int sum = 0, currentNum = 0, prevNumber = Integer.MAX_VALUE;
        char currentChar = 'I';
        for(int i =0; i< s.length(); i++){
            currentChar = s.charAt(i);
            switch (currentChar){
                case 'I':
                    currentNum = 1;
                    break;
                case 'V':
                    currentNum = 5;
                    break;
                case 'X':
                    currentNum = 10;
                    break;
                case 'L':
                    currentNum = 50;
                    break;
                case 'C':
                    currentNum = 100;
                    break;
                case 'D':
                    currentNum = 500;
                    break;
                case 'M':
                    currentNum = 1000;
                    break;
            }
            if(prevNumber < currentNum){
                sum-= 2* prevNumber;
            }
            sum+= currentNum;
            prevNumber = currentNum;
        }
        return sum;
    }
}