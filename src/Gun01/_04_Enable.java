package Gun01;

import org.testng.annotations.Test;

public class _04_Enable {

    @Test
    public void Test1() {
        System.out.println("Test 1 çalıştı");
    }

    @Test(enabled = false) // şimdilik çalışma
    public void Test2() {
        System.out.println("Test 2 çalıştı");
    }

    @Test
    public void Test3() {
        System.out.println("Test 3 çalıştı");
    }
}
