import java.util.Scanner;
class alphanum
{
    
    public static void main(String[] args) {
        Scanner scn1=new Scanner(System.in);
        System.out.println("enter the character");
        char n=scn1.next().charAt(0);
        if((n>=65 && n<=90)||(n>=97 && n<=122))
        {
            System.out.println("alphabet");
        }
        else if(n>=48 && n<=57)
        {
            System.out.println("numeric");
        }
        else
        {
            System.out.println("special character");
    
        }
    }
}