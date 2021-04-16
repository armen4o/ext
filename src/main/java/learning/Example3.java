package learning;

public class Example3 {
    public void getException(){

        int arr[] = {23, 6, 7};


        try {
            System.out.println(arr[3]);
            int x = 100 / 0;

        } catch (ArithmeticException e){
            System.out.println("Error: " + e);
        } catch (Exception exp){
            System.out.println("Error: " + exp);
        } finally {
            System.out.println("Finally is working");
        }

    }
}
