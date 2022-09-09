import java.util.Scanner;

public class SuperGreeter {


    //laver en metode
    public void denFørsteMetode(){
        System.out.println("Hvad er dit navn!");
    }

    public void askAboutAge(){
        System.out.print("Hvor gammel er du?");
    }


    //laver objektet her og kalder dem

    public static void main(String[] args){
        SuperGreeter navnPerson = new SuperGreeter();
        navnPerson.denFørsteMetode();

        Scanner scan = new Scanner(System.in);
        String navn = scan.next();
        System.out.println( "Hej " + navn + " Hyggeligt at møde dig!");

        SuperGreeter age = new SuperGreeter();
        age.askAboutAge();
        int askAboutAge = scan.nextInt();
        System.out.print(askAboutAge + " WOW! Du ser meget yngre ud");

    }

}
