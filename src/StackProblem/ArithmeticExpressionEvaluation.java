package StackProblem;

import java.util.Stack;

public class ArithmeticExpressionEvaluation {
    public String infixToPostfix(String s){
        Stack<String> operators = new Stack<>();
        Stack<String> result = new Stack<>();
        int index = 0;
        while (index < s.length()){
            if (s.charAt(index) >= '0' && s.charAt(index) <= '9'){
                StringBuilder sb = new StringBuilder(s.charAt(index)+"");
                index++;
                while (index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9'){
                    sb.append(s.charAt(index));
                    index++;
                }
                result.push(sb.toString());
                continue;
            } else if (s.charAt(index) == ')'){
                while (!operators.peek().equals("("))
                    result.push(operators.pop());
                operators.pop();
            }else {
                while (!(s.charAt(index) == '(' || operators.empty() || operators.peek().equals("(") || isHigher(operators, s.charAt(index))))
                    result.push(operators.pop());
                operators.push(s.charAt(index) + "");
            }
            index++;
        }

        while (!result.empty()){
            operators.push(result.pop());
        }
        if (operators.size() == 0)
            return "";

        StringBuilder ans = new StringBuilder();
        while (operators.size() != 1)
            ans.append(operators.pop()).append(" ");
        return ans.append(operators.pop()).toString();
    }

    public int evaluating(String s){
        String[] inputs = s.split(" ");
        Stack<Integer> stack = new Stack<>();
        for (String input : inputs){
            if(isOperator(input)){
                int num2 =  stack.pop();
                int num1 = stack.pop();
                stack.push(calculate(num1, num2, input));
            }else
                stack.push(Integer.parseInt(input));
        }
        return stack.pop();
    }

    public boolean isOperator(String s){
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    public int calculate(int num1, int num2, String operator){
        switch (operator){
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return  num1 / num2;
        }
        return 0;
    }

    public boolean isHigher(Stack<String> stack, char operator){
        return (stack.peek().equals("+") || stack.peek().equals("-")) && (operator == '*' || operator == '/');
    }
}
