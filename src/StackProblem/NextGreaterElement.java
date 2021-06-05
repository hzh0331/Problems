package StackProblem;

import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] input){
        if (input.length == 0)
            return null;
//        int[] result = new int[input.length];
        Stack<Integer> stack = new Stack<>();
//        result[input.length - 1] = -1;
        stack.push(input[input.length - 1]);
        input[input.length - 1] = -1;
        for (int i = input.length - 2; i >= 0; i--){
            while (!stack.empty() && input[i] >= stack.peek())
                stack.pop();
            if (stack.empty()){
                stack.push(input[i]);
                input[i] = -1;
            }else{
                int temp = stack.peek();
                stack.push(input[i]);
                input[i] = temp;
            }
        }
        return input;
    }

    public int[] nextGreaterElementII(int[] input){
        if (input.length == 0)
            return null;
//        int[] result = new int[input.length];
        Stack<Integer> stack = new Stack<>();
//        result[input.length - 1] = -1;
        for (int i = input.length - 2; i >= 0; i--)
            stack.push(input[i]);
        for (int i = input.length - 1; i >= 0; i--){
            while (!stack.empty() && input[i] >= stack.peek())
                stack.pop();
            if (stack.empty()){
                stack.push(input[i]);
                input[i] = -1;
            }else{
                int temp = stack.peek();
                stack.push(input[i]);
                input[i] = temp;

            }
        }
        return input;
    }
}
