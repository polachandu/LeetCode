// Last updated: 8/12/2026, 11:08:02 AM
class Solution {
    public double[] convertTemperature(double celsius) {
        double[] res = new double[2];
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius*1.80)+32.00;
        res[0] = kelvin;
        res[1] = fahrenheit;
        return res;
    }
}