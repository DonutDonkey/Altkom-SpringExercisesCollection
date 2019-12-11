package workshop.sb.config.service;

public class GreetServiceFirstImplementation implements GreetService {

    private String msgFormProperties;

    @Override
    public String getMsg() {
        return MSG + " " + msgFormProperties;
    }

    public GreetServiceFirstImplementation(String msg) {
        msgFormProperties = msg;
    }
}

