package Home_Work_Java;
/*
* Вывести все простые числа от 1 до 1000
* */

import java.util.Scanner;

public class Exercise2 {


public static boolean getSimpleNumber(int a){
    boolean b=false;

    for (int i=2;i<a;i++){
       if(a%i==0){
           b=true;
       }
    }
   return b;
}

public static int getSize(int a){
    int x=0;
    int k=2;
    while (k<=a){
      if(getSimpleNumber(k)==false){
          x++;
      }
        k++;
    }

    return x;
}

public static int[] getListSimpleNumber(int a){
   int [] listSimple=new int[getSize(a)];

   int k=2;
   int i=0;
   while (k<=a){
       if(getSimpleNumber(k)==false){
           listSimple[i]=k;

           i++;
          // System.out.println(listSimple[i]);
       }
       k++;

   }

    return listSimple;
}




    public static void main(String[] args) {
    boolean b=false;
    int a=0;
        System.out.println("Если хотите вывести список чисел от 1 до 1000 нажмите 0");
        System.out.println("Если хотите вывести свой список чисел нажмите любую другую клавишу");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        if (s.equals("0")){
            System.out.println("список чисел от 1 до 1000 ");
            int []arr=getListSimpleNumber(1000);
            for (int i=0;i<arr.length;i++) {
                System.out.println(arr[i]);
            }
            }

        else {
            System.out.println(s);
                System.out.println("Введите число любое положительное число больше 1");
               while (b==false) {
                    a = scanner.nextInt();
                   if(a<2){
                       System.out.println("Повторите ввод");

                   }
                   else {b=true;}

               }
                   int[] arr = getListSimpleNumber(a);

                   for (int i = 0; i < arr.length; i++) {
                       System.out.println(arr[i]);

                   }

        }



    }

}
