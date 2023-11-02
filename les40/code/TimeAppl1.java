import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Locale;

public class TimeAppl1 {
        public static void main(String[] args) {

            //        **Работа с датами:**
//        - узнать текущую дату и время
//        - есть дата, какой это был день недели? день месяца? день года?
//        - есть дата, как узнать, это было раньше? или позже?
//
//          **Путешествие во времени**
//        - в будущее currentDay.plus
//        - в прошлое currentDay.minus
//        - использование ChronoUnit
//
//          **Получение интервала времени**
//
//          **Сортировка массива по времени**
//
//         **Date Formatter**
//
//          **Парсинг даты из строки**

            LocalDate currentDay=LocalDate.now();
            System.out.println(currentDay); // международный формат даты


            LocalTime currentTime= LocalTime.now();
            System.out.println(currentTime);

            LocalDateTime localDateTime = LocalDateTime.now();
            System.out.println(localDateTime);


            LocalDate gagrin = LocalDate.of(1961,4,12);
            System.out.println(gagrin.getYear());

            System.out.println(gagrin.getDayOfYear());
            System.out.println("Start Gagarin day of week: " +gagrin.getDayOfWeek() );


            System.out.println(gagrin.isBefore(currentDay)); // ожидаем труе
            System.out.println(gagrin.isAfter(currentDay)); // ожидаем труе

            System.out.println("============Traveling in Time==============");
            LocalDate newDate= currentDay.plusDays(50);
            System.out.println(newDate);


            newDate=currentDay.plusWeeks(12);
            System.out.println(newDate);

            System.out.println("Возврат назад на 2 месяца");
            // Какая была дата 2 месяца назад
            newDate=currentDay.minusMonths(2);
            System.out.println(newDate);

            //operation with chronaunits
            System.out.println("po 12 chasov");
            System.out.println(localDateTime.plus(9, ChronoUnit.HALF_DAYS));//сколько половинок дней прошло

            // Centure = 100 years

            newDate = currentDay.plus(2,ChronoUnit.CENTURIES);
            System.out.println("In 2 centures :" + newDate);

            System.out.println("It will be day of week "+newDate.getDayOfWeek());

            // получения интервала времени (сколько лет прошло ,скольео лет персоне)

            LocalDate einstain = LocalDate.of(1879,3,14);
            long res=ChronoUnit.YEARS.between(einstain,gagrin);
            System.out.println("Сколько лет прошло между двумя людьми" + res);

            System.out.println("Compare dates");
            System.out.println(einstain.compareTo(gagrin));// сравнение дат

            LocalDate yesterday = LocalDate.of(2023,10,30);
            System.out.println(currentDay.compareTo(yesterday));
            System.out.println("==============================================");
            // sorting time
            LocalDate[] dates= {yesterday,einstain,gagrin,currentDay};
            System.out.println(Arrays.toString(dates));/// неотсор даты
            Arrays.sort(dates);
            System.out.println(Arrays.toString(dates)); //отсорт даты в массиве


            System.out.println("============DateTime Formater===================");

            DateTimeFormatter df = DateTimeFormatter.ISO_DATE; //определили формат даты по константе
            System.out.println(gagrin.format(df));

            df=DateTimeFormatter.ofPattern("dd-MMMM-yy", Locale.ENGLISH);//задали другой формат изображения
            System.out.println(gagrin.format(df));


            System.out.println("================Parcing date from string==========");
            String str = "01/11/2023";
            System.out.println(str);

            System.out.println("_______________________________________________");
          //  LocalDate date1= LocalDate.parse(str,DateTimeFormatter.ofPattern());
            LocalDate date1= dataParce(str);
            System.out.println(date1);



            System.out.println("===============================================");
             str = "01/11/2023";
            date1=dataParce(str);
            System.out.println(date1);


        }
        private static  LocalDate dataParce(String date){ //строка на входе
            DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][dd.MM.yyyy]");//определяем как переоразуеться строка
            return LocalDate.parse(date,df); // переобразование в дату
        }

    }
