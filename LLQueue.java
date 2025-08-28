class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}
class Queue{
	Node front;
	Node rear;
	public Queue(){
		this.front=front;
		this.rear=rear;
	}
	public boolean isEmpty(){
		return front==null;
	}
	public void enque(int data){
		Node node= new Node(data);
		if(isEmpty()){
			front=rear=node;
		}
		else{
			rear.next=node;
			rear=node;
		}
	}
	public void dequeue(){
		if(isEmpty()){
			System.out.println("Queue underflow");
		}
		else{
			System.out.println("Deque : "+front.data);
			front=front.next;
			if(front==null){
				rear=null;
			}
		}
	}
	public void display(){
		
		if(isEmpty()){
			System.out.println("Queue underflow");
		}
		else{
			System.out.print("Queue : ");
			Node current=front;
			while(current!=null){
				System.out.print(current.data+" ");
				current=current.next;
			}
			System.out.println();
		}
	}
}
public class LLQueue{
	public static void main(String args[]){
		Queue q=new Queue();
		System.out.println(q.isEmpty());
		q.enque(12);
		q.enque(8);
		q.enque(23);
		q.display();
		q.dequeue();
		q.display();
	}
}