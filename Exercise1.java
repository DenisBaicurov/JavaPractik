package Home_Work_Java;

import java.util.Scanner;

/*
* Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
* */
public class Exercise1 {

    public static int getSumRezault(int a){
        int k=0;
        if(a>0) {
            for (int i = 0; i <= a; i++) {
              k+=i;
            }
        }
        if(a<0) {
            for (int i = 0; i>= a; i--) {
                k+=i;
            }
        }



        return k;
    }

    public static int getMultiplicationRezault(int a){
       int k=1;
        if(a>0) {
            for (int i = 1; i <= a; i++) {
                k*=i;
            }
        }
        if(a<0) {
            for (int i = -1; i>= a; i--) {
                k*=i;
            }
        }



        return k;
    }

    public static void main(String[] args) {
        System.out.println("Введите любое целое число");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        scanner.close();
        if (a>0)
        {System.out.println("Суммой всех чисел от 1 до " +a+" будет  " +getSumRezault(a));
        System.out.println("Произведением всех чисел от 1 до "+a +" будет  "+getMultiplicationRezault(a));}
         if(a<0){
             System.out.println("Суммой всех чисел от -1 до " +a+" будет  " +getSumRezault(a));
             System.out.println("Произведением всех чисел от -1 до "+a +" будет  "+getMultiplicationRezault(a));

         }
         if(a==0){
             System.out.println("Ввели ноль,поэтому сумма и произведение будут "+0);

         }



    }




}
