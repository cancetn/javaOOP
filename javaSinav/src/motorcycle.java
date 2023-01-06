import java.util.Random;

public class motorcycle extends vehicle{
    public motorcycle(String brand, String model, int numberofWheel, int enginePower) {
        super(brand, model, numberofWheel, enginePower);
    }

    @Override
    public void setFuelType() {

        String[] fuelTypes = {"electricity","gasoline"};
        Random r = new Random();
        this.fuelType = fuelTypes[r.nextInt(2)];

    }

    @Override
    public String toString() {
        return "motorcycle{" +
                "fuelType='" + fuelType + '\'' +
                '}';
    }


}
