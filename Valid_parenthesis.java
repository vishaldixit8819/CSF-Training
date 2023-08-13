import java.util.*;

class Valid_parenthesis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean isValid = isValid(str);
        System.out.println("Output: " + isValid);

    }
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack();
        for(char c: s.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                stack.add(c);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
        
    }
}