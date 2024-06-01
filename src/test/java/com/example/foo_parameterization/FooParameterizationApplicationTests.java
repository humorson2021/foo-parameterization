package com.example.foo_parameterization;

import com.example.foo_parameterization.service.VolumeCalculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FooParameterizationApplicationTests {

	@Autowired
	private VolumeCalculator volumeCalculator;

	@Test
	void contextLoads() {
	}
	@Test
	void testCalculateSphereVolume() {
		double radius = 1;
		double expected = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
		assertEquals(expected, volumeCalculator.calculateSphereVolume(radius), 0.001);
	}
	@Test
	void testCalculateSphereVolumeNegative() {
		assertThrows(IllegalArgumentException.class, () -> volumeCalculator.calculateSphereVolume(-1));
	}
}
