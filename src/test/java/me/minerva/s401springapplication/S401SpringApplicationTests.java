package me.minerva.s401springapplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
//@TestPropertySource(properties = "jay.name=james")  // 1순위
@SpringBootTest(properties = "jay.name=james")        // 2순위
@TestPropertySource(locations = "classpath:/test.properties") // 3순위
public class S401SpringApplicationTests {

    @Autowired
    Environment environment;

    @Test
    public void contextLoads() {
        assertThat(environment.getProperty("jay.name"))
                .isEqualTo("james");
        assertThat(environment.getProperty("jay.fullName"))
                .isEqualTo("james Test");
    }
}
