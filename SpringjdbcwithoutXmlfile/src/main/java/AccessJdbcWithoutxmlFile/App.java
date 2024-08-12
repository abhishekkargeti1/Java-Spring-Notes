package AccessJdbcWithoutxmlFile;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.Entites.Student;
import com.UserDao.UserdaoImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
       UserdaoImp userdaoimp =(UserdaoImp)context.getBean("userdao");  
       	Student student = new Student();
       	student.setId(7522);
       	student.setName("Test");
       	student.setCity("Delhi");
       int status = userdaoimp.insert(student);
       System.out.println("Row affected "+status);
       
       student.setId(1808);
       student.setName("Test");
       student.setCity("Test");
       
       int result = userdaoimp.update(student);
       System.out.println(result);
       
       List<Student> s1 = userdaoimp.getAllStudent();
       for(Student s : s1 ) {
    	   System.out.println(s);
       }
    }
}
