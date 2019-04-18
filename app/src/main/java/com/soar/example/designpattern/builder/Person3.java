package com.soar.example.designpattern.builder;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe: 变种Builder
 */
public class Person3 {
    private String name;
    private String age;
    private String gender;
    private String shoes;
    private String clothes;
    private String money;
    private String house;
    private String car;
    private String career;

    private Person3() {
    }

    public static class Builder {

        private Person3 person;

        public Builder() {
            person = new Person3();
        }

        public Builder setName(String name) {
            person.name = name;
            return this;
        }


        public Builder setGender(String gender) {
            person.gender = gender;
            return this;
        }

        public Builder car(String car) {
            person.car = car;
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

        public Person3 build() {
            return person;
        }
    }

}
