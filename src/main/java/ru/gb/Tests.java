package ru.gb;

public class Tests {

    @BeforeSuite
    public static void test1() {
        System.out.println("Test 1 BS");
    }

    @Test(priority = 1)
    public static void test2() {
        System.out.println("Test 2 p1");
    }

    @Test
    public static void test3() {
        System.out.println("Test 3 pDefault5");
    }

    @Test(priority = 7)
    public static void test4() {
        System.out.println("Test 4 p7");
    }

    @AfterSuite
    public static void test5() {
        System.out.println("Test 5 AS");
    }
}
