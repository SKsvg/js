class Node{
	int data;
	Node next;
	public Node(int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedListADT{
	Node head;
	public LinkedListADT(){
		this.head=null;
	}
	public boolean isEmpty(){
		return (head==null);
	}
	public void addNode(int data){
		Node node= new Node(data);
		if(head==null){
			this.head=node;
		}
		else{
			node.next=head;
			head=node;
		}
	}
	//display
	public void display(){
		if(isEmpty()){
				System.out.println("Linked list is empty");
		}
		else{
			Node cur=head;
			while(cur!=null){
				System.out.println(cur.data);
				cur=cur.next;
			}
		}
	}
	//size
	public int getSize(){
		int size=0;
		Node cur=head;
		while(cur!=null){
			size++;
			cur=cur.next;
		}
		return size;
		
	}
	//insertAtIndex
	public void addFront(int data){
		Node newNode= new Node(data);
		if(isEmpty()){
				head=newNode;
		}
		else{
			
			newNode.next=head;
			head=newNode;
		}
	}
	public void addEnd(int data){
		Node newNode= new Node(data);
		if(isEmpty()){
				head=newNode;
		}
		else{
			Node cur=head;
			
			while(cur.next!=null){
				cur=cur.next;
			}
			cur.next=newNode;
		}
	}
	public void insertAtIndex(int data,int index){
		if(index<1|| index>getSize()+1){
			System.out.println("invalid input");
			return;
		}
		if(index==1){
			addEnd(data);
			return;
		}
		Node newNode=new Node(data);
		Node current=head;
		for(int c=1;c<index-1;c++){
			current=current.next;
		}
		newNode.next=current.next;
		current.next=newNode;
	}
	
	//delete nodes
	
	public void deleteAtFront(){
		if(isEmpty()){
			System.out.println("This is empty can not delete");
		}
		else{
			head=head.next;
		}
	}
	public void deleteAtEnd(){
		if(isEmpty()){
			System.out.println("This is empty can not delete");
		}
		/* else if(head.next==null){
			head=null;
		}
		else{
			node current=head;
			node previous=null;
			while(current.next!=null){
				previous=current;
				current=current.next;
			}
			previous.next=null;
		} */
		
		else{
			Node current= head;
			while(current.next.next!=null){
				current=current.next;
			}
			current.next=null;
		}
	}
	public void deleteAtIndex(int index){
		if(index<1|| index>getSize()){
			System.out.println("invalid input");
			return;
		}
		if(index==1){
			deleteAtFront();
			return;
		}
		
		Node current=head;
		for(int c=1;c<index-1;c++){
			current=current.next;
		}
		current.next=current.next.next;
	}
}

public class SinglyLinkedList{
	public static void main(String args[]){
		LinkedListADT linkedList=new LinkedListADT();
		//System.out.println("This linked list is : "+linkedList.isEmpty());
		
		linkedList.addNode(9);
		linkedList.addEnd(7);
		linkedList.addEnd(23);
		System.out.println("Linked list : ");
		linkedList.display();
		System.out.println("Insert into linkedList ");
		linkedList.insertAtIndex(34,3);
		linkedList.display();
		/* linkedList.deleteAtFront();
		System.out.println("After delete at front"); 
		linkedList.deleteAtEnd();
		System.out.println("After delete at end");
		linkedList.display();
		System.out.println("After delete at index 2");
		linkedList.deleteAtIndex(2);
		linkedList.display();*/
		System.out.println("size : "+linkedList.getSize());
	}
}