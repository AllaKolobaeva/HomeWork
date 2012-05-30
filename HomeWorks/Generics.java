public class Generics {

    public static void main(String[] args) {
        Box<String> strBox = new Box<String>();
        strBox.add(new String("10"));

        String someStr = strBox.get();
        System.out.println(someStr);
    }
}

class Box<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}