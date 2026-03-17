import java.util.Scanner;
class string {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first(a) number:");
       int a= sc.nextInt();
       if(a%2==0){
        System.out.println("It's an even number");}
       else{
        System.out.println("It's odd number");}
        System.out.print("Enter second(b) number:");
       int b= sc.nextInt();
        if(a%2==0){
        System.out.println("It's an even number");}
       else{
        System.out.println("It's odd number");
         int sum= a+b;
         System.out.print("Total sum of 2 numbers is: "+ sum +"");
    }
       
}
}