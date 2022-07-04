package com.empower.linkedlist;

public class LinkedList {

	Node head;
	Node tail;
	int length = 0;

	class Node {
		String data;
		Node next;

		public Node(String data) {
			this.data = data;
		}
	}

	public void insertAtHead(String data) {
		Node n = new Node(data);
		if (length == 0) {
			head = n;
			tail = n;
		} else {
			n.next = head;
			head = n;
		}
		length++;
	}

	public void insertAtTail(String data) {
		Node n = new Node(data);
		if (length == 0) {
			tail = n;
			head = n;
		} else {
			tail.next = n;
			tail = n;
		}
		length++;
	}

	public void insertAt(String data, int pos) {
		Node n = new Node(data);
		int count = 1;
		Node prev = head;
		while (count < pos) {
			prev = prev.next;
			count++;
		}
		// if it is said to add in last, make the tail as last.
		if (prev.next == null)
			tail = prev;
		n.next = prev.next;
		prev.next = n;
		
		length ++;
	}
	
	public void deleteNode(int pos) {
		Node prev = head;
		int count = 0;
		while (count < pos-1) {
			prev = prev.next;
			count++;
		}
		
		if(pos == 0) {
			Node curr = head;
			head = head.next;
			curr.next = null;
		} else {
			Node curr = prev.next;
			prev.next = prev.next.next;
			// delete the old node
			curr.next =  null;
		}
		length--;
	}

	public void printList() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "  ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.insertAtHead("One");
		l.insertAtHead("Two");
		l.insertAtHead("Four");
		l.insertAtHead("Five");
		l.insertAt("Three", 2);
		l.deleteNode(4);
		System.out.println(l.length);
		l.printList();
	}
}
