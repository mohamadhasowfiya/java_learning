import java.util. Scanner;

public class Main {

static void celsiusToFahrenheit (int celsius){

//Write your code here

int f = (celsius * 9.0f/5)+32;
System.out.print (f);}

public static void main (String[] args) {

Scanner scan = new Scanner (System. in) ;

int celsius = scan.nextInt () ;

celsiusToFahrenheit (celsius) ;}}
