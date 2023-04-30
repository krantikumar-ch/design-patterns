package creational.prototype;

public class Student implements Prototype<Student>{
    private int age;
    private double psp;
    private String email;
    private String name;

    private String batch;
    private double avgBatchPsp; //Write a query for this

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    @Override
    public Student clone() {
        Student copy = new Student();
        copy.age = this.age;
        copy.psp = this.psp;
        copy.email = this.email;
        copy.name = this.name;
        copy.batch = this.batch;
        copy.avgBatchPsp = this.avgBatchPsp;
        return copy;
    }
}
