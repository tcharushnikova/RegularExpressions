import static org.junit.Assert.*;

public class CheckPatternTest {
    @org.junit.Test
    public void correctIPTest1() {
        assertTrue(CheckPattern.isIP("127.0.0.1"));
    }

    @org.junit.Test
    public void correctIPTest2() {
        assertTrue(CheckPattern.isIP("255.255.255.0"));
    }

    @org.junit.Test
    public void wrongIPTest1() {
        assertFalse(CheckPattern.isIP("1300.6.7.8"));
    }

    @org.junit.Test
    public void wrongIPTest2() {
        assertFalse(CheckPattern.isIP("abc.def.gha.bcd"));
    }
}