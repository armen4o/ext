package learning;

// класс Inter относится к этому примеру.

class SomeThread extends Thread{
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("Number: " + i);
        }
    }
}

public class Example5 {
    public void exampleThread(){
        SomeThread test = new SomeThread();
        test.start(); // вызывает метод run() как поток.

        SomeThread test1 = new SomeThread();
        test1.start();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++){
                    System.out.println("Number: " + i);
                }
            }
        });

        t1.start();

    }
}
