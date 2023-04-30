package creational.prototype;

import java.util.HashMap;

public class StudentRegistry implements Cloneable{

    private  HashMap<String, Student> registryMap = new HashMap();
    private static StudentRegistry  studentRegistry = null;
    // make singleton class
    private StudentRegistry(){

    }
    static{
        studentRegistry = new StudentRegistry();
    }

    public static StudentRegistry getStudentRegistry(){
        return studentRegistry;
    }

    public StudentRegistry clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

    public void registerProtoType(String key, Student student){
        registryMap.put(key, student);
    }

    public Student getStudentPrototype(String key){
        return registryMap.get(key);
    }

}
