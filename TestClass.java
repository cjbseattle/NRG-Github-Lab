public class TestClass {
    private double doubleOne;
    private double doubleTwo;

    TestClass(double doubleOne, double doubleTwo) {
        this.doubleOne = doubleOne;
        this.doubleTwo = doubleTwo;
    }

    public double getProduct() {
        return doubleOne * doubleTwo;
    }
}