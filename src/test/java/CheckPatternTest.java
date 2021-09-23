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
    public void wrongIPTest1() {
        assertFalse(CheckPattern.isIP("1300.6.7.8"));
    }

    @org.junit.Test
    public void wrongIPTest2() {
        assertFalse(CheckPattern.isIP("abc.def.gha.bcd"));
    }
    //</editor-fold>

    //<editor-fold desc="Проверка GUID">
    @org.junit.Test
    public void correctGUIDTest() {
        assertTrue(CheckPattern.isGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
    }

    @org.junit.Test
    public void wrongGUIDTest() {
        assertFalse(CheckPattern.isGUID("e02fd0e400fd090Aca300d00a0038ba0"));
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
    public void wrongURLTest1() {
        assertFalse(CheckPattern.isURL("Just Text"));
    }

    @org.junit.Test
    public void wrongURLTest2() {
        assertFalse(CheckPattern.isURL("http://a.com"));
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
    public void wrongPasswordTest1() {
        assertFalse(CheckPattern.isPassword("Cool_pass"));
    }

    @org.junit.Test
    public void wrongPasswordTest2() {
        assertFalse(CheckPattern.isPassword("C00l"));
    }
    //</editor-fold>
}
