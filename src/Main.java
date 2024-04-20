public class Main {
    public static void main(String[] args) {
        //задача 1
        var dog=8.0;
       var cat=3.6;
       var paper=763789;
       System.out.println("dog="+dog+","+"cat="+cat+","+"paper="+paper);
        //задача 2
       dog=dog+4;
       cat=cat+4;
       paper=paper+4;
        System.out.println("dog="+dog+","+"cat="+cat+","+"paper="+paper);
        //задача 3
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println("dog="+dog+","+"cat="+cat+","+"paper="+paper);
        //задача 4
        var friend=19;
        System.out.println("friend="+friend);
        friend=friend+2;
        System.out.println("friend="+friend);
        friend=friend/7;
        System.out.println("friend="+friend);
        //задача 5
        var frog=3.5;
        System.out.println("frog="+frog);
        frog=frog*10;
        System.out.println("frog="+frog);
        frog=frog/3.5;
        System.out.println("frog="+frog);
        frog=frog+4;
        System.out.println("frog="+frog);
        //задача 6
        var boxer1=78.2;
        var boxer2=82.5;
        System.out.println("общая масса двух боксеров равна "+(boxer1+boxer2)+" кг");
        System.out.println("разница в весе боксеров равна "+Math.abs(boxer1-boxer2)+" кг");
        //задача 7
        System.out.println("остатот от деления весов боксеров равен "+boxer2%boxer1);
        //задача 8
        var timeVol=640;
        var workerTime=8;
        System.out.println("Количество сотрудников в компании "+timeVol/workerTime+" человек");
        var NewWorkerNum=timeVol/workerTime+94;
        System.out.println("Если в компании будет работать "+NewWorkerNum+" человек, то "+NewWorkerNum*8+" часов может быть поделено между сотрудниками");
    }
}