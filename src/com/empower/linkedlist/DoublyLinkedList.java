package com.empower.linkedlist;

public class DoublyLinkedList {

	Node head;
	Node tail;

	public static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList l = new DoublyLinkedList();
		l.insertAtHead(4);
		//l.insertAtHead(5);
		l.insertAtHead(6);
		l.insertAtTail(3);
		l.insertAtPos(5, 1);
		l.print();
	}

	public void print() {
		Node tmp = head;
		while (tmp != null) {
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}

	public void insertAtHead(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head.prev = node;
			head = node;
		}

	}

	public void insertAtTail(int data) {
		Node node = new Node(data);
		if (tail == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
	}

	public void insertAtPos(int data, int pos) {
		if (pos==0) {
			insertAtHead(data);
			return;
		}
		Node node = new Node(data);
		int count =1;
		Node tmp = head;
		while (count < pos) {
			tmp = tmp.next;
			count ++;
		}
		
		node.next = tmp.next;
		node.prev = tmp;
		tmp.next = node;
	}
}
