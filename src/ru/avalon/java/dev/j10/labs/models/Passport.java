package ru.avalon.java.dev.j10.labs.models;
import java.util.Date;
/**
     * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
    public int serial;
    public String name,
                  surname,
                  patronymic,
                  secondname,
                  passchief,
                  adress;
    public Date birthday,
                passday;
    public Passport (String name, String surname){
            this.name = name;
            this.surname = surname;
    }
    public Passport (int serial,
                    String name,
                    String surname,
                    String secondname,
                    String patronymic,
                    Date birthday,
                    Date passday,
                    String passchief,
                    String adress)
    {
    this.serial = serial;
    this.name = name;
    this.surname = surname;
    this.patronymic = patronymic;
    this.secondname = secondname;
    this.birthday = birthday;
    this.passday = passday;
    this.passchief = passchief;
    this.adress = adress;
    }
    
    public int getSerial() {
    return serial;
    }
    
    public String getName () {
    return name;
    }
    
    public String getSurname () {
    return surname;
    }
    
    public String getPatronymic () {
    return patronymic;
    }
    
    public String getSecondname () {
    return secondname;
    }
    
    public String getPasschief () {
    return passchief;
    }
    
    public String getAdress() {
    return adress;
    }
    
    public Date getBirthday () {
    return birthday;
    }
    
    public Date getPassday () {
    return passday;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }

    public void setPasschief(String passchief) {
        this.passchief = passchief;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setPassday(Date passday) {
        this.passday = passday;
    }
    
    
}
    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
