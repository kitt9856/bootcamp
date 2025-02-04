package demorestapi.demo_restapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// ! @SpringBootTest is a real & full beans testing env. (with spring context)
@SpringBootTest //! Complete Component Scan
class DemoRestapiApplicationTests {
	@Test // if no @test would not do test
	void contextLoads() {
		//this file is control @springBootTest, so no need add here
	}

}
