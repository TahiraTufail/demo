public class Main {
    public static void main(String[] args) throws Exception {
        //QUESTION NO 2...
        CustomQueue ride = new CustomQueue();
        ride.insert(4);
        ride.insert(9);
        ride.insert(89);
        ride.insert(90);
        ride.insert(55);
        ride.insert(23);
        ride.display();
        ride.remove();
        ride.display();
        ride.isEmpty();
        ride.isFull();
        ride.front();

        //QUESTION NO 1...
        TicketSystem v1 = new TicketSystem();
        v1.addLast(89);
        v1.addLast(899);
        v1.addLast(896);
        v1.addLast(892);
        v1.addLast(890);
        v1.addLast(891);
        v1.display();
        v1.removeFirst();
        v1.display();



    }
}
