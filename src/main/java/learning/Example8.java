package learning;

public class Example8 {
    public void mathOperation(){

        float num_1 = 20.6f, num_2 = 15.7f;
        float res_add, res_min, res_mul, res_div, res_div_rem;

        res_add = num_1 + num_2;
        res_div = num_1 / num_2;
        res_mul = num_1 * num_2;
        res_min = num_1 - num_2;
        res_div_rem = num_1 % num_2;
        System.out.println("Add: " + res_add);
        System.out.println("Div: " + res_div);
        System.out.println("Min: " + res_min);
        System.out.println("Mul: " + res_mul);
        System.out.println("DivRem: " + res_div_rem);


    }
}
