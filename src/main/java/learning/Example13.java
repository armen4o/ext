package learning;

public class Example13 {

//    public int func(int a, int b){
//        int res;
//
//        res = a + b;
////        System.out.println("Result is: " + res);
//
//        return res;
//
//    }

    //second example
    public void personCard(){
        final float pi = 3.14f;
        Person.write("You number is: " + Person.summ);

        Person armen = new Person(174, 112.5f);
        armen.say("Hello, my name is Armen!\n");

        Person oleg = new Person();
        oleg.height = 190;
        oleg.weight = 90.6f;

        System.out.println("Armen parameters: " + armen.height + " sm" + "\t" + armen.weight + " kg");
        System.out.println("Oleg parameters:  " + oleg.height + " sm" + "    " + oleg.weight + " kg");

        Student vova = new Student(178, 98f, 3);
        System.out.println(vova.course);

    }
}
