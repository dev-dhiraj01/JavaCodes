
class Animal{
    String name;
    int age;
    int weight;

    public Animal(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
public class ReverseArray {
    public static void main(String[] args) {

        Animal[] animals = new Animal[3];

        animals[0] = new Animal("Dog", 20, 26);
        animals[1] = new Animal("Cow", 36, 56);
        animals[2] = new Animal("Cat", 6, 4);

        System.out.println(animals[0].name+" "+ animals[0].age+" "+ animals[0].weight);

        int[] arr = {1,2,3,4,5,6,7};
        int s = 0;
        int e = arr.length-1;

        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

        for(int i : arr){
            System.out.print(i +" ");
        }
    }    
}
