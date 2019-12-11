package workshop.sb.config.controller.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import workshop.sb.config.controller.service.GreetService;

@Primary
@Service
public class GreetServiceImplementation implements GreetService {
    @Override
    public String getMsg() { return MSG + "First Implementation"; }
}
