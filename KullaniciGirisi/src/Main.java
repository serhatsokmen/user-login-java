import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nn,psw,nwPsw;

        int s;


        System.out.print("kullanici adinizi giriniz : ");
        nn = scan.nextLine();

        System.out.print("parolanizi giriniz : ");
        psw = scan.nextLine();

        if(nn.equals("Patika") && psw.equals("Dev")) {
            System.out.println("giris yapiliyor...");
        }
        else if(!(nn.equals("Patika")) && psw.equals("Dev")) {
            System.out.println("kullanici adi hatali tekrar deneyiniz!");
        }
        else if(!(nn.equals("Patika")) && !(psw.equals("Dev"))) {
            System.out.println("kullanici adi veya sifre hatali tekrar deneyin.");
        }
        else if(nn.equals("Patika") && !(psw.equals("Dev"))) {
            System.out.println("hatali sifre. Sifreyi sifirlamak ister misiniz? evet ise 1 hayir ise 0.");
            s = scan.nextInt();

            if( s == 1) {
                System.out.print("yeni sifrenizi giriniz : ");
                Scanner scann = new Scanner(System.in);
                nwPsw = scann.nextLine();
                if(nwPsw.equals("Dev")) {
                    System.out.println("Eski sifre ile yeni sifre ayni olamaz. Tekrar deneyin.");
                }
                else {
                    System.out.println("yeni sifre olusturuldu.");
                }
            }

            else if(s == 0) {
                System.out.println("cikis yapiliyor...");
            }
            else {
                System.out.println("hatali tuslama yaptiniz tekrar deneyin.");
            }

        }

    }
}