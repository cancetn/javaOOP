public class schooter extends vehicle{
    public schooter(String brand, String model, int numberofWheel, int enginePower) {
        super(brand, model, numberofWheel, enginePower);
    }

    @Override
    public void setFuelType() {

        this.fuelType = "Electricity";

    }

    @Override
    public String toString() {
        return "schooter{" +
                "fuelType='" + fuelType + '\'' +
                '}';
    }
}
