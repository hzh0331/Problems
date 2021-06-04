package StackProblem;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {
    public List<Integer> asteroidCollision(int[] inputs){
        List<Integer> result = new LinkedList<>();
        Stack<Integer> previous = new Stack<>();
        for (int input : inputs){
            if (previous.empty() && input < 0)
                result.add(input);
            if (input > 0)
                previous.push(input);
            else{
                input = -input;
                boolean bothCollision = false;
                while (!previous.empty()){
                    if (input > previous.peek())
                        previous.pop();
                    else if (input == previous.peek()){
                        bothCollision = true;
                        previous.pop();
                    }else
                        break;
                }
                if (previous.empty() && !bothCollision)
                    result.add(input);
            }
        }
        while (!previous.empty())
            result.add(previous.pop());
        return result;
    }
}
