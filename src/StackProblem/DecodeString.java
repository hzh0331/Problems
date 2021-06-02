package StackProblem;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String input){
        Stack<Integer> integerStack = new Stack<>();
        Stack<Integer> stringStack = new Stack<>();
        int index = 0;
        while(index < input.length()){
            if(input.charAt(index) <= '9' && input.charAt(index) >= '0'){
                int start  = index;
                while(index < input.length() && input.charAt(index) <= '9' && input.charAt(index) >= '0')
                    index++;
                integerStack.push(Integer.valueOf(input.substring(start, index)));
            }else if (input.charAt(index) == '[') {
                stringStack.push(index);
                index++;
            }
            else if (input.charAt(index) == ']'){
                int previous = stringStack.pop();
                String product = productString(input.substring(previous + 1, index), integerStack.pop());
                int first = previous - 1;
                while (first > 0 && input.charAt(first) <= '9' && input.charAt(first) >= '0') first--;
                input = input.substring(0, first == 0 ? 0 :first + 1) + product + input.substring(index+1);
                index = first == 0 ? 0 :first + 1 + product.length();
            }else{
                index++;
            }
        }
        return input;
    }

    public String productString(String str, int times){
        if(times == 0) return "";
        if (times == 1) return str;
        StringBuilder sb = new StringBuilder(str);
        for(int i = 1; i < times; i++){
            sb.append(str);
        }
        return sb.toString();
    }
}
