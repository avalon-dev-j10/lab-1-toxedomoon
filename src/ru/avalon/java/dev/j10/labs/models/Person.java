package ru.avalon.java.dev.j10.labs.models;

import ru.avalon.java.dev.j10.labs.commons.Adress;

/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {

    
    String fullName;
    Adress adress;
    Passport passport;

    public Person(Passport passport, Adress adress) {
        this.passport = passport;
        this.adress = adress;
    }
    
    
    /*
     * TODO(Студент): Создайте класс Address.
     *
     * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
     *
     * 2. Создайте класс, видимый из пакета. Подумайте о том
     *    Какое имя должен иметь класс, если он объявленн в этом
     *    файле.
     *
     * 3. Подумайте над тем, какие переменные должены быть
     *    определены в классе.
     *
     * 4. Подумайте над тем, какие методы должны быть объявлены
     *    в классе.
     */

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        if (passport.getSecondname() != null ) {
            return passport.getName() + " " + passport.getSecondname().charAt(0) + ". " + passport.getSurname();
        } 
        
        else if (passport.getSecondname() == null && passport.getPatronymic() == null) {
            return passport.getName() + " " + passport.getSurname();
        }
        else {
        return 
                  passport.getName () 
                + " " 
                + passport.getSurname () 
                + " " 
                + passport.getPatronymic ();
        }
    }
    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAdress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return 
                adress.getPostcode () 
                + " " 
                + adress.getCountry () 
                + " " 
                + adress.getCity () 
                + " " 
                + adress.getStreet () 
                + " " 
                + adress.getHouse ()
                + " " 
                + adress.getFlat ();
    }
}
