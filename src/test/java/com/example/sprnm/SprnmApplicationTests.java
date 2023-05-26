package com.example.sprnm;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class SprnmApplicationTests {

	@Test
	void contextLoads() {
		Runtime rt = Runtime.getRuntime();
		try {
			System.out.println("\n============================\n Entering the testing \n============================\n");
			rt.exec("node/newman.cmd run src/main/resources/postman/sprnm.postman_collection.json");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
