package Assignment1;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class ReverseNumber {


    // reverse number
    public int reverseNum() {

        Integer input = inputNum();
        if (input == null) {
            throw new RuntimeException("input is not found");
        }

        if (input == 0) {
            return 0;
        }

        int digit = 0;
        List<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        while (input != 0) {

            digit = input % 10;
            System.out.println("digit=" + digit);
            sb.append(digit);
            input = input / 10;

        }

        System.out.println();
//      System.out.println("count=" + count);
        int res = Integer.valueOf(sb.toString());
        return res;
    }

    //get input
    public int inputNum() throws NumberFormatException {

        Scanner sc = new Scanner(System.in);
        int input=0;
        try {
            System.out.println("Please input an integer");
            input=sc.nextInt();
        }catch(InputMismatchException Exception){
            Exception.printStackTrace();
        }
        return input;
    }

    public static void main(String[] args) {

        ReverseNumber rn = new ReverseNumber();
        int res=rn.reverseNum();
        System.out.println("res= "+res);

    }

}
