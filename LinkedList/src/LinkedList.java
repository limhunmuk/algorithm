public class LinkedList {

	int data;
	LinkedNode header = null;
	
	public LinkedList() {
		// TODO Auto-generated constructor stub
		header = new LinkedNode();
	}
	
	void append(int data) {
		LinkedNode n = header;
		LinkedNode end = new LinkedNode();
		end.data = data;
		while(n.next != null) {
			n = n.next; // not null까지니까 마지막노드를 설정하구
		}
		n.next = end;	// 마지막노드의 넥스트에 넣음
	}
	
	void delete(int data) {
		LinkedNode n = header;
		while(n.next != null) {
			if(n.next.data == data) {
				n.next = n.next.next;
			}else {
				n = n.next;
			}
		}
	}
	
	void retrieve() {
		LinkedNode n = header.next;
		StringBuffer sb = new StringBuffer();
		while(n.next != null) {
			sb.append(n.data +"->");
			n = n.next;
		}
		sb.append(n.data);
		System.out.println("retrive > " + sb.toString());
	}
	
	public static void main(String[] args) {
		LinkedList node = new LinkedList();
		node.append(1);
		node.append(2);
		node.append(3);
		node.retrieve();
	}
	
	
}
