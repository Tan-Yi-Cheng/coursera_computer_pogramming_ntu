import java.util.Scanner;
public class App{

    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);
        double h = 0,w = 0,d = 0;
        System.out.print("high= ");
        h = input.nextDouble();
        System.out.print("width= ");
        w = input.nextDouble();
        System.out.print("length= ");
        d = input.nextDouble();

        double surface, volumn;
        volumn = h*w*d;
        surface = 2 * ( h * w + w * d + d * h );
        System.out.println(surface + " and " +volumn);
    }

}