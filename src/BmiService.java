public class BmiService {

    public int calculate (double bodyWeightKg, double bodyGrowthM) {
       double index = bodyWeightKg / Math.pow (bodyGrowthM, 2);
       return (int) index;
    }
}
