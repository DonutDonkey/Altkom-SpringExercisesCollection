package workshop.sb.profiles.myapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import workshop.sb.profiles.myapp.db.FakeDataSource;

@Configuration
public class DataSourceConfiguration {
    @Bean(name = "datasource")
    @Profile("development")
    public FakeDataSource developmentDataSource() { return new FakeDataSource("dev-url",5555); }

    @Bean(name = "datasource")
    @Profile("production")
    public FakeDataSource productionDataSource() { return new FakeDataSource("prod-url", 8080); }
}
