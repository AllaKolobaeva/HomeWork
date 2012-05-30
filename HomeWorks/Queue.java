public class Queue1 {

    private static class QueueException extends Exception {

        public QueueException() {
            super("очередь пуста");
        }

        private QueueException(String string) {
            throw new UnsupportedOperationException("Not yet implemented");
        }
    }
    private Object[] data;
    private int size;
    private int begin;


    public Queue1() {
        data = new Object[10101];
    }

    public boolean isEmpty() {
        return size == 0;

    }

    public int size() {
        return size;
    }

    public Object getFront() throws QueueException {

        if (isEmpty()) {
            throw new QueueException("QueueEmpty");
        }
        return data[begin];
    }

    public void addfirst(Object obj) {
        data[size] = obj;
        size++;
    }

    public Object deletefirst() throws QueueException {
        size--;
        if (isEmpty()) {
            throw new QueueException("QueueEmpty");
        }
        begin++;
        return data[begin - 1];
    }
}