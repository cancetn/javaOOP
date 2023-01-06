public abstract class academicians extends employee{

    protected int wage = 8500;
    protected vehicle vehicleObj;

    public academicians(String first_Name, String last_Name, int age, boolean licence) {
        super(first_Name, last_Name, age, licence);


    }

    public vehicle getVehicleObj(){
        return vehicleObj;
    }

    public abstract void setVehicleObj(vehicle vehicleObj);

    public abstract double getSalary();

    @Override
    public String toString() {
        return super.toString()+"academicians{" +
                "vehicleObj=" + vehicleObj +
                '}';
    }
}
