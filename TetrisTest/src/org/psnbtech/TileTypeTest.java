package org.psnbtech;

import java.awt.Color;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TileTypeTest</code> contains tests for the class <code>{@link TileType}</code>.
 *
 * @generatedBy CodePro at 29.10.2014 16:57
 * @author Antti
 * @version $Revision: 1.0 $
 */
public class TileTypeTest {
	/**
	 * Run the Color getBaseColor() method
	 *  test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetBaseColor_1()
		throws Exception {
		TileType fixture = TileType.TypeI;

		Color result = fixture.getBaseColor();

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.awt.Color[r=35,g=220,b=220]", result.toString());
		assertEquals(220, result.getGreen());
		assertEquals(220, result.getBlue());
		assertEquals(35, result.getRed());
		assertEquals(255, result.getAlpha());
		assertEquals(-14426916, result.getRGB());
		assertEquals(1, result.getTransparency());
	}

	/**
	 * Run the int getBottomInset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetBottomInset_1()
		throws Exception {
		TileType fixture = TileType.TypeI;
		int rotation = 1;

		int result = fixture.getBottomInset(rotation);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getBottomInset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetBottomInset_2()
		throws Exception {
		TileType fixture = TileType.TypeI;
		int rotation = 1;

		int result = fixture.getBottomInset(rotation);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getBottomInset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetBottomInset_3()
		throws Exception {
		TileType fixture = TileType.TypeI;
		int rotation = 1;

		int result = fixture.getBottomInset(rotation);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getBottomInset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetBottomInset_4()
		throws Exception {
		TileType fixture = TileType.TypeI;
		int rotation = 1;

		int result = fixture.getBottomInset(rotation);

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getCols() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetCols_1()
		throws Exception {
		TileType fixture = TileType.TypeI;

		int result = fixture.getCols();

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the Color getDarkColor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetDarkColor_1()
		throws Exception {
		TileType fixture = TileType.TypeI;

		Color result = fixture.getDarkColor();

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.awt.Color[r=24,g=154,b=154]", result.toString());
		assertEquals(154, result.getGreen());
		assertEquals(154, result.getBlue());
		assertEquals(24, result.getRed());
		assertEquals(255, result.getAlpha());
		assertEquals(-15164774, result.getRGB());
		assertEquals(1, result.getTransparency());
	}

	/**
	 * Run the int getDimension() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetDimension_1()
		throws Exception {
		TileType fixture = TileType.TypeI;

		int result = fixture.getDimension();

		// add additional test code here
		assertEquals(4, result);
	}

	/**
	 * Run the int getLeftInset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetLeftInset_1()
		throws Exception {
		TileType fixture = TileType.TypeI;
		int rotation = 1;

		int result = fixture.getLeftInset(rotation);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getLeftInset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetLeftInset_2()
		throws Exception {
		TileType fixture = TileType.TypeI;
		int rotation = 1;

		int result = fixture.getLeftInset(rotation);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getLeftInset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetLeftInset_3()
		throws Exception {
		TileType fixture = TileType.TypeI;
		int rotation = 1;

		int result = fixture.getLeftInset(rotation);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the Color getLightColor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetLightColor_1()
		throws Exception {
		TileType fixture = TileType.TypeI;

		Color result = fixture.getLightColor();

		// add additional test code here
		assertNotNull(result);
		assertEquals("java.awt.Color[r=50,g=255,b=255]", result.toString());
		assertEquals(255, result.getGreen());
		assertEquals(255, result.getBlue());
		assertEquals(50, result.getRed());
		assertEquals(255, result.getAlpha());
		assertEquals(-13434881, result.getRGB());
		assertEquals(1, result.getTransparency());
	}

	/**
	 * Run the int getRightInset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetRightInset_1()
		throws Exception {
		TileType fixture = TileType.TypeI;
		int rotation = 1;

		int result = fixture.getRightInset(rotation);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getRightInset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetRightInset_2()
		throws Exception {
		TileType fixture = TileType.TypeI;
		int rotation = 1;

		int result = fixture.getRightInset(rotation);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getRightInset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetRightInset_3()
		throws Exception {
		TileType fixture = TileType.TypeI;
		int rotation = 1;

		int result = fixture.getRightInset(rotation);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getRightInset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetRightInset_4()
		throws Exception {
		TileType fixture = TileType.TypeI;
		int rotation = 1;

		int result = fixture.getRightInset(rotation);

		// add additional test code here
		assertEquals(2, result);
	}

	/**
	 * Run the int getRows() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetRows_1()
		throws Exception {
		TileType fixture = TileType.TypeI;

		int result = fixture.getRows();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getSpawnColumn() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetSpawnColumn_1()
		throws Exception {
		TileType fixture = TileType.TypeI;

		int result = fixture.getSpawnColumn();

		// add additional test code here
		assertEquals(3, result);
	}

	/**
	 * Run the int getSpawnRow() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetSpawnRow_1()
		throws Exception {
		TileType fixture = TileType.TypeI;

		int result = fixture.getSpawnRow();

		// add additional test code here
		assertEquals(1, result);
	}

	/**
	 * Run the int getTopInset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetTopInset_1()
		throws Exception {
		TileType fixture = TileType.TypeI;
		int rotation = 1;

		int result = fixture.getTopInset(rotation);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTopInset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetTopInset_2()
		throws Exception {
		TileType fixture = TileType.TypeI;
		int rotation = 1;

		int result = fixture.getTopInset(rotation);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getTopInset(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testGetTopInset_3()
		throws Exception {
		TileType fixture = TileType.TypeI;
		int rotation = 1;

		int result = fixture.getTopInset(rotation);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the boolean isTile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testIsTile_1()
		throws Exception {
		TileType fixture = TileType.TypeI;
		int x = 1;
		int y = 1;
		int rotation = 1;

		boolean result = fixture.isTile(x, y, rotation);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean isTile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Test
	public void testIsTile_2()
		throws Exception {
		TileType fixture = TileType.TypeI;
		int x = 1;
		int y = 1;
		int rotation = 1;

		boolean result = fixture.isTile(x, y, rotation);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 29.10.2014 16:57
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TileTypeTest.class);
	}
}