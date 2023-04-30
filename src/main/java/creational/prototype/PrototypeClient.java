package creational.prototype;

public class PrototypeClient {

    public static final String APR_22 = "APR_22";

    public static void main(String[] args) {
        PrototypeClient client = new PrototypeClient();
        client.fillRegistry();
        Student roshan = StudentRegistry.getStudentRegistry().getStudentPrototype(APR_22).clone();
        roshan.setName("roshan");
        roshan.setAge(29);
    }

    public void fillRegistry(){
        StudentRegistry studentRegistry = StudentRegistry.getStudentRegistry();
        Student apr22= new Student();
        apr22.setBatch("apr 22");
        apr22.setAvgBatchPsp(89.88);
        studentRegistry.registerProtoType(APR_22, apr22);
    }
}
