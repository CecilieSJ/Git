import java.util.Scanner;

public class SuperGreeter {


    //laver en metode
    public void denFørsteMetode(){
        System.out.println("Det virker!");
    }

    //laver objektet her og kalder den
    public static void main(String[] args){
        SuperGreeter hej = new SuperGreeter();
        hej.denFørsteMetode();
        System.out.println("Hvad er dit navn?");
        Scanner scan = new Scanner(System.in);
        String greet = scan.next();
        System.out.println("Fedt! Hyggeligt at møde dig");

    }

}
