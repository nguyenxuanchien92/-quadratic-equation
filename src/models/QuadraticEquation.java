package models;

public class QuadraticEquation {

    private double number_1;
    private double number_2;
    private double number_3;

    public QuadraticEquation(double number_1, double number_2, double number_3) {
        this.number_1 = number_1;
        this.number_2 = number_2;
        this.number_3 = number_3;
    }

    public double getNumber_1() {
        return number_1;
    }

    public void setNumber_1(double number_1) {
        this.number_1 = number_1;
    }

    public double getNumber_2() {
        return number_2;
    }

    public void setNumber_2(double number_2) {
        this.number_2 = number_2;
    }

    public double getNumber_3() {
        return number_3;
    }

    public void setNumber_3(double number_3) {
        this.number_3 = number_3;
    }

    public int getDiscriminant(QuadraticEquation val) {

        double a = val.getNumber_1();
        double b = val.getNumber_2();
        double c = val.getNumber_3();

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            return 1;
        } else if (delta == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public double getRoot1(QuadraticEquation val) {

        double pow = Math.pow(val.getNumber_2(), 2) - 4 * val.getNumber_1() * val.getNumber_3();

        double result = (-val.getNumber_2() + Math.pow(pow, 0.5)) / (2 * val.getNumber_1());

        return result;

    }

    public double getRoot2(QuadraticEquation val) {
        double pow = Math.pow(val.getNumber_2(), 2) - 4 * val.getNumber_1() * val.getNumber_3();

        double result = (-val.getNumber_2() - Math.pow(pow, 0.5)) / (2 * val.getNumber_1());

        return result;
    }

    public double getRoot3(QuadraticEquation val) {
        return -val.getNumber_2() / (2 * val.getNumber_1());
    }

}
//-b/2a;