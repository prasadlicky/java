package hlo;

//Linked List - Merge two sorted linked list
import java.util.Scanner;
class Node {
  int data;
  Node next;
  Node(int data) {
      this.data = data;
      this.next = null;
  }
}
public class linkedlist {
  public static Node mergeSortedLists(Node list1, Node list2) {
      if (list1 == null)
          return list2;
      if (list2 == null)
          return list1;
      Node mergedList;
      if (list1.data <= list2.data) {
          mergedList = list1;
          mergedList.next = mergeSortedLists(list1.next, list2);
      } else {
          mergedList = list2;
          mergedList.next = mergeSortedLists(list1, list2.next);
      }
      return mergedList;
  }
  public static void printList(Node head) {
      Node temp = head;
      while (temp != null) {
          System.out.print(temp.data);
          if (temp.next != null)
              System.out.print("->");
          temp = temp.next;
      }
      System.out.println("->NULL");
  }
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int size1 = scanner.nextInt();
      Node list1 = null;
      Node tail1 = null;
      for (int i = 0; i < size1; i++) {
          int data = scanner.nextInt();
          Node newNode = new Node(data);
          if (list1 == null) {
              list1 = newNode;
              tail1 = newNode;
          } else {
              tail1.next = newNode;
              tail1 = newNode;
          }
      }
      int size2 = scanner.nextInt();
      Node list2 = null;
      Node tail2 = null;
      for (int i = 0; i < size2; i++) {
          int data = scanner.nextInt();
          Node newNode = new Node(data);
          if (list2 == null) {
              list2 = newNode;
              tail2 = newNode;
          } else {
              tail2.next = newNode;
              tail2 = newNode;
          }
      }
      Node mergedList = mergeSortedLists(list1, list2);
      printList(mergedList);
      scanner.close();
  }
}