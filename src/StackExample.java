public class StackExample {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(5);
        stack.push(2);
        stack.push(3);
        stack.push(7);
        stack.push(5);
        stack.push(9);
        stack.push(9);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
