package workshop.sb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
    TODO 1 oznacz klasę adnotacją @Component i @ConfigurationProperties
         ConfigurationProperties - ustaw prefix na test.property
 */
@Component
@ConfigurationProperties(prefix = "test.property")
public class MyConfig {
    private String foo;
    public  String getFoo() { return foo; }
    public  void   setFoo(String foo) { this.foo = foo; }

    private String Bar;
    public  String getBar() { return Bar; }
    public  void   setBar(String bar) { Bar = bar; }

    private int x;
    public  int getX() { return x; }
    public void setX(int x) { this.x = x; }
}
