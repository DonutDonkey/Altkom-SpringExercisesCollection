package workshop.sb.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static junit.framework.TestCase.fail;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class CalculatorApplicationTests {

    @Autowired // Some new injector?
    MockMvc mockMvc;

    @Test
    public void shouldSum() throws Exception {
        this.mockMvc.perform(get("/sum/2/2"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("4.0")));
    }

    @Test
    public void shouldSubstract() throws Exception {
        this.mockMvc.perform(get("/sub/2/2"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("0.0")));
    }

    @Test
    public void shouldMultiply() throws Exception {
        this.mockMvc.perform(get("/multiply/2/2"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("4.0")));
    }

    @Test
    public void shouldDivide() throws Exception {
        this.mockMvc.perform(get("/divide/2/2"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("1.0")));
    }
}
