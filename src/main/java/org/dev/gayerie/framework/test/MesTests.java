package org.dev.gayerie.framework.test;

public class MesTests {
    @Test
    public void doRight() {
        System.out.println("test doRight");
    }

    @Test
    public void doWrong() throws Exception {
        // ...        System.out.println("test doRight");
        //        throw new Exception("simule un test en échec");
        System.out.println("test doWrong");
    }

    public static void main(String[] args) {
        TestFramework.run(new MesTests());
    }
}
