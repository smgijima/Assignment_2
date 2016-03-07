
import com.Chapter_2.TestDrivenClass;
import junit.framework.TestCase;
/**
 * Created by mgijma on 2016/03/06.
 */
public class TestMethods extends TestCase {

    TestDrivenClass td =new TestDrivenClass();


    public void testFloat() throws Exception {
        assertEquals(td.calculateFloat(7.0f,5.0f),12f);
    }

    public void testInt() throws Exception {
        assertEquals(td.calculateInt(5,5),10);
    }

    public void testObjectEquality() throws Exception {
        assertTrue(td.checkObjectEquality());
    }

    public void testObjectIdentity() throws Exception {
        assertTrue(td.checkObjectIdentity());
    }

    public void testTruth() throws Exception {
        assertTrue(td.checkTruth());
    }

    public void testFalse() throws Exception {
        assertFalse(td.checkFalse());
    }

    public void testNullness() throws Exception {
        assertNull(td.checkNullness());
    }

    public void testNotNull() throws Exception {
        assertNotNull(td.checkNotNull());
    }

    public void testFailingTest() throws Exception {
        assertFalse(td.checkFailingTest());

    }

    public void testException(){
        assertTrue(td.checkException());

    }

    public void testArrayAccess() throws Exception {
        assertEquals(td.accessArray(),10);
    }
}
