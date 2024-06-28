import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Конструируем массив указанных в задании студентов. Тип данных массива - родительский, а элементы являются объектами классов - наследников
        Hogwarts[] students = {
          //[0]:
                new Gryffindor("Гарри Поттер", 78, 94, 45, 98, 99),
          //[1]:
                new Gryffindor("Рон Уизли", 54, 67, 76, 34, 89),
          //[2]:
                new Gryffindor("Гермиона Грейнджер", 63, 45, 65, 56, 87),
          //[3]:
                new Hufflepuff("Захария Смит", 76, 47, 38, 89, 54),
          //[4]:
                new Hufflepuff("Седрик Диггори", 75, 67, 90, 45, 32),
          //[5]:
                new Hufflepuff("Джастин Финч-Флетчли", 67, 43, 83, 64, 34),
          //[6]:
                new Ravenclaw("Чжоу Чанг", 89, 98, 65, 48, 39, 46),
          //[7]:
                new Ravenclaw("Падма Патил", 43, 49, 21, 32, 87, 69),
          //[8]:
                new Ravenclaw("Маркус Белби", 82, 71, 64, 38, 94, 27),
          //[9]:
                new Slytherin("Драко Малфой", 64, 52, 87, 75, 78, 49, 37),
          //[10]
                new Slytherin("Грэхем Монтегю", 53, 48, 89, 36, 47, 39, 23),
          //[11]:
                new Slytherin("Грегори Гойл", 53, 83, 64, 73, 29, 54, 46)
        };

        //Выводим полное описание студента одного из факультетов. Используем метод из класса StudentService
        //В качестве параметра берем элемент массива, и указываем, что он принадлежит к классу-наследнику класса массива
        //для факультета Гриффиндор
        StudentService.print((Gryffindor) students[2]);
        System.out.println();

        //для факультета Пуффендуй
        StudentService.print((Hufflepuff) students[4]);
        System.out.println();

        //для факультета Когтевран
        StudentService.print((Ravenclaw) students[7]);
        System.out.println();

        //для факультета Слизерин
        StudentService.print((Slytherin) students[10]);
        System.out.println();

        //Вывод данных, характерных для всех студентов
        StudentService.printGeneral(students[7]);
        System.out.println();

        //сравнение двух студентов одного факультета по качествам,
        //характерным только для данного факультета
        //для факультета Гриффиндор
        StudentService.comparisonStudents((Gryffindor) students[1], (Gryffindor) students[2]);
        System.out.println();

        //для факультета Пуффендуй
        StudentService.comparisonStudents((Hufflepuff) students[4], (Hufflepuff) students[5]);
        System.out.println();

        //для факультета Когтевран
        StudentService.comparisonStudents((Ravenclaw) students[6], (Ravenclaw) students[8]);
        System.out.println();

        //для факультета Слизерин
        StudentService.comparisonStudents((Slytherin) students[11], (Slytherin) students[10]);
        System.out.println();

        //сравнение двух студентов любых факультетов по базовым навыкам
        StudentService.comparisonStudentBasic(students[2], students[10]);


    }


}





