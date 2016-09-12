package SumOfProduct;

import java.util.Scanner;

/**
 * Created by christopherworsley on 9/9/16.
 */
public class SOP {
    public void askForOption(){
        Scanner option = new Scanner(System.in);
        System.out.println("Hello, do you mind computing the sum or product of your numnber? 1 for the sum or 2 for the product? ");
        int numOption = option.nextInt();
        if (numOption == 1) {
            System.out.println(add());
        }
        else if (numOption == 2){
            System.out.println(product());
        }
    else{}



    }

    public int add(){
        Scanner value = new Scanner(System.in);
        System.out.println("What number do you choose? ");
        int numVal = value.nextInt();
        int total = 0;
        for (int i = 1; i <= numVal; i++) {
            total +=i;
        }
        return total;
    }
    public int product() {
        Scanner value1 = new Scanner(System.in);
        System.out.println("What number do you choose? ");
        int value2 = value1.nextInt();
        int total = 1;
        for (int i = 1; i <= value2; i++) {
            total *= i;
        }
        return total;
    }

    public static void main(String[] args) {
        SOP n = new SOP();
        n.askForOption();
    }
}
