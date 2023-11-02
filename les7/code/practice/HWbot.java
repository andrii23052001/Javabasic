package practice;

import java.util.Scanner;

//Написать бот, который задет не менее 3-х вопросов (последовательно),
       // принимает ответы от пользователя и реагирует на эти ответы. Пример:
       //  Как вас зовут? Очень приятно, меня зовут Бот1. Какой у вас вес? 106 кг.
        // А какой рост? А какой возраст? ... Варианты ответов..., которые отвечает бот.
public class HWbot {
  public static void main(String[] args) {
   Scanner scanner=new Scanner(System.in);
   System.out.println("Привет.Как тебя зовут?");
   String name= scanner.next();
   switch (name){
   case "Андрей"->System.out.println("Приятно познакомиться,меня зовут бот-убийца,я убийца креветок");
    }
    Scanner scanner1=new Scanner(System.in);
   System.out.println("А сколько тебе лет,мой дорогой ?");
   String years= scanner.next();
   switch (years){
    case "22" -> System.out.println("Вы очень молоды и горячи, мне 55 , но в 22 я поймал свою первую креветку,эх вернуть бы молодость!!!!!");
   }Scanner scanner2=new Scanner(System.in);
   System.out.println("Простите за мой вопрос.А какой у вас вес в килограммах???");
   String weight= scanner.next();
   switch (weight){
    case "80" -> System.out.println("Ухх.Я надеюсь это 80-килограмм :это ваша мышечная масса или вы достаточно высоки,если нет идите в зал");
   }
   }
  }

