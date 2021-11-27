import static org.junit.Assert.*;

public class CheckPatternTest {
    //<editor-fold desc="Проверка IP">
    @org.junit.Test
    public void correctIPTest1() {
        assertTrue(CheckPattern.isIP("127.0.0.1"));
    }

    @org.junit.Test
    public void correctIPTest2() {
        assertTrue(CheckPattern.isIP("255.255.255.0"));
    }

    @org.junit.Test
    public void correctIPTest3() {
        assertTrue(CheckPattern.isIP("192.168.0.1"));
    }

    @org.junit.Test
    public void correctIPTest4() {
        assertTrue(CheckPattern.isIP("255.0.255.255"));
    }

    @org.junit.Test
    public void correctIPTest5() {
        assertTrue(CheckPattern.isIP("127.0.0.0"));
    }

    @org.junit.Test
    public void correctIPTest6() {
        assertTrue(CheckPattern.isIP("100.100.100.100"));
    }

    @org.junit.Test
    public void correctIPTest7() {
        assertTrue(CheckPattern.isIP("201.1.1.0"));
    }

    @org.junit.Test
    public void correctIPTest8() {
        assertTrue(CheckPattern.isIP("1.2.3.4"));
    }

    @org.junit.Test
    public void correctIPTest9() {
        assertTrue(CheckPattern.isIP("11.1.1.0"));
    }

    @org.junit.Test
    public void correctIPTest10() {
        assertTrue(CheckPattern.isIP("0.0.0.0"));
    }


    @org.junit.Test
    public void wrongIPTest1() {
        assertFalse(CheckPattern.isIP("1300.6.7.8"));
    }

    @org.junit.Test
    public void wrongIPTest2() {
        assertFalse(CheckPattern.isIP("abc.def.gha.bcd"));
    }

    @org.junit.Test
    public void wrongIPTest3() {
        assertFalse(CheckPattern.isIP("254.hzf.bar.10"));
    }

    @org.junit.Test
    public void wrongIPTest4() {
        assertFalse(CheckPattern.isIP("256.0.0.1"));
    }

    @org.junit.Test
    public void wrongIPTest5() {
        assertFalse(CheckPattern.isIP(""));
    }

    @org.junit.Test
    public void wrongIPTest6() {
        assertFalse(CheckPattern.isIP("1.2.3.04"));
    }

    @org.junit.Test
    public void wrongIPTest7() {
        assertFalse(CheckPattern.isIP("1.176.1"));
    }

    @org.junit.Test
    public void wrongIPTest8() {
        assertFalse(CheckPattern.isIP("72.15.1.56.0"));
    }

    @org.junit.Test
    public void wrongIPTest9() {
        assertFalse(CheckPattern.isIP("1.1.1.1."));
    }

    @org.junit.Test
    public void wrongIPTest10() {
        assertFalse(CheckPattern.isIP("-100.1.1.1"));
    }
    //</editor-fold>

    //<editor-fold desc="Проверка GUID">
    @org.junit.Test
    public void correctGUIDTest1() {
        assertTrue(CheckPattern.isGUID("{e02fa0e4-01ad-090A-c130-0d05a0008ba0}"));
    }

