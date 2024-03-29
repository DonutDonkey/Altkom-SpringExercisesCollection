package workshop.sb.config.controller.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import workshop.sb.config.controller.service.GreetService;
import workshop.sb.config.controller.service.GreetServiceFirstImplementation;
import workshop.sb.config.controller.service.GreetServiceSecondImplementation;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GreetControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnMsgFromPrimaryService() throws Exception {
        this.mockMvc.perform(get("/greet"))
                .andExpect(status().isOk())
                .andExpect(content().string(GreetService.MSG+ GreetServiceSecondImplementation.SECOND_IMPL));
    }
}