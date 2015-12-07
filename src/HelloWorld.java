import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

/**
 * Created by Oscar on 24-09-2015.
 */


public class HelloWorld {

    public static void main(String[] args){

        int a = 0;
        System.out.print("Hello World.");

        System.out.print("\nIndsæt tal");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();



        System.out.print(a);




    }
}
