package ru.avalon.java.dev.j10.labs.commons;

public class Adress {
    private int postcode;
    private String country,
                   city,
                   street;
    private int house,
                flat;
    
    public Adress (int postcode,
                        String country,
                        String city,
                        String street,
                        int house,
                        int flat)
    {
    this.postcode = postcode;
    this.country = country;
    this.city = city;
    this.street = street;
    this.house = house;
    this.flat = flat;
    }
    
    public int getPostcode() {
    return postcode;
    }
    
    public String getCountry () {
    return country;
    }
    
    public String getCity () {
    return city;
    }
    
    public String getStreet () {
    return street;
    }
    
    public int getHouse() {
    return house;
    }
    
    public int getFlat() {
    return flat;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }
    
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
