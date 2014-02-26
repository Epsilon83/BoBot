package IUT.BoBot.SmartCells;

import static org.junit.Assert.*;

import org.junit.Test;

public class AuRevoirTest {
	AuRevoir cell = new AuRevoir();

	@Test
	public void testAuRevoir() {
		assertEquals("Au revoir!", cell.ask("Au revoir!"));
	}
	
	@Test
	public void testNotAuRevoir() {
		assertEquals(null, cell.ask("Malpolis!"));
	}
}
