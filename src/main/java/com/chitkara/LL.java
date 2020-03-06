package com.chitkara;





public class LL {

    static Node head;
    public int size;
    public static class Node
    {
        int data;
        Node next;
    }


    public LL(){
        this.size=10;

        for(int i=0;i<this.size;i++){
            Node node = new Node();
            node.data = i;
            if(i == 0){
                head=new Node();
            }
            else{
                Node n = head;

                while(n.next != null)
                {
                    n = n.next;
                }
                n.next = node;

            }
        }
    }

    public static void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head==null)
        {
            head = node;
        } else {
            Node n = head;

            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;

        }

    }

    public static void insertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public static void insertAt(int ind,int data)
    {
        Node node = new Node();
        node.data = data;


        if(ind==0)
        {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < ind - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;

        }
    }

    public static void deleteAtStart()
    {
        head = head.next;
    }

    public static void deleteFromEnd()
    {
        Node n = head;
        Node n1 = null;
        if (head==null) {
            System.out.println("List is empty");
        } else {

            while (n.next != null) {
                n1 = n;
                n = n.next;
            }
            n1.next = null;

        }
    }



    public static void deleteAt(int ind)
    {
        Node n = head;
        Node n1 = null;
        if(ind==0)
        {
            deleteAtStart();
        } else {
            for (int i = 0; i < ind - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }


    public static void show()
    {
        Node node = head;

        while(node.next != null)
        {
            System.out.print(node.data+" ");
            node = node.next;
        }
        System.out.print(node.data);
    }


    public static void main(String[] args) {
        LL ll = new LL();
        LL.insertAtStart(100);
        LL.deleteAt(2);

        LL.show();
    }

}
