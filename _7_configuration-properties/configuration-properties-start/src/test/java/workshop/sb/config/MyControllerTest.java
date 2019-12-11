package workshop.sb.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class) // dostarza junit4 dla springa
@SpringBootTest // dostarza spring test
@AutoConfigureMockMvc // dostarza mockmvc
@TestPropertySource("classpath:application.properties")
public class MyControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    Environment environment;

    @Test
    public void foo() throws Exception{
        mockMvc
                .perform(get("/foo"))
                .andExpect(status().isOk())
                .andExpect(content().string(environment.getProperty("test.property.foo")));
    }

    @Test
    public void bar() throws Exception{
        mockMvc
                .perform(get("/bar"))
                .andExpect(status().isOk())
                .andExpect(content().string(environment.getProperty("test.property.bar")));
    }

    @Test
    public void x() throws Exception{
        mockMvc
                .perform(get("/x"))
                .andExpect(status().isOk())
                .andExpect(content().string(environment.getProperty("test.property.x")));
    }
}