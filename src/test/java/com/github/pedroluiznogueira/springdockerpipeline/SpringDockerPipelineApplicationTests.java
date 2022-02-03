package com.github.pedroluiznogueira.springdockerpipeline;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("dev") // make use of the application-dev.properties
class SpringDockerPipelineApplicationTests {

	@Test
	void contextLoads() {
	}

}
