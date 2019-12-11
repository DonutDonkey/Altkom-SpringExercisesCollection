package workshop.sb.profiles.myapp.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import workshop.sb.profiles.myapp.db.FakeDataSource;

@SpringBootApplication
@ComponentScan(basePackages = {"workshop.sb.profiles.myapp.configuration"})
public class ProfilesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ProfilesApplication.class, args);

        String url = ctx.getBean("datasource", FakeDataSource.class).getUrl();
        int port = ctx.getBean("datasource", FakeDataSource.class).getPort();
        System.out.println("RESULTS: " + url + port);
    }
}