    @org.junit.Test
    public void correctGUIDTest2() {
        assertTrue(CheckPattern.isGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
    }

    @org.junit.Test
    public void correctGUIDTest3() {
        assertTrue(CheckPattern.isGUID("54ea1c7a-0902-40e2-8eb2-50c9c9ef4227"));
    }

    @org.junit.Test
    public void correctGUIDTest4() {
        assertTrue(CheckPattern.isGUID("00000000-0000-0000-0000-000000000000"));
    }

    @org.junit.Test
    public void correctGUIDTest5() {
        assertTrue(CheckPattern.isGUID("ffffffff-ffff-ffff-ffff-ffffffffffff"));
    }


    @org.junit.Test
    public void wrongGUIDTest1() {
        assertFalse(CheckPattern.isGUID("e02fd0e400fd090Aca300d00a0038ba0"));
    }

    @org.junit.Test
    public void wrongGUIDTest2() {
        assertFalse(CheckPattern.isGUID("02fa0e4-01ad-090A-c130-0d05a0008ba0}"));
    }

    @org.junit.Test
    public void wrongGUIDTest3() {
        assertFalse(CheckPattern.isGUID("{02fa0e4-01ad-090A-c130-0d05a0008ba0"));
    }

    @org.junit.Test
    public void wrongGUIDTest4() {
        assertFalse(CheckPattern.isGUID("02fa0e401ad-090A-c130-0d05a0008ba0}"));
    }

    @org.junit.Test
    public void wrongGUIDTest5() {
        assertFalse(CheckPattern.isGUID("02fa0e4-01ad-090A-c13-0d05a0008ba0"));
    }

    @org.junit.Test
    public void wrongGUIDTest6() {
        assertFalse(CheckPattern.isGUID("02fy0e4-01ad-090L-c13-0d05ar008ba0"));
    }

    @org.junit.Test
    public void wrongGUIDTest7() {
        assertFalse(CheckPattern.isGUID("02fa0e401ad-090A-0d05a0008ba0-a02A"));
    }

    @org.junit.Test
    public void wrongGUIDTest8() {
        assertFalse(CheckPattern.isGUID("02fa0e4-01ad-090A-c13a-0d80"));
    }

    @org.junit.Test
    public void wrongGUIDTest9() {
        assertFalse(CheckPattern.isGUID("02fy0e4-01ad-090L-c132-d5Aa-0d05ar008ba0"));
    }

    @org.junit.Test
    public void wrongGUIDTest10() {
        assertFalse(CheckPattern.isGUID(""));
    }
    //</editor-fold>

    //<editor-fold desc="Проверка URL">
    @org.junit.Test
    public void correctURLTest1() {
        assertTrue(CheckPattern.isURL("http://www.example.com"));
    }

    @org.junit.Test
    public void correctURLTest2() {
        assertTrue(CheckPattern.isURL("http://example.com"));
    }

    @org.junit.Test
    public void correctURLTest3() {
        assertTrue(CheckPattern.isURL("https://example.ru"));
    }

    @org.junit.Test
    public void correctURLTest4() {
        assertTrue(CheckPattern.isURL("https://sub.example-ru.com:8080"));
    }

    @org.junit.Test
    public void correctURLTest5() {
        assertTrue(CheckPattern.isURL("ex.com/index.html#bookmark"));
    }

    @org.junit.Test
    public void correctURLTest6() {
        assertTrue(CheckPattern.isURL("example.ru"));
    }

    @org.junit.Test
    public void correctURLTest7() {
        assertTrue(CheckPattern.isURL("http://sub.sub.example.com"));
    }

    @org.junit.Test
    public void correctURLTest8() {
        assertTrue(CheckPattern.isURL("sub.example-info.com"));
    }

    @org.junit.Test
    public void correctURLTest9() {
        assertTrue(CheckPattern.isURL("https://sub.example-ru.com:8080#bookmark"));
    }

    @org.junit.Test
    public void correctURLTest10() {
        assertTrue(CheckPattern.isURL("https://www.ex.com#bookmark"));
    }


    @org.junit.Test
    public void wrongURLTest1() {
        assertFalse(CheckPattern.isURL("Just Text"));
    }

    @org.junit.Test
    public void wrongURLTest2() {
        assertFalse(CheckPattern.isURL("http://a.com"));
    }

    @org.junit.Test
    public void wrongURLTest3() {
        assertFalse(CheckPattern.isURL("http://www.domain-.com"));
    }

    @org.junit.Test
    public void wrongURLTest4() {
        assertFalse(CheckPattern.isURL("example,com"));
    }

    @org.junit.Test
    public void wrongURLTest5() {
        assertFalse(CheckPattern.isURL(".com"));
    }

    @org.junit.Test
    public void wrongURLTest6() {
        assertFalse(CheckPattern.isURL("http://sub.-example.com"));
    }

    @org.junit.Test
    public void wrongURLTest7() {
        assertFalse(CheckPattern.isURL("http://www.example.123"));
    }

    @org.junit.Test
    public void wrongURLTest8() {
        assertFalse(CheckPattern.isURL("g.com"));
    }

    @org.junit.Test
    public void wrongURLTest9() {
        assertFalse(CheckPattern.isURL("https://sub.example-ru.com#bookmark:8080"));
    }

    @org.junit.Test
    public void wrongURLTest10() {
        assertFalse(CheckPattern.isURL(""));
    }
    //</editor-fold>

    //<editor-fold desc="Проверка пароля">
    @org.junit.Test
    public void correctPasswordTest1() {
        assertTrue(CheckPattern.isPassword("C00l_Pass"));
    }

    @org.junit.Test
    public void correctPasswordTest2() {
        assertTrue(CheckPattern.isPassword("SupperPas1"));
    }

    @org.junit.Test
    public void correctPasswordTest3() {
        assertTrue(CheckPattern.isPassword("AAAbbbccc_123"));
    }

    @org.junit.Test
    public void correctPasswordTest4() {
        assertTrue(CheckPattern.isPassword("SUPERPAs1"));
    }

    @org.junit.Test
    public void correctPasswordTest5() {
        assertTrue(CheckPattern.isPassword("C0l_____"));
    }


    @org.junit.Test
    public void wrongPasswordTest1() {
        assertFalse(CheckPattern.isPassword("Cool_pass"));
    }

    @org.junit.Test
    public void wrongPasswordTest2() {
        assertFalse(CheckPattern.isPassword("C00l"));
    }

    @org.junit.Test
    public void wrongPasswordTest3() {
        assertFalse(CheckPattern.isPassword("Cool-pass"));
    }

    @org.junit.Test
    public void wrongPasswordTest4() {
        assertFalse(CheckPattern.isPassword("12345678"));
    }

    @org.junit.Test
    public void wrongPasswordTest5() {
        assertFalse(CheckPattern.isPassword("abcdefgh"));
    }

    @org.junit.Test
    public void wrongPasswordTest6() {
        assertFalse(CheckPattern.isPassword("ABCDEFGH"));
    }

    @org.junit.Test
    public void wrongPasswordTest7() {
        assertFalse(CheckPattern.isPassword("abc123___"));
    }

    @org.junit.Test
    public void wrongPasswordTest8() {
        assertFalse(CheckPattern.isPassword("ABC123___"));
    }

    @org.junit.Test
    public void wrongPasswordTest9() {
        assertFalse(CheckPattern.isPassword("ABC______"));
    }

    @org.junit.Test
    public void wrongPasswordTest10() {
        assertFalse(CheckPattern.isPassword(""));
    }
    //</editor-fold>
}
