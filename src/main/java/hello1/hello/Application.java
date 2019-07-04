package hello1.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"templates", "app", "hello1.hello" })
public class Application {

    public static final void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
