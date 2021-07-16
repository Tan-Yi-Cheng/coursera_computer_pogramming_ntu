import java.util.Scanner;


public class App{

    private static double surface;
    private static double volumn;

    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        double h = 0,w = 0,d = 0;
        System.out.print("high= ");
        h = input.nextDouble();
        System.out.print("width= ");
        w = input.nextDouble();
        System.out.print("length= ");
        d = input.nextDouble();

        surface = 2 * ( h * w + w * d + d * h );
        volumn = h*w*d;

        System.out.println(surface + " and " + volumn);
        System.out.println("Size of surface = " + surface);
    }

}