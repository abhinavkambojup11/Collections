class MinStack {
    private Node head;
    private int size=0;

    public boolean isEmpty(){
        return size == 0;
    }

    public void push(int x) {
        System.out.println("Item pushed =" + x);
        if (head == null)
            head = new Node(x, x, null);
        else
            head = new Node(x, Math.min(x, head.min), head);
        size++;
    }

    public void pop() {
        if(isEmpty()){
            System.out.println("Stk is empty");
            return;
        }
        System.out.println("pop item  =" + head.val);
        head = head.next;
        size--;
    }

    public int top() {
        if(isEmpty()){
            System.out.println("Stk is empty");
            return -1;
        }
        return head.val;
    }

    public int getMin() {
        if(isEmpty()){
            System.out.println("Stk is empty");
            return -1;
        }
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}

public class Q3{
    public static void main(String[] args){
        MinStack stk=new MinStack();

        stk.push(4);
        stk.push(2);
        stk.push(10);
        System.out.println("minimum element = " + stk.getMin());
        System.out.println("top element =" + stk.top());
        stk.pop();
        System.out.println("minimum element = " + stk.getMin());
        if(stk.isEmpty() == true){
            System.out.println("stack is empty");
        }else{
            System.out.println("stack is not empty");
        }

    }
}