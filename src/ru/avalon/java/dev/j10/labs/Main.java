package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.models.*;
import ru.avalon.java.dev.j10.labs.commons.Adress;

public class Main {

    public static void main(String[] args) {

        /*
         * FIXME(Студент): Измените определение метода так, чтобы он стал точкой входа в приложение.
         */
        Passport passportIvanov = new Passport ("Иван", "Иванов");
        passportIvanov.setPatronymic ("Иванович");
        
        Passport passportSmith = new Passport("John", "Smith");
        passportSmith.setSecondname("Edvard");

        Adress adressIvanov = new Adress(196411, "Россия", "Санкт-Петербург", "Заставская", 32, 29);
        Adress adressSmith = new Adress(945899, "USA", "Oceanside", "Crouch St.", 17, 5);
        
        Person ivanov = new Person(passportIvanov, adressIvanov);
        Person smith = new Person(passportSmith, adressSmith);

        /*
         * TODO(Студент): Создайте экземпляры класса 'Person'
         *
         * 1. Проинициализируейте переменную 'ivanov', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'Иванов Иван Иванович'     
         *
         * 2. Проинициализируейте переменную 'smith', так,
         *    чтобы она адресовала объект типа 'Person'
         *    описывающий человека по имени 'John Edvard Smith'.
         */
        String fullNameIvanov = ivanov.getFullName();
        String fullNameSmith = smith.getFullName();
        
        System.out.println(fullNameIvanov); 
        System.out.println(fullNameSmith); 
        System.out.println(ivanov.getAdress()); 
        System.out.println(smith.getAdress()); 
        /*
         * TODO(Студент): Создайте несколько строковых переменных:
         *
         * 1. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 2. Строковую переменную, содержащую полное имя
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         *
         * 3. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'ivanov'.
         *
         * 4. Строковую переменную, содержащую адрес проживания
         *    человека, описанного объектом, адресованным
         *    переменной 'smith'.
         */

        /*
         * TODO(Студент): Выведите в консоль значения созданных строковых переменных:
         *
         * Значение каждой переменной должно быть выведено на
         * отдельной строке.
         */
    }
}
