package split_with_minimum_sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int splitNum(int num) {
        StringBuilder s = new StringBuilder("");
        s.append(num);
        List numbers = new ArrayList<String>();
        for (int i = 0; i < s.toString().length(); i++){
            numbers.add(s.charAt(i));
        }
        Collections.sort(numbers);
        StringBuilder str1 = new StringBuilder("");
        StringBuilder str2 = new StringBuilder("");
        for(int i = 0 ; i < numbers.size() ; i++){
            if( i%2 == 0){
                str1.append(numbers.get(i));
            }else {
                str2.append(numbers.get(i));
            }
        }
        int num1, num2;
        num1 = Integer.parseInt(str1.toString());
        num2 = Integer.parseInt(str2.toString());
        return num1+num2;
    }
}