package workshop.sb.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.containsString;
import static junit.framework.TestCase.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class HelloControllerTests {


    @Autowired
    private MockMvc mockMvc;


    @Test
    public void shouldReturnHelloFromProperties() throws Exception {
        this.mockMvc
                .perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("hello from properties")));
    }

/* -- Poniewaz zawsze w przypadku kolizji nazw bedzie bral z .properties to test konczy sie niepowodzeniem

    @Test
    public void shouldReturnHelloFromYaml() throws Exception {
        this.mockMvc
                .perform(get("/helloYML"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("hello from yaml")));
    }

 */

    @Test
    public void shouldReturnMsgFromProperties() throws Exception {
        this.mockMvc
                .perform(get("/bar"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("bar from properties")));
    }

    @Test
    public void shouldReturnFooFromYAML() throws Exception {
        this.mockMvc
                .perform(get("/foo"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("foo from yaml")));
    }

}

