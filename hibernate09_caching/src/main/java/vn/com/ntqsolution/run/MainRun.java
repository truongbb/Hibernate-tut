package vn.com.ntqsolution.run;

import org.apache.log4j.Logger;
import vn.com.ntqsolution.bo.Student;
import vn.com.ntqsolution.dao.StudentDAO;


public class MainRun {

    static Logger logger = Logger.getLogger(MainRun.class);
    static StudentDAO studentDAO = new StudentDAO();

    public static void main(String[] args) {

        studentDAO.getListByName("n").stream()
                .map(Student::getFullName)
                .filter(t -> t.contains("n"))
                .forEach(System.out::println);

        System.out.println("--------------------------------");
        studentDAO.getAll().forEach(System.out::println);

    }
}