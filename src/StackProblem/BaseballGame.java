package StackProblem;

import java.util.Stack;

public class BaseballGame {
    public int baseballGame(String[] inputs){
        Stack<Integer> scores = new Stack<>();
        int newScore = 0;
        for (String input : inputs){
            switch (input){
                case "+":
                    int temp = scores.pop();
                    newScore = temp + scores.peek();
                    scores.push(temp);
                    scores.push(newScore);
                    break;
                case "C":
                    scores.pop();
                    break;
                case "D":
                    newScore = scores.peek() * 2;
                    scores.push(newScore);
                    break;
                default:
                    newScore = Integer.parseInt(input);
                    scores.push(newScore);
            }
        }
        int sum = 0;
        while (!scores.empty()){
            sum += scores.pop();
        }
        return sum;
    }
}
