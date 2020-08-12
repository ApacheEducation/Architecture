package org.homework.shenyilin.array;

//import javax.xml.soap.Node;

public class MyList {
        MyNode head = null;

         public void addNode(String st) {
            MyNode newNode = new MyNode(st);// 实例化一个节点
            if (head == null) {
                head = newNode;
                return;
            }
            MyNode tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }


//        public boolean deleteNode(int index) {
//            if (index < 1 || index > length()) {
//                return false;
//            }
//            if (index == 1) {
//                head = head.next;
//                return true;
//            }
//            int i = 1;
//            Node preNode = head;
//            Node curNode = preNode.next;
//            while (curNode != null) {
//                if (i == index) {
//                    preNode.next = curNode.next;
//                    return true;
//                }
//                preNode = curNode;
//                curNode = curNode.next;
//                i++;
//            }
//            return false;
//        }

       public int length() {
            int length = 0;
            MyNode tmp = head;
            while (tmp != null) {
                length++;
                tmp = tmp.next;
            }
            return length;
        }


        public boolean containOf(MyNode n) {
            if (n == null || n.next == null) {
                return false;
            }
 //           String tmp = n.str;
            MyNode tmp = head;

            while (tmp.next != null) {
                if (tmp.str.equals(n.str))
                {
                    return true;
                }
                tmp=tmp.next;
            }

            return false;
        }
//
//        public void printList() {
//            Node tmp = head;
//            while (tmp != null) {
//                System.out.println(tmp.data);
//                tmp = tmp.next;
//            }
//        }




}
