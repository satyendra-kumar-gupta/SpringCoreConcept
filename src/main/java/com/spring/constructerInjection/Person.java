package com.spring.constructerInjection;

public class Person {
    private int id;
    private String name;
    private  Helper help;

    public Person(int id, String name,Helper help) {
        this.id = id;
        this.name = name;
        this.help=help;
    }

    @Override
    public String toString() {
        return  this.id+" : "+this.name+"  {" +this.help+"  }";
    }
}
