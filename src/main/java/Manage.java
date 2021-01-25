import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Manage {

    public static void main (String[] args){


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //Here Our Spring will automaticly cast the result to Personne Class
        Personne p1=   context.getBean("p1", Personne.class);
        System.out.println(p1.getId());
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
    }

}
