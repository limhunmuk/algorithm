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
			n = n.next; // not null�����ϱ� ��������带 �����ϱ�
		}
		n.next = end;	// ����������� �ؽ�Ʈ�� ����
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
