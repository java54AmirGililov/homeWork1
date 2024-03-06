package homeWork1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HomeWorkMethods {

	@Test
	@DisplayName("test of the method compareTo")
	void compareTo() {
		String a = "String number 1";
		String b = "String number 2";
		int result = compareTo(a, b);
		assertTrue(result < 0);
	}
	public int compareTo(String a,String b) {
	return a.compareTo(b);
	}

	@Test
	@DisplayName("test of the method compareToIgnoreCase")
	void compareToIgnoreCase () {
		String c = "string for test";
		String d = "STRING FOR TEST";
		int result = compareToIgnoreCase(c, d);
		assertEquals(0,result);
	}
	public int compareToIgnoreCase (String c,String d) {
	return c.compareToIgnoreCase(d);
	}
	@Test
	@DisplayName("test of the method concat")
	void concat () {
		String e = "Concat";
		String f = " Test";
		String result = e.concat(f);
		assertEquals("Concat Test",result);
	}
	public static String concat (String c,String d) {
		return c.concat(d);
	}
	@Test
	@DisplayName("test of the method startsWith")
	void startsWith () {
		String g = "startsWith test";
		boolean result = (g.startsWith("startsWith"));
		assertTrue(result);
	}
	@Test
	@DisplayName("test of the method endsWith")
	void endsWith () {
		String h = "startsWith test";
		boolean result = (h.endsWith("test"));
		assertTrue(result);
	}
	@Test
	@DisplayName("test of the method equalsIgnoreCase")
	void equalsIgnoreCase () {
		String i = "equalsignorecase test";
		String j = "EQUALSIGNORECASE TEST";
		boolean result = (i.equalsIgnoreCase(j));
		assertTrue(result);
	}
	@Test
	@DisplayName("test of the method indexOf(string string)")
	void indexOf () {
		String k = "indexOf test";
		int result  = k.indexOf("test");
		assertTrue(result == 8);
	}
	@Test
	@DisplayName("test of the method lastIndexOf(int ch)")
	void lastIndexOf () {
		String l = "lastIndexOf test test test test test";
		int result  = l.lastIndexOf("test");
		assertTrue(result == 32);
	}
}