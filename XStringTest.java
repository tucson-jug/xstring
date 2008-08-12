import junit.framework.TestCase;


public class XStringTest extends TestCase {
	public void testRev() throws Exception {
		assertEquals("cba", new XString("abc").transform("rev"));
		assertEquals("abc", new XString("abc").transform("rev/rev"));
		assertEquals("cbacbacba", new XString("abc").transform("rev/repl:3"));
	}
}
