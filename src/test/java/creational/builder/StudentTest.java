package creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void test1(){
        Student s = new Student.Builder()
                .setfName("kranti")
                .setlName("kumar")
                .setAge(34)
                .setPsp(90.0)
                .build();
    }



    @Test
    public void test2(){
        Throwable exception = assertThrows(RuntimeException.class, () -> new Student.Builder()
                .setfName("kranti")
                .setAge(34)
                .setPsp(90.0)
                .build());
        assertEquals("Validation failed. cannot create student object", exception.getMessage());
    }

    @Test
    public void test3(){
        Student s =Student.Builder.createBuilder()
                .setfName("kranti")
                .setlName("kumar")
                .setAge(34)
                .setPsp(90.0)
                .build();
    }

}