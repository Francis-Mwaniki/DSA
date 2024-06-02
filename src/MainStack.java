import java.util.Stack;

public class MainStack {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        stack.push("Minecraft");
        stack.push("FFVII");

        //pop
//        stack.pop();
//peek
        String myString = stack.peek().toLowerCase();
        System.out.print(myString);
        String mySecondString = stack.peek().toLowerCase();
        System.out.print(mySecondString);
    }
}
