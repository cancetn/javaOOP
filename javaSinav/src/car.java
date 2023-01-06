import java.util.Random;

public class car extends  vehicle{



    public car(String brand, String model, int memberOfWheel, int enginePower) {
        super(brand, model, memberOfWheel, enginePower);
    }

    @Override
    public void setFuelType() {

        String[] fuelTypes= {"diesel","gasoline","LPG"};
        Random r=new Random();
        this.fuelType=fuelTypes[r.nextInt(3)];

    }

    @Override
    public String toString() {
        return "car{" +
                "fuelType='" + fuelType + '\'' +
                '}';
    }

}
