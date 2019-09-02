package cap.stone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CapstoneApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(CapstoneApplication.class, args);

//        for (String name : ctx.getBeanDefinitionNames()){
//            System.out.println(name);
//        }
//        System.out.println("******* Bean Count *******");
//        System.out.println(ctx.getBeanDefinitionCount());
    }
}
