package workshop.sb.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// TODO 7 dodaj @ImportResource (dla ładowania konfiguracji XML przy starcie aplikacji)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


// TODO 2 przejdź do spring.xml - skonfiguruj aplikację