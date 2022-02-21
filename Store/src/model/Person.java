package model;

public class Person {

   private String fio;
   private String post;
   private int age;
   private int workAge;

    public Person(String fio, String post, int age, int workAge) {
        this.fio = fio;
        this.post = post;
        this.age = age;
        this.workAge = workAge;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", post='" + post + '\'' +
                ", age=" + age +
                ", workAge=" + workAge +
                '}';
    }
}
