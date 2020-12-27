
import java.util.Random;
import java.util.Scanner;

// Random Password and OTP generator
// version 1.0.0

public class passwordGenerator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to Random Password Generator App.");
        char ch='y';
        do {
            System.out.println("");
            System.out.println("1: Generate Password");
            System.out.println("2: Generate OTP");
            System.out.println("");
            System.out.print("Enter your choice : ");
            int choice=in.nextInt();
            switch(choice){
                case 1:
                    System.out.println("We recommend getting at least 6 digit password.");
                    System.out.print("Enter the length of the password : ");
                    int len=in.nextInt();
                    String pwd=pwdGenerator(len);
                    System.out.println("Unique Password : "+pwd);
                    break;

                case 2:
                    String otp=otpGen();
                    System.out.println("Unique OTP : "+otp);
                    break;

                default:System.out.println("Oops !! Please check your input.");
                    break;
            }
            System.out.println("Do you want to continue?[Yes-y | No-n]");
            ch=in.next().charAt(0);
        } while(ch=='y' || ch=='Y');

    }

    public static String pwdGenerator(int len){

        String cap_letter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_letter="abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        String symbols = "!@#$%^&*_=+-/.?<>)";

        String tot_val=cap_letter+small_letter+numbers+symbols;
        Random rdm=new Random();

        String unq_pass="";
        for (int i = 0; i < len; i++) {
            unq_pass=unq_pass+(tot_val.charAt(rdm.nextInt(tot_val.length())));
        }
        return unq_pass;
    }

    public static String otpGen(){
        int randomPin=(int) (Math.random()*9000)+1000;
        String otp=String.valueOf(randomPin);
        return otp;
    }
}
