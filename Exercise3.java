package Home_Work_Java;

import java.util.Scanner;

// Реализовать простой калькулятор
public class Exercise3 {

    public double getSumm(double a,double b){

        return a+b;
    }
    public double getDifference(double a,double b){


        return a-b;
    }

    public double getMultiplication(double a,double b){

        return a*b;
    }

    public double getDivision(double a,double b){

        return a/b;
    }

    public void getCalculation(){
        System.out.println("Добро пожаловать в калькулятор");
        boolean b=false;
        while (b==false){
            System.out.println("Введите два числа");
            Scanner scanner=new Scanner(System.in);
            Scanner scanner1=new Scanner(System.in);
            Scanner scanner2=new Scanner(System.in);
            System.out.println("Введите первое число :");
            double x=scanner.nextDouble();
            System.out.println("Введите 2 число :");
            double y=scanner.nextDouble();
            System.out.println("Введите '+' -для сложения");
            System.out.println("Введите '-' -для вычитания");
            System.out.println("Введите '*' -для умножения");
            System.out.println("Введите '/' -для деления ");
            String s=scanner1.nextLine();
            if (s.equals("+")){
                System.out.println("Сумма чисел"+x+" и "+y+" равна: "+getSumm(x,y));
        }
            if(s.equals("-"))
            {

                System.out.println("Разность числа"+x+" с числом "+y+" равна: "+getDifference(x,y));
            }

            if(s.equals("*")){
                System.out.println("Произведение чисел"+x+" и "+y+" равно: "+getMultiplication(x,y));

            }

            if(s.equals("/")&&y!=0){
                System.out.println("Деление числа"+x+" на число "+y+" равно: "+getDivision(x,y));

            }
            if(s.equals("/")&&y==0){
                System.err.println("Делить на ноль нельзя");

            }
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")) {
                System.out.println("Если хотите выйти нажмите 0,для продолжения жмите любую другую клавишу \n");
                String str = scanner2.nextLine();
                if (str.equals("0")) {
                    System.out.println("Спасибо,  до свидания");
                    b = true;
                }
            }
            else {
                System.out.println("Неправильно выбрали операцию, пожалуйста повторите");
            }
         scanner.close();
         scanner1.close();
         scanner2.close();

        }


    }


    public static void main(String[] args) {

  Exercise3 exercise3=new Exercise3();
     exercise3.getCalculation();


    }



}
