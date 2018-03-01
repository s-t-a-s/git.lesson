package lesson16;

import java.io.Serializable;

public class MyStorage implements Serializable {
    public String name;
    public int age;

    @Override
    public String toString() {
        return "MyStorage{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

