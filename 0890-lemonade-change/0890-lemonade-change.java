class Solution {
    public boolean lemonadeChange(int[] bills) {
        int numFive = 0;
        int numTen = 0;

        for(int bill : bills) {
            if(bill == 5) {
                numFive ++;
            } else if(bill == 10) {
                numTen++;
                if(numFive < 1) {
                    return false; 
                } 
                numFive--;
            } else if(bill == 20) {
                if(numFive > 0) {
                    if(numTen > 0) {
                        numTen--;
                        numFive--;
                    } else if(numFive > 2){
                        numFive-=3;
                    } else {
                        return false;
                    }
                } else {
                    return false; 
                }
            }
        }
        return true;
    }
}