package com.soar.example.designpattern.builder;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe: 必填
 */
public class Person4 {
    private final String name;
    private final String car;
    private String age;
    private String gender;
    private String shoes;
    private String clothes;
    private String money;
    private String house;
    private String career;

    private Person4(String name, String car) {
        this.name = name;
        this.car = car;
    }

    public static class Builder {

        private Person4 person;

        public Builder(String name, String car) {
            person = new Person4(name, car);
        }

        public Builder setGender(String gender) {
            person.gender = gender;
            return this;
        }

        public Builder shoes(String shoes) {
            person.shoes = shoes;
            return this;
        }

        public Builder clothes(String clothes) {
            person.clothes = clothes;
            return this;
        }

        public Builder money(String money) {
            person.money = money;
            return this;
        }

        public Builder house(String house) {
            person.house = house;
            return this;
        }

        public Builder career(String career) {
            person.career = career;
            return this;
        }

        public Person4 build() {
            return person;
        }
    }

}
