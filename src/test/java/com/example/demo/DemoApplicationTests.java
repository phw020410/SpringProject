package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.ElectronConfiguration;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		ElectronConfiguration el = new ElectronConfiguration();
		el.setAtomicNumber(100);
		el.getElectronConfiguration();
	}
}
