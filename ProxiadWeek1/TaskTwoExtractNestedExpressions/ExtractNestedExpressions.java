package ProxiadWeek1.TaskTwoExtractNestedExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ExtractNestedExpressions {
    /**
     * Даден е математически израз, съдържащ скоби. Целта е да се извадят всички по-малки изрази,
     * затворени в скобите.
     * <p>
     * Примерни входни данни: 1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5
     * Очакван резултат:
     * (2 + 3)
     * (3 + 1)
     * (2 - (2 + 3) * 4 / (3 + 1))
     */


    public static void main(String[] args) {
      String input =  "1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5";

      List<String> expressions = extractExpressions(input);

        System.out.println("Extracted expressions:");
        for (String expression : expressions){
            System.out.println(expression);
        }

    }

    public static List<String> extractExpressions(String input){
        List<String> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i< input.length(); i++){
            char c = input.charAt(i);

            if (c == '('){
                stack.push(i);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    int start = stack.pop();
                    String expression = input.substring(start,i + 1);
                    result.add(expression);
                }
            }
        }
        return result;
    }
}
