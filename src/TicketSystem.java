public class TicketSystem {
    Visitors head,tail;
    int size;
    class Visitors{
        int ID;
        Visitors next;
        Visitors(int id){
            this.ID= id;
        }
    }

    void addFirst(int ID){
            Visitors visitors = new Visitors(ID);
            visitors.next = head;
            head = visitors;
            if(tail==null){
                tail = head;
            }
            size++;
    }
    void addLast(int visitorID){
        if(head==null){
        addFirst(visitorID);
        return;
    }
     Visitors visitor = new Visitors(visitorID);
     tail.next = visitor;
     tail = visitor;
     size++;
}
    public void display(){
        Visitors temp ;
        temp = head;
        while (temp != null){
            System.out.print(temp.ID+" ->");
            temp= temp.next;
        }
        System.out.print("END");
    }

    public int removeFirst(){
        int value = head.ID;
        int val = head.ID;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;

    }

}
