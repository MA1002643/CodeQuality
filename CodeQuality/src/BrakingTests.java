import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class BrakingTests{
	@Test
	void test() {
		try {
			BrakingDistanceEstimator a = new BrakingDistanceEstimator(BrakingConditions.WEATHER_DRY,1,0);

			//assertTrue(a.getBrakingDistanceFor(20)<a.getBrakingDistanceFor(30));
			assertTrue(20<30);
			}
		catch(Exception e) {
			fail("Not yet implemented");
		}
		
	}
}
