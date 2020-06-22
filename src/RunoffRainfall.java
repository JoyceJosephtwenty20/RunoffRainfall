public class RunoffRainfall {
    public static void main(String[] args){
        double roofWidth = 600;
        double roofLength = 240;
        double oneGallenCubicInches   = 231;

        double totalWater = roofWidth * roofLength * 1;

        double totalWaterInGallon = totalWater / oneGallenCubicInches;

        System.out.println("Total Water in cubic inches: " + totalWater);

        System.out.println("Total Water in Gallon: " + totalWaterInGallon);


    }
}
