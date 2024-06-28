public class StudentService {

    //класс методов для обработки данных о студентах

    //методы для распечатки данных студента с каждого факультета. Реализуется принцип перегрузки метода
    //для факультета Гриффиндор
    public static void print(Gryffindor gryffindor) {
        System.out.println("Имя: " + gryffindor.getName() + ", факультет: Гриффиндор");
        System.out.println("Мощность колдовстсва " + gryffindor.getMagicPower());
        System.out.println("Дистанция трансгрессии " + gryffindor.getTransgressionDistance());
        System.out.println("Благородство " + gryffindor.getNobility());
        System.out.println("Честь " + gryffindor.getHonor());
        System.out.println("Храбрость " + gryffindor.getBravery());
    }

    //для факультета Пуффендуй
    public static void print(Hufflepuff hufflepuff) {
        System.out.println("Имя: " + hufflepuff.getName() + ", факультет: Пуффендуй");
        System.out.println("Мощность колдовстсва " + hufflepuff.getMagicPower());
        System.out.println("Дистанция трансгрессии " + hufflepuff.getTransgressionDistance());
        System.out.println("Трудолюбие " + hufflepuff.getHardWork());
        System.out.println("Верность " + hufflepuff.getLoyalty());
        System.out.println("Честность " + hufflepuff.getHonesty());
    }

    //для факультета Когтевран
    public static void print(Ravenclaw ravenclaw) {
        System.out.println("Имя: " + ravenclaw.getName() + ", факультет: Когтевран");
        System.out.println("Мощность колдовстсва " + ravenclaw.getMagicPower());
        System.out.println("Дистанция трансгрессии " + ravenclaw.getTransgressionDistance());
        System.out.println("Ум " + ravenclaw.getIntellect());
        System.out.println("Мудрость " + ravenclaw.getSapience());
        System.out.println("Остроумие " + ravenclaw.getWitness());
        System.out.println("Творчество " + ravenclaw.getCreate());
    }

    //для факультета Слизерин
    public static void print(Slytherin slytherin) {
        System.out.println("Имя: " + slytherin.getName() + ", факультет: Слизерин");
        System.out.println("Мощность колдовстсва " + slytherin.getMagicPower());
        System.out.println("Дистанция трансгрессии " + slytherin.getTransgressionDistance());
        System.out.println("Хитрость " + slytherin.getCunning());
        System.out.println("Решительность" + slytherin.getResolve());
        System.out.println("Амбициозность " + slytherin.getAmbition());
        System.out.println("Находчивость " + slytherin.getInventiveness());
        System.out.println("Жажда власти " + slytherin.getLustForPower());
    }

    //метод для распечатки только данных, характерных для всех факультетов
    public static void printGeneral(Hogwarts hogwarts){
        System.out.println("Базовые характеристики студента");
        System.out.println("Имя: " + hogwarts.getName());
        System.out.println("Мощность колдовства: " + hogwarts.getMagicPower());
        System.out.println("Дистанция трансгрессии: " + hogwarts.getTransgressionDistance());
    }


    //Методы для сравнения характеристик двух студентов с разых факультетов по параметрам,
    //характерным только для этого факультета
    //для факультета Гриффиндор
    public static void comparisonStudents(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        int sum1 = gryffindor1.getBravery() + gryffindor1.getHonor() + gryffindor1.getNobility();
        int sum2 = gryffindor2.getBravery() + gryffindor2.getHonor() + gryffindor2.getNobility();
        if (sum1 > sum2) {
            System.out.println(gryffindor1.getName() + " превосходит " + gryffindor2.getName() + " по качествам, характернмым для факультета Гриффиндор");
        } else if (sum1 < sum2) {
            System.out.println(gryffindor2.getName() + " превосходит " + gryffindor1.getName() + " по качествам, характернмым для факультета Гриффиндор");
        } else {
            System.out.println(gryffindor1.getName() + " и " + gryffindor2.getName() + " одинаково хороши");
        }
    }

    //для факультета Пуффендуй
    public static void comparisonStudents(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        int sum1 = hufflepuff1.getHardWork() + hufflepuff1.getLoyalty() + hufflepuff1.getHonesty();
        int sum2 = hufflepuff2.getHardWork() + hufflepuff2.getLoyalty() + hufflepuff2.getHonesty();
        if (sum1 > sum2) {
            System.out.println(hufflepuff1.getName() + " превосходит " + hufflepuff2.getName() + " по качествам, характернмым для факультета Пуффендуй");
        } else if (sum1 < sum2) {
            System.out.println(hufflepuff2.getName() + " превосходит " + hufflepuff1.getName() + " по качествам, характернмым для факультета Пуффендуй");
        } else {
            System.out.println(hufflepuff1.getName() + " и " + hufflepuff2.getName() + " одинаково хороши");
        }
    }

    //для факультета Когтевран
    public static void comparisonStudents(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        int sum1 = ravenclaw1.getIntellect() + ravenclaw1.getSapience() + ravenclaw1.getWitness() + ravenclaw1.getCreate();
        int sum2 = ravenclaw2.getIntellect() + ravenclaw1.getSapience() + ravenclaw2.getWitness() + ravenclaw2.getCreate();
        if (sum1 > sum2) {
            System.out.println(ravenclaw1.getName() + " превосходит " + ravenclaw2.getName() + "по качествам, характернмым для факультета Когтевран");
        } else if (sum1 < sum2) {
            System.out.println(ravenclaw2.getName() + " превосходит " + ravenclaw1.getName() + " по качествам, характернмым для факультета Когтевран");
        } else {
            System.out.println(ravenclaw1.getName() + " и " + ravenclaw2.getName() + " одинаково хороши");
        }
    }

    //для факультета Слизерин
    public static void comparisonStudents(Slytherin slytherin1, Slytherin slytherin2) {
        int sum1 = slytherin1.getCunning() + slytherin1.getResolve() + slytherin1.getAmbition() + slytherin1.getInventiveness() + slytherin1.getLustForPower();
        int sum2 = slytherin2.getCunning() + slytherin2.getResolve() + slytherin2.getAmbition() + slytherin2.getInventiveness() + slytherin2.getLustForPower();
        if (sum1 > sum2) {
            System.out.println(slytherin1.getName() + " превосходит " + slytherin2.getName() + "по качествам, характернмым для факультета Слизерин");
        } else if (sum1 < sum2) {
            System.out.println(slytherin2.getName() + " превосходит " + slytherin1.getName() + "по качествам, характернмым для факультета Слизерин");
        } else {
            System.out.println(slytherin1.getName() + " и " + slytherin2.getName() + " одинаково хороши");
        }
    }

    //метод для сравнения двух студентов любых факультетов по базовым,
    //характерным для всех студентов. В качестве параметров метода используются данные
    //родительского класса
    public static void comparisonStudentBasic(Hogwarts hogwarts1, Hogwarts hogwarts2){
        int sum1 = hogwarts1.getMagicPower() + hogwarts1.getTransgressionDistance();
        int sum2 = hogwarts2.getMagicPower() + hogwarts2.getTransgressionDistance();
        if (sum1 > sum2) {
            System.out.println(hogwarts1.getName() + " превосходит " + hogwarts2.getName() + " по базовым навыкам");
        } else if (sum1 < sum2) {
            System.out.println(hogwarts2.getName() + " превосходит " + hogwarts1.getName() + " по базовым навыкам");
        } else {
            System.out.println(hogwarts1.getName() + " и " + hogwarts2.getName() + " одинаково хороши");
        }
    }
}