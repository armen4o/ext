package learning;

public class Person {
    protected int height;
    float weight;
    public static int summ = 478;

    public static void write(String str) {
        System.out.println(str);
    }

    void say(String str){
        System.out.print(str);
    }

    public Person(int height, float weight){
        this.height = height;
        this.weight = weight;
    }

    Person () {}
}
