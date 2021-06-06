package StackProblem;

import javafx.util.Pair;

import java.util.Stack;

public class StockSpanProblem {
    public int[] stockSpanProblem(int[] spans){
        int[] result = new int[spans.length];
        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        for (int i = 0; i < spans.length; i++){
            while (!stack.empty() && stack.peek().getValue() <= spans[i])
                stack.pop();
            if (stack.empty()){
                result[i] = i + 1;
                stack.push(new Pair<Integer, Integer>(i, spans[i]));
            }else {
                result[i] = i - stack.peek().getKey() + 1;
                stack.push(new Pair<Integer, Integer>(i, spans[i]));
            }
        }
        return result;
    }
}
