package Home_Work_Java;

import java.util.Scanner;

/*
* Задано уравнение вида q + w = e, q, w, e >= 0.
*  Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
* Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
*
* */
public class Exercise4 {

    public static int getNumberone() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число в диапазоне от 1 до 9");
        int a = scanner.nextInt();
        if (a < 1 || a > 9) {
            System.err.println("Число вышло из диапозона");
            getNumberone();
        }
        return a;
    }

    public static int getNumbertwo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите второе число в диапазоне от 1 до 9");
        int a = scanner.nextInt();
        if (a < 1 || a > 9) {
            System.err.println("Число вышло из диапозона");
            getNumbertwo();
        }
        return a;
    }

    public static int getNumberfree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите третье число в диапазоне от 10 до 99");
        int a = scanner.nextInt();
        if (a < 10 || a > 99) {
            System.err.println("Число вышло из диапозона");
            getNumberfree();
        }
        return a;

    }


    public static void main(String[] args) {
     int x=getNumberone();
     int y=getNumbertwo();
     int z=getNumberfree();
     int a=1;


       String s3=Integer.toString(z);
       char[]ch=new char[s3.length()];
       for (int i=0;i<ch.length;i++){
           ch[i]=s3.charAt(i);
       }
      int one=Integer.parseInt(String.valueOf(ch[0]));
       int two=Integer.parseInt(String.valueOf(ch[1]));
       if(x>one||y>=two||((one-x)!=(two-y))){
           System.out.println("Для данного выражения решений нет");
       }
       else {
          a =one-x;

           System.out.println(" Искомое число "+a);
           String s1=Integer.toString(x)+Integer.toString(a);
           String s2=Integer.toString(a) +Integer.toString(y);
           System.out.println("Искомое выражение : "+s1 +" + "+s2+" = "+s3);

       }



    }
}