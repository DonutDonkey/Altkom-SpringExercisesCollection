package workshop.sb.config.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
// TODO 9 ustaw profil w teście na "xml" --DONE--
@ActiveProfiles(value = "xml")
// TODO 10 ustaw context aplikacji na spring.xml --DONE--
@ContextConfiguration("classpath:spring.xml")
// TODO 11 ustaw użyte w teście propertisy na service.properties, użyj @TestPropertySource --DONE--
@TestPropertySource("classpath:service.properties")
public class GreetControllerXMLConfigTest {


/*   TODO 12 zdefiniuj pole klasy do użycia w metodzie testu
     String secondImplMsg
     użyj @Value do ładowania wartości z service.properties
*/

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnSecondImplMsgForXmlProfile() throws Exception {

/*       TODO 14 użyj mockMvc:
         GET na URI /greet
         oczekuje 200 i String'a:
         MSG + " " + msg.form.properties
*/
    }
}