
class Box<T> {
    T var;

    Box(T var) {
        this.var = var;
    }

    public T show() {
        return var;
    }
}

class TypeInference {

    public static <T, U> void show(T first, U second) {
        System.out.println(first + " " + second);
    }

    int a ;
    Integer b;
    public static void main(String args[]) {

        show(10, "hello");

        Box<Integer> b1 = new Box<>(10);
        Box<String> b2 = new Box<>("hello");
        Box<Boolean> b3 = new Box<>(true);

        System.out.println(b1.show());
        System.out.println(b2.show());
        System.out.println(b3.show());
    }
}
