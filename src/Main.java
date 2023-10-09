public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);




   dog = dog + 4;
   cat += 4;
   paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println("paper = " + paper);

       dog -= 3.5;
       cat = cat - 1.6;
       paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println("paper = " + paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend/=  7;
        System.out.println(friend);

        var frog =3.5;
        System.out.println(frog);
        frog += 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);


        var boks1 = 78.2;
        var boks2 = 82.7;
        var massa = boks1 + boks2;
        System.out.println("Общий вес " + (boks1 + boks2));
        System.out.println(boks2 - boks1);
        System.out.println(boks2 % boks1);




        var totalHour = 640;
        var perWorker = 8;
        var workerCount = totalHour / perWorker;
        System.out.println(" Всего работников в компании " + workerCount + "человек" );
        int newWorkerCount = workerCount + 94;
        var newTotalHours = newWorkerCount * perWorker;
        System.out.println(" Если в компании работает" + newWorkerCount  + "человек , то всего" + newTotalHours
        + "часов работы может быть поделено между сотрудниками");


    }

}
