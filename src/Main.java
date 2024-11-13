public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задание№1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("Задание№2");

        var dog1 = 8.0 + 4;
        var cat1 = 3.6 + 4;
        var paper1 = 763789 + 4;

        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(paper1);

        System.out.println("Задание№3");

        var dog2 = 8.0 + 4 - 3.5;
        var cat2 = 3.6 + 4 - 1.6;
        var paper2 = 763789 + 4 - 7639;

        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);

        System.out.println("Задание№4");

        var friend = 19;
        var friend1 = 19 + 2;
        var friend2 = friend1 / 7;

        System.out.println(friend);
        System.out.println(friend1);
        System.out.println(friend2);

        System.out.println("Задание№5");

        var frog = 3.5;
        var frog1 = 3.5 * 10;
        var frog2 = frog1 / 3.5;
        var frog3 = frog2 + 4;

        System.out.println(frog);
        System.out.println(frog1);
        System.out.println(frog2);
        System.out.println(frog3);

        System.out.println("Задание№6");

        var Boxer1 = 78.2;
        var Boxer2 = 82.7;
        var TotalWeight = Boxer1 + Boxer2;
        var Difference = Boxer2 - Boxer1;

        System.out.println(Boxer1);
        System.out.println(Boxer2);
        System.out.println(TotalWeight);
        System.out.println(Difference);

        System.out.println("Задание№7");

        var DifferenceWeight1 = Boxer2 - Boxer1;
        var DifferenceWeight2 = Boxer2 % Boxer1;

        System.out.println(DifferenceWeight1);
        System.out.println(DifferenceWeight2);

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
        var TotalTime1 = WorkingTime * NumberOfEmployees1;

        System.out.println(NumberOfEmployees1);
        System.out.println(TotalTime1);
        System.out.println("Если в компании работает " + NumberOfEmployees1 + " человека, то всего " +  TotalTime1 + " часа работы может быть поделено между сотрудниками. ");
    }
}