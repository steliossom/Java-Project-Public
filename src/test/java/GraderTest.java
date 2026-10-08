import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    private final Grader grader = new Grader();

    @Test
    void testDetermineLetterGrade_F() {
        assertEquals('F', grader.determineLetterGrade(59));
    }

    @Test
    void testDetermineLetterGrade_D() {
        assertEquals('D', grader.determineLetterGrade(69));
    }

    @Test
    void testDetermineLetterGrade_C() {
        assertEquals('C', grader.determineLetterGrade(79));
    }

    @Test
    void testDetermineLetterGrade_B() {
        assertEquals('B', grader.determineLetterGrade(89));
    }

    @Test
    void testDetermineLetterGrade_A() {
        assertEquals('A', grader.determineLetterGrade(90));
    }


    @Test
    void negativeOneShouldReturnIllegalArgumentException() {

        var grader = new Grader();

        assertThrows(IllegalArgumentException.class, () -> grader.determineLetterGrade(-1));
    }

    @Test
    void overOneHundredShouldReturnIllegalArgumentException() {

        var grader = new Grader();

        assertThrows(IllegalArgumentException.class, () -> grader.determineLetterGrade(101));
    }

    @Test
    void testDetermineLetterGrade_Zero() {
        assertEquals('F', grader.determineLetterGrade(0));
    }



}