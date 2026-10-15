public class TestClass {
    private double doubleOne;
    private double doubleTwo;

    TestClass(double doubleOne, double doubleTwo) {
        this.doubleOne = doubleOne;
        this.doubleTwo = doubleTwo;
    }

    /** @return the product of TestClass' variables */
    public double getProduct() {
        return doubleOne * doubleTwo;
    }
}