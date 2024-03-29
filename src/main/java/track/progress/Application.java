package track.progress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"templates", "track.progress" })
public class Application {

    public static final void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
