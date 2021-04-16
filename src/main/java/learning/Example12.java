package learning;

public class Example12 {
    public void getStructuredData(){

//        float [] arr = new float[]{56.2f, 489.5f, 325.654f};
//        for (int i = 0; i < arr.length; i++){
//            System.out.println("Index: [" + i + "] = " + arr[i]);
//        }
//
//

        //34:50
        int [][] arr = new int[][]{
                {23, 78, 65, 89},
                {25, 56, 65, 88},
                {56, 88, 77, 99}
        };

        arr[1][1] = 555;
//        System.out.println("Element arr[1][1] = 56 replacement on " + arr[1][1]);

        for(int i = 0; i < 3 ; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println("");
        }


    }
}
