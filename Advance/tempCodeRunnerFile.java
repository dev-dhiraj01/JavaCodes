
// class Box<T> {
//     T var;

//     Box(T var) {
//         this.var = var;
//     }

//     public T show() {
//         return var;
//     }
// }

// class TypeInference {

//     public static <T, U> void show(T first, U second) {
//         System.out.println(first + " " + second);
//     }

//     public static void main(String args[]) {

//         show(10, "hello");

//         Box<Integer> b = new Box<>(10);

//         System.out.println(b.show());
//     }
// }