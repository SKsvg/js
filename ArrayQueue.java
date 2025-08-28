class QueueATD{
	String[] queueArray;
	int maxsize;
	int front=0;
	int rear=-1;
	public QueueATD(int maxsize){
		this.maxsize=maxsize;
		this.queueArray=new String[maxsize];
		front=0;
		rear=-1;
		
	}
	public boolean isEmpty(){
		return(rear==-1);
	}
	public boolean isFull(){
		return(rear==maxsize-1);
	}
	public void enque(String data){
		if(isFull()){
			System.out.println("Queue overflow");
		}
		else{
			queueArray[++rear]=data;
		}
	}
	public void deque(){
		if(isEmpty()){
			System.out.println("Queue Underflow");
		}
		/* else if(front>rear){
			front=0;
			rear=-1;
			//System.out.println("Queue Underflow");
		} */
		else{
			System.out.println("dequed : "+queueArray[front++]);
			for(int i=front;i<rear;i++){
				queueArray[i-1]=queueArray[i];
			}
			rear=rear-1;
		}
	}
	public void display(){
		if(isEmpty()){
			System.out.println("Queue Underflow");
		}
		else {
			System.out.print("Queue: ");
			for(int i=front;i<=rear;i++){
				System.out.print(queueArray[i]+" ");
			}
			System.out.println();
			}
		}
}
public class ArrayQueue{
	public static void main (String args[]){
		QueueATD q=new QueueATD(5);
		System.out.println(q.isEmpty());
		q.enque("Mango");
		q.enque("Apple");
		q.enque("Banana");
		q.display();
		q.deque();
		q.display();
		q.deque();
		q.deque();
		q.deque();
		q.deque();
	}
}