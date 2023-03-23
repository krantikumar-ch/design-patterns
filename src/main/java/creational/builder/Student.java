package creational.builder;


/**
 * Create a student object having firstName and lastName length more than 5
 * age is more than 10 and his psp should not less 50
 *
 */
public class Student {

    private String fName;
    private String lName;
    private double psp;
    private int age;

    private Student(Builder builder){
        this.fName = builder.fName;
        this.lName = builder.lName;
        this.psp = builder.psp;
        this.age = builder.age;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public double getPsp() {
        return psp;
    }

    public int getAge() {
        return age;
    }



    public static class Builder{
        private String fName;
        private String lName;
        private double psp;
        private int age;

        public static Builder createBuilder(){
            return new Builder();
        }

        public Student build(){
            if(!validate()){
                throw new RuntimeException("Validation failed. cannot create student object");
            }
            return new Student(this);
        }

        private boolean validate(){
            return validateName() && validatePsp() && validateAge();
        }

        private boolean validateName(){
            return fName != null && lName != null && (fName + lName).length() >=5;
        }
        private boolean validatePsp(){
            return psp >= 50;
        }

        private boolean validateAge(){
            return age >= 10;
        }


        public Builder setfName(String fName) {
            this.fName = fName;
            return this;
        }

        public Builder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
    }
}
