import java.util.Scanner;
public class Student1 {
   public static void main(String[] args) {
    


Scanner sc=new Scanner(System.in);
System.out.println("input Student data");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
        
        Student ob = new Student();
        ob.getData( a,b,c);
            ob.show();
}
}