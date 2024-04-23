public class Main {
    public static void main(String[] args) {
        //задача 1
        byte tempIce=-25;
       short numPasseng=1500;
       int numDust=800000000;
       long lightYear=9460730472580800L;
       float rand=4.8E+24f;        double rand_2=3.2E+120;
       System.out.println("Задача 1 Значение переменной tempIce типа byte равно "+tempIce+", " +
               "значение переменной numPasseng типа short равно "+numPasseng+", " +
               "значение переменной numDust типа int равно "+numDust+", " +
               "значение переменной lightYear типа long равно"+lightYear+", " +
               "значение переменной rand типа float равно "+rand+", " +
               "значение переменной rand_2 типа double равно "+rand_2);
        //задача 2
        float vol_1=27.12f;
        long vol_2=987678965549L;
        float vol_3=2.786f;
        short vol_4=569;
        short vol_6=-159;
        short vol_7=27897;
        byte vol_8=67;
        System.out.println("Задача 2. Значения инициализированны в минимально достаточный тип переменных");
        //задача 3
        short teach_1=23;//количество учеников у Людмилы Павловны
        short teach_2=27;//количество учеников у Анны Сергеевны
        short teach_3=30;//количество учеников у Екатерины Андреевны
        short paper=480;//количество закупленной бумаги
        System.out.println("Задача 3. Каждому ученику достанется "+paper/(teach_1+teach_2+teach_3)+" листов бумаги");
        //задача 4
        short but=16;//количество бутылок за указанный единичный промежуток времени
        short time=2;//указанный единичный промежуток времени
        int period_20min=20/time;//количество единичных промежутков времени в периоде 20 мин
        int period_24h=24*60/time;//количество единичныз промежутков времени в периоде 1 сутки
        int period_3days=3*period_24h;//количество единичных промежутков времени в периоде 3 суток
        int period_mounth=10*period_3days;//количество единичных промежутков времени в периоде 1 мес, 30 дней
        System.out.println("Задача 4. За 20 минут машина произведет "+but*period_20min+" бутылок, " +
                        "за сутки - "+but*period_24h+" бутылок, за 3 суток - "+but*period_3days+" бутылок, " +
                        "за 1 месяц - "+but*period_mounth+" бутылок");
        //задача 5
        int total=120;//общее количество банок краски
        int white=2;//количество банок белой краски на 1 класс
        int brown=4;//количество банок коричневой краски на 1 класс
        int numClass=total/(white+brown);//количество классов в школе
        int totWhite=white*numClass;//общее количество банок белой краски
        int totBrown=brown*numClass;//общее количество банок коричневой краски
        System.out.println("Задача 5. В школе, где "+numClass+" классов, на ремонт было закуплено "
                +totWhite+" банок белой и "+totBrown+" банок коричневой краски");
        //задача 6
        short masBanGr=80; //масса 1 банана в граммах
        short masMilk100mlGr=105;//масса 1 единицы (100мл) молока в граммах
        short masPlombGr=100;//масса 1 брикета пломбира
        short egg=70;//масса 1 яйца
        short numBan=5;//количество бананов
        short numMilk=2;//количество единиц молока
        short numPlomb=2;//количество брикетов пломбира
        short numEggs=4;//количество яиц
        int massTotGr=masBanGr*numBan+masMilk100mlGr*numMilk+masPlombGr*numPlomb+egg*numEggs;//масса в граммах
        float masstotKg=(float)massTotGr/1000;//масса завтрака в килограммах
        System.out.println("Задача 6. Масса завтрака составляет "+massTotGr+" грамм, или "+masstotKg+" кг");
        //задача 7
        short tot=7;//килограммы, которые нужно сбросить
        short lite=250;//умеренный сброс
        short hard=500;//быстрый сброс
        int dLite=tot*1000/lite;//количество дней при умеренном сбросе
        int dHard=tot*1000/hard;//количество дней при быстром сбросе
        int middle=(dLite+dHard)/2;//среднее количество дней для сброса
        System.out.println("Задача 7. При сбросе массы по "+lite+" грамм в день, спортсмену потребуется "+dLite+
                        " дней,чтобы сбросить "+tot+" кг, если сбрасывать по "+hard+" грамм в день, то понадобится "+dHard+" дней. В среднем потребуется "+middle+" дней.");
        //задача 8
        int masha=67760;
        int denis=83690;
        int cris=76230;//текущие зарплаты сотрудников
        float mashaN=masha*1.1f;
        float denisN=denis*1.1f;
        float crisN=cris*1.1f;//новые зарплаты сотрудников
        float difMasha=12*(mashaN-masha);
        float difDenis=12*(denisN-denis);
        float difCris=12*(crisN-cris);
        System.out.println("Задача 8. Маша теперь получатет "+mashaN+" рублей в месяц, годовой доход вырос на "+difMasha+" рублей. Денис - "+denisN+" рублей в месяц, годовой доход вырос на "+difDenis+" рублей. Кристина - "+crisN+" рублей в месяц. Годовой доход вырос на "+difCris+" рублей");

    }
}