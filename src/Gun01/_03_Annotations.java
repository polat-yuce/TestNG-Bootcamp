package Gun01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _03_Annotations {

    @Test
    public void Test1() {
        System.out.println("Test 1 çalıştı");
    }

    @Test
    public void Test2() {
        System.out.println("Test 2 çalıştı");
    }

    @BeforeClass // Class ın içindekiler çalışmadan önce çalışır
    public void BeforeClass() {
        System.out.println("Before Class bolumu çalıştı. ");
    }

    @AfterClass // Class ın içindekiler çalıştıktan sonra çalışır
    public void AfterClass() {
        System.out.println("After Class bolumu çalıştı. ");
    }

}
