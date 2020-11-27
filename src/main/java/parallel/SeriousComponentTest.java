package parallel;

import org.testng.annotations.Test;

public class SeriousComponentTest {

    @Test
    public void testSad() throws Exception {
        System.out.println("SAD");
        System.out.println( "THREAD: "+Thread.currentThread().getId());
        assert SeriousComponent.testSeriousness("SAD");
    }

    @Test
    public void testSerious() throws Exception {
        System.out.println("SERIOUS");
        System.out.println( "THREAD: "+Thread.currentThread().getId());
        assert SeriousComponent.testSeriousness("SERIOUS");
    }

    @Test
    public void testCrazy() throws Exception {
        System.out.println("CRAZY");
        System.out.println( "THREAD: "+Thread.currentThread().getId());
        assert SeriousComponent.testSeriousness("CRAZY");
    }

    @Test
    public void testFunny() throws Exception {
        System.out.println("FUNNY");
        System.out.println( "THREAD: "+Thread.currentThread().getId());
        assert !SeriousComponent.testSeriousness("FUNNY");
    }

}
