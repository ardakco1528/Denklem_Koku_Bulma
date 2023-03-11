import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
          // (ax²+bx+c) bicimindeki denklemlerin koklerini  bulan program.
        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        System.out.println("(ax²+bx+c) ikinci dereceden bir denklemdir.\n Denklemdeki sabitleri asagıdaki gibi sırayla girin: ");

        System.out.print("a: ");
        a = scanner.nextDouble();

        System.out.print("b: ");
        b = scanner.nextDouble();

        System.out.print("c: ");
        c = scanner.nextDouble();

        // a sıfırdan buyuk-esit olursa sart saglanır.
        if(!(a <= 0)){
            System.out.print(" Diskriminant hesaplanıyor...\n");
            double delta = (Math.pow(b,2) ) - (4 * a * c);
            System.out.println("Diskriminant = " + (delta));
            if(delta > 0){
                System.out.println("Denklemin iki farklı gercel koku vardır.");
                double x_1 = (-b + Math.sqrt(delta)) / (2 * a), x_2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println(" x1 = " + (x_1));
                System.out.println(" x2 = " + (x_2));
            }else{
                System.out.println("Denklemin gercel koku yoktur.Cozumu bulunamaz.");}
            if(delta == 0){
                System.out.println("Denklemin birbirine esit iki gercel koku vardır.");
                double x = (-b) / (2 * a);
                System.out.println(" x = " + (x));}
        }else{
            System.out.print("Lutfen a icin sıfırdan farklı bir deger giriniz.");
        }
        System.out.print("Program sonlandı.");
    }
}