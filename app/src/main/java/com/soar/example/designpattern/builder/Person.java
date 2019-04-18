package com.soar.example.designpattern.builder;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe: 普通Builder模式
 */
public class Person {
    private String name;
    private String gender;
    private String age;
    private String shoes;
    private String clothes;
    private String money;
    private String house;
    private String car;
    private String career;

    private Person(Builder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.age = builder.age;
        this.shoes = builder.shoes;
        this.clothes = builder.clothes;
        this.money = builder.money;
        this.house = builder.house;
        this.car = builder.car;
        this.career = builder.career;
    }

    public static class Builder {
        private String name;
        private String gender;
        private String age;
        private String shoes;
        private String clothes;
        private String money;
        private String house;
        private String car;
        private String career;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder age(String age) {
            this.age = age;
            return this;
        }

        public Builder car(String car) {
            this.car = car;
            return this;
        }

        public Builder shoes(String shoes) {
            this.shoes = shoes;
            return this;
        }

        public Builder clothes(String clothes) {
            this.clothes = clothes;
            return this;
        }

        public Builder money(String money) {
            this.money = money;
            return this;
        }

        public Builder house(String house) {
            this.house = house;
            return this;
        }

        public Builder career(String career) {
            this.career = career;
            return this;
        }

        public Person build() {
            Person person = new Person(this);
            person.age = "1";
            return new Person(this);
        }

//        public Person build() {
//            Person person = new Person();
//            person.age = age;
//            return person;
//        }
    }

}
