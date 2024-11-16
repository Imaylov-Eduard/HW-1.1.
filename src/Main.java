public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задание№1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog=" +dog + " cat=" + cat + " paper=" + paper);

        System.out.println("Задание№2");

        var dogAdd = (dog+4);
        System.out.println(dogAdd);
        var catAdd = (cat+4);
        System.out.println(catAdd);
        var paperAdd = (paper+4);
        System.out.println(paperAdd);
        System.out.println("dog+4=" + dogAdd + " cat+4=" + catAdd + " paper+4=" + paperAdd);


        System.out.println("Задание№3");

        var dogShrink = (dogAdd-3.5);
        System.out.println(dogShrink);
        var catShrink = (catAdd-1.6);
        System.out.println(catShrink);
        var paperShrink = (paperAdd-7639);
        System.out.println(paperShrink);
        System.out.println("dogAdd-3.5=" + dogShrink + " catAdd-1.6=" + catShrink + " paperAdd-7639=" + paperShrink);


        System.out.println("Задание№4");

        var friend = 19;
        friend += 2;
        friend /= 7;
        System.out.println(friend);


        System.out.println("Задание№5");

        var frog = 3.5;
        frog *=10;
        frog /=3.5;
        frog +=4;
        System.out.println(frog);

        System.out.println("Задание№6");

        var Boxer1 = 78.2;
        var Boxer2 = 82.7;
        var totalWeight = Boxer1 + Boxer2;
        var Difference = Boxer2 - Boxer1;

        System.out.println(Boxer1);
        System.out.println(Boxer2);
        System.out.println(totalWeight);
        System.out.println(Difference);
        System.out.println("Масса первого боксера " + Boxer1 + " Масса второго боксера " + Boxer2 + " общая масса бойцов " + totalWeight + " разница в вессе " + Difference) ;

        System.out.println("Задание№7");

        var remainderOfDivision = Boxer2 % Boxer1;
        System.out.println(remainderOfDivision);


        System.out.println("Задание№8.1");

        var TotalTime = 640;
        var WorkingTime = 8;
        var NumberOfEmployees = TotalTime / WorkingTime;

        System.out.println(TotalTime);
        System.out.println(WorkingTime);
        System.out.println(NumberOfEmployees);
        System.out.println("Всего работников в компании " + NumberOfEmployees + " человк ");

        System.out.println("Задание 8.2");

        var NumberOfEmployees1 = NumberOfEmployees + 94;
        var TotalTime1 = TotalTime / NumberOfEmployees1;


        System.out.println(NumberOfEmployees1);
        System.out.println(TotalTime1);
        System.out.println("Если в компании работает " + NumberOfEmployees1 + " человека, то всего " +  TotalTime1 + " часа работы может быть поделено между сотрудниками. ");
    }
}