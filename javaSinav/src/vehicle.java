
public abstract class vehicle {

    //marka, model, tekerlek sayısı, motor gucu ve yakıt türü

    private String brand, model;
    private int numberofWheel;
    private int enginePower;
    protected String fuelType;

    public vehicle(String brand, String model, int numberofWheel, int enginePower)

    {
        setBrand(brand);
        setModel(model);
        setNumberofWheel(numberofWheel);
        setEnginePower(enginePower);
        setFuelType();
    }


    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getNumberofWheel() {
        return numberofWheel;
    }
    public void setNumberofWheel(int numberofWheel) {
        this.numberofWheel = numberofWheel >0?numberofWheel:0;
    }
    public int getEnginePower() {
        return enginePower;
    }
    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
    public String getFuelType() {
        return fuelType;
    }
    public abstract void setFuelType();

    @Override
    public String toString() {

        return "Brand:"+brand+"\tModel"+model+"\tNumberofWheel:"+numberofWheel+"\tEngine Power:"+enginePower;
    }






}
