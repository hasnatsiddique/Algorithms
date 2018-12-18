public class StackQueue {
    private static Stack s;
    private static Queue q;
    public static void main(String[] args) {
	prepare();
	System.out.print(q.dequeue());
	System.out.print(s.pop());
	System.out.print(s.pop());
	System.out.print(q.dequeue());
	s.pop();
	q.dequeue();
	System.out.print(s.pop());
	System.out.print(q.dequeue());
	System.out.print(s.pop());
	System.out.println(q.dequeue());
	s.pop();
	q.dequeue();
    }
    private static void prepare() {

s=new Stack();
q=new Queue();
q.enqueue(3);
	q.enqueue(0);
	q.enqueue(1);
	q.enqueue(1);
	q.enqueue(1);
	s.push(4);
	s.push(9);
	s.push(10);
	s.push(4);
	s.push(3) ;   	




    }
}
