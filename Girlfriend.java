package test;

public class Girlfriend {
    private int age;
    private String name;

    public String toString() {
        return "Girlfriend { name = " + name + " age = " + age + " }";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18 || age > 40) {
            throw new AgeOutOfBoundException(age+"不在范围内");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3 || name.length() > 10) {
            throw new NameFormatException(name+"格式错误");
        }
        this.name = name;
    }
}
