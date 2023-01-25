import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
        int a=0; int b=1;int c; int sum=0;
        Scanner n=new Scanner(System.in);
        System.out.println("enter any number");
        int num=n.nextInt();

        for (int i=1;i<=num;i++){
            System.out.print(a + " ");
            c=a+b;//1
            a=b;//1
            b=c;//1
        }
    }
}
