package algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HugeIntegerTest {

    @Test
    public void testParse() {
        HugeInteger hugeInt = new HugeInteger();
        hugeInt.parse("1234567890123456789012345678901234567890");
        assertEquals("1234567890123456789012345678901234567890", hugeInt.toString());
    }

    @Test
    public void testToString() {
        HugeInteger hugeInt = new HugeInteger();
        hugeInt.parse("1234567890");
        assertEquals("1234567890", hugeInt.toString());
    }

    @Test
    public void testAdd() {
        HugeInteger hugeInt1 = new HugeInteger();
        HugeInteger hugeInt2 = new HugeInteger();
        hugeInt1.parse("12345");
        hugeInt2.parse("54321");

        hugeInt1.add(hugeInt2);
        assertEquals("66666", hugeInt1.toString());
    }

    @Test
    public void testSubtract() {
        HugeInteger hugeInt1 = new HugeInteger();
        HugeInteger hugeInt2 = new HugeInteger();
        hugeInt1.parse("10000");
        hugeInt2.parse("5000");

        hugeInt1.subtract(hugeInt2);
        assertEquals("5000", hugeInt1.toString());
    }

    @Test
    public void testIsEqualTo() {
        HugeInteger hugeInt1 = new HugeInteger();
        HugeInteger hugeInt2 = new HugeInteger();
        hugeInt1.parse("12345");
        hugeInt2.parse("12345");

       assertTrue(hugeInt1.isEqualTo(hugeInt2));
    }

    @Test
    public void testIsNotEqualTo() {
        HugeInteger hugeInt1 = new HugeInteger();
        HugeInteger hugeInt2 = new HugeInteger();
        hugeInt1.parse("12345");
        hugeInt2.parse("54321");

        assertTrue(hugeInt1.isNotEqualTo(hugeInt2));
    }

    @Test
    public void testIsGreaterThan() {
        HugeInteger hugeInt1 = new HugeInteger();
        HugeInteger hugeInt2 = new HugeInteger();
        hugeInt1.parse("54321");
        hugeInt2.parse("12345");

       assertTrue(hugeInt1.isGreaterThan(hugeInt2));
    }

    @Test
    public void testIsLessThan() {
        HugeInteger hugeInt1 = new HugeInteger();
        HugeInteger hugeInt2 = new HugeInteger();
        hugeInt1.parse("12345");
        hugeInt2.parse("54321");

        assertTrue(hugeInt1.isLessThan(hugeInt2));
    }

    @Test
    public void testIsGreaterThanOrEqualTo() {
        HugeInteger hugeInt1 = new HugeInteger();
        HugeInteger hugeInt2 = new HugeInteger();
        hugeInt1.parse("54321");
        hugeInt2.parse("12345");

        assertTrue(hugeInt1.isGreaterThanOrEqualTo(hugeInt2));
    }

    @Test
    public void testIsLessThanOrEqualTo() {
        HugeInteger hugeInt1 = new HugeInteger();
        HugeInteger hugeInt2 = new HugeInteger();
        hugeInt1.parse("12345");
        hugeInt2.parse("54321");

        assertTrue(hugeInt1.isLessThanOrEqualTo(hugeInt2));
    }

    @Test
    public void testIsZero() {
        HugeInteger hugeInt = new HugeInteger();
        hugeInt.parse("0");

        assertTrue(hugeInt.isZero());
    }
}
