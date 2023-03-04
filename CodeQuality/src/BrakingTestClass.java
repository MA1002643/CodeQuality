import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BrakingTestClass {

	@Test
	void test() {
		try {
			BrakingDistanceEstimator a = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,1,0);
			BrakingDistanceEstimator b = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DAMP,1,0);
			BrakingDistanceEstimator c = new BrakingDistanceEstimator(BrakingConditions.WEATHER_WET,1,0);

			//assertTrue(a.getBrakingDistanceFor(20)<a.getBrakingDistanceFor(30));
			//assertTrue(a.getBrakingDistanceFor(50)<b.getBrakingDistanceFor(50));
			assertTrue(a.getBrakingDistanceFor(50)<c.getBrakingDistanceFor(50));
			
			
			}
		catch(Exception e) {
			fail("Not yet implemented");
		}
	}

}
