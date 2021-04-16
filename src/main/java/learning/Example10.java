package learning;

public class Example10 {
    public void getCase(){
        int num = 2;

        switch (num){
            case 12:
                System.out.println("Num = 12");
                break;

            case 545:
                System.out.println("Num = 545");
                break;

            case 23:
                System.out.println("Num = 23");
                if (num == 23)
                    System.out.println("All is ok!");
                break;

            default:
                System.out.println("Num is unknown!!!");
        }


    }

}
