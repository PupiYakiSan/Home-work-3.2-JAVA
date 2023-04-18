public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyWeightKg = 98;
        double bodyGrowthM = 1.87;
        int index = service.calculate(bodyWeightKg, bodyGrowthM);
        System.out.println("Индекс массы тела = " + index);
    }
}