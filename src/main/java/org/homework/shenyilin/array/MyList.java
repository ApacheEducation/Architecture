package org.homework.shenyilin.array;



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




}
