/**
 * Test methods implemented in class Calculation.java
 * @author Jonas Schumacher
 *
 */
public class CalcTest {
	public static void main(String[] args) {
		Calculation cal = new Calculation(52.1,7.6,1,0,1);
		System.out.println(cal.getSunRise());
		System.out.println(cal.getSunMax());
		System.out.println(cal.getSunSet());
		System.out.println(cal.getAltitudeMax());
	}
}
