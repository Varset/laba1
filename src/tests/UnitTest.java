package tests;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import demo.parallel.Complex;

public class UnitTest {
    @Test
    public void TestDivide(){
        Complex a = new Complex(8,12);
        Complex b = new Complex(2, 3);
        a = a.divide(b);
        assertEquals(4, a.getRe(),0.0);
        assertEquals(0, a.getIm(),0.0);
    }
    @Test
    public void TestMinus(){
        Complex a = new Complex(77.7,4.4);
        Complex b = new Complex(7, 4);
        a = a.minus(b);
        assertEquals(70.7, a.getRe(), 3);
        assertEquals(0.4, a.getIm(), 3);
    }
}