package com.soar.example.designpattern.builder;

/**
 * NAME：YONG_
 * Created at: 2019/4/17
 * Describe:带必填项的Builder模式
 */
public class Person2 {
    private final String name;//必填
    private final String age;//必填
    private String gender;
    private String shoes;
    private String clothes;
    private String money;
    private String house;
    private String car;
    private String career;

    private Person2(Builder builder) {
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
        private final String name;
        private final String age;
        private String gender;
        private String shoes;
        private String clothes;
        private String money;
        private String house;
        private String car;
        private String career;

        public Builder(String name, String age) {
            this.name = name;
            this.age = age;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
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

        public Person2 build() {
            return new Person2(this);
        }
    }

}
