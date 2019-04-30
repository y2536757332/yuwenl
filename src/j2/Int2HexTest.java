package j2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Int2HexTest {

	@Test
	public void testI2h() {
		int a=0,b=37,c=43;
		String st="0",str1="25",str2="2B";
		Int2Hex i2hh=new Int2Hex();
		assertTrue(i2hh.i2h(a).equals(st));
		assertTrue(i2hh.i2h(b).equals(str1));
		assertTrue(i2hh.i2h(c).equals(str2));
	}

	@Test
	public void testI2c() {
		int a=8,b=11,c=15;
		char A=(char)(a+48);
		char B=(char)(b+55);
		char F=(char)(c+55);
		Int2Hex i2h=new Int2Hex();
		assertTrue(i2h.i2c(a)==A);
		assertTrue(i2h.i2c(b)==B);
		assertTrue(i2h.i2c(c)==F);
	}

}
