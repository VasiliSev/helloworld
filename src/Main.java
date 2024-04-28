public class Main {
    public static void main(String[] args) {
        //задача 1
     byte age=15;//ввод возраста
      if (age>=18) {System.out.println("Если возраст человека "+age+" то он совершеннолетний");}
      else {System.out.println("Если возраст человека "+age+", он не достиг совершеннолетия, нужно немного подождать");}
        //задача 2
     byte temp=10;//ввод значения температуры
      if (temp>5) {System.out.println("Сегодня тепло, можно идти без шапки");}
      else {System.out.println("Сегодня на улице холодно, нужно надеть шапку");}
        //задача 3
     byte speed=40;//ввод значения скорости
      if (speed>60) {System.out.println("Если скорость "+speed+",то придется заплатить штраф");}
      else {System.out.println ("Если скорость "+speed+", то можно ездить спокойно");}
        //задача 4
     byte manAge=19;
      if (manAge<2) {System.out.println("Человек еще младенец");} //это условие нужно, чтобы человека моложе двух лет не отправить на работу
      else {
       if(manAge>=2&&manAge<=6) {System.out.println("Если возраст человека равен "+manAge+", то ему нужно ходить в детский сад");}
       else if (manAge>=7&&manAge<=17) {System.out.println("Если возраст человека равен "+manAge+", то ему нужно ходить в школу");}
             else if (manAge>=18&&manAge<=24) {System.out.println("Если возраст человека равен "+manAge+", то его место в университете");}
                   else {System.out.println("Если возраст человека "+manAge+", то ему пора ходить на работу");}}
        //задача 5
     byte childAge=14;
      if (childAge<5) {System.out.println("Нельзя кататься на аттракционах");}
      else {
         if (childAge<14) {System.out.println("Можно кататься только в сопровождении взрослого");}
         else {System.out.println("Можно кататься на аттракционе без сопровождения взрослого");}
     }
        //задача 6
     byte numPass=78; //Количество пассажиров в вагоне
       if (numPass<60) {System.out.println("В вагоне имеются сидячие и стоячие места");}
       else {
           if (numPass<102) {System.out.println("В вагоне остались только стоячие места");}
           else {System.out.println("В вагоне все места заняты");}
       }
        //задача 6 c логическими переменными
     boolean sitSide=numPass<60;
     boolean standSide=numPass<102;
       if(sitSide) {System.out.println("Есть сидячие места");}
       else {
           if (standSide) {System.out.println("Есть только стоячие места");}
           else {System.out.println("Мест в вагоне нет");}
       }

        //задача 7
       int one=77;
       int two=96;
       int three=88;
       boolean OneMoreTwo=one>two;
       boolean TwoMoreThree=two>three;
       boolean OneMoreThree=one>three;
         if(OneMoreTwo)
           if(OneMoreThree) {System.out.println("Самое большое число - первое: "+one);}
           else {System.out.println("Самое большое число - третье ="+three);}
         else {
             if(TwoMoreThree) {System.out.println("Самое большое число - второе: "+ two);}
              else {System.out.println("Самое бошьшое число - третье: "+three);}
    }
}}