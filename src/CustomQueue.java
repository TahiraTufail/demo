public class CustomQueue {

        private int[] queue;

        private static final int DEFAULT_SIZE = 10;

        int end = 0;

        public CustomQueue(){
            this(DEFAULT_SIZE);
        }

        public CustomQueue(int size) {
            this.queue = new int[size];
        }

        public boolean isFull() {
            return end == queue.length; // ptr is at last index
        }

        public boolean isEmpty() {
            return end == 0;
        }

        public boolean insert(int item) {
            if (isFull()) {
                return false;
            }
            queue[end++] = item;
            return true;
        }

        public int remove() throws Exception {
            if (isEmpty()) {
                throw new Exception("Queuue is empty");
            }

            int removed = queue[0];

            // shift the elements to left
            for (int i = 1; i < end; i++) {
                queue[i-1] = queue[i];
            }
            end--;
            return removed;
        }

        public int front() throws Exception{
            if (isEmpty()) {
                throw new Exception("Queue is empty");
            }
            return queue[0];
        }

        public void display() {
            for (int i = 0; i < end; i++) {
                System.out.print(queue[i] + " <- ");
            }
            System.out.println("END");
        }

    }


