package springTest;

public class SpringIOCTest {

    public static void main(String[] args) throws Exception {

        PersonFactory personFactory = new PersonFactory();

        Person student = personFactory.getBean("student");
        student.introduce("college"); // I am a college student

        Person teacher = personFactory.getBean("teacher");
        teacher.introduce("Math"); // I am a Math teacher

    }

}
