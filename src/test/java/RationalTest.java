import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4,x.denominator);
    }

    @Test
    public void testSubtract() {
        try{
            Rational x = new Rational(1,2);
            Rational y = new Rational(1,3);
            x.subtract(y);
            Assert.assertEquals(1,x.numerator);
            Assert.assertEquals(6,x.denominator);
        }catch (Rational.Illegal illegal) {
            illegal.printStackTrace();
        }

    }
    @Test
    public void testMultiply(){
        try{
            Rational x = new Rational(1,3);
            Rational y = new Rational(2,3);
            x.multiply(y);
            Assert.assertEquals(2, x.numerator);
            Assert.assertEquals(9, x.denominator);
        }catch (Rational.Illegal illegal){
            illegal.printStackTrace();
        }
    }
    @Test
    public void testDivide(){
        try{
            Rational x = new Rational(1,3);
            Rational y = new Rational(1,2);
            x.divide(y);
            Assert.assertEquals(2, x.numerator);
            Assert.assertEquals(3, x.denominator);
        }catch (Rational.Illegal illegal){
            illegal.printStackTrace();
        }
    }
    @Test
    public void testEqual(){
        try{
            Rational x = new Rational(2,4);
            Rational y = new Rational(1,2);
            Assert.assertEquals(true,x.equals(y));
            Rational a = new Rational(1,4);
            Rational b = new Rational(1,2);
            Assert.assertEquals(false,a.equals(b));
        }catch (Rational.Illegal illegal){
            illegal.printStackTrace();
        }
    }
    @Test
    public void testCompareTo(){
        try{
            Rational x = new Rational(1,2);
            Rational y = new Rational(1,3);
            Rational z = new Rational(1,4);
            Rational a = new Rational(1,2);
            Assert.assertEquals(0,x.compareTo(a));
            Assert.assertEquals(1,x.compareTo(y));
            Assert.assertEquals(-1,z.compareTo(y));
        }catch (Rational.Illegal illegal) {
            illegal.printStackTrace();
        }
    }
    @Test
    public void testToString(){
        try{
            Rational x = new Rational(1,2);
            Assert.assertEquals("1/2",x.toString());
        }catch (Rational.Illegal illegal) {
            illegal.printStackTrace();
        }
    }
}