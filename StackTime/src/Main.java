public class Main {
    public static void main(String[] args) {
        String exp1 = "aabc";
        String exp2 = "()";
        String expr = "a+b";
        //firstNonRepeating(exp1);
    }

    public static boolean isMatched(String expression) {
    final String opening = "({[";
    final String closing = ")}]";
    Stack<Character> buffer=new ArrayStack<>(1000);
    for (char c:expression.toCharArray()
         ) {
        if(opening.indexOf(c)!=-1){
            buffer.push(c);
        }
        else if(closing.indexOf(c)!=-1){
            if(buffer.isEmpty()){
                return false;
            }
            if (closing.indexOf(c)!=opening.indexOf(buffer.pop())){
                return false;
            }
        }
    }
    return buffer.isEmpty( );


    }
    public static boolean isPalindrome(String s){
        char[]expression=s.toCharArray();
        int length=expression.length;
        Stack stack=new LinkedStack();
        int mid=length/2;
        int j=length/2;
        if(length%2!=0){
            mid++;
        }
        for (int i = 0; i < mid; i++) {
            stack.push(expression[i]);
        }

        while (j<length){
            char ele= (char) stack.pop();
            if(ele!=expression[j]){
                return false;
            }
            j++;
        }
        return true;
    }
    //helper for precedence
    public static void firstNonRepeating(String str)
    {

    }
}
