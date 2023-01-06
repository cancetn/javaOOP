public class associativeProf extends academicians{


    public associativeProf(String first_Name, String last_Name, int age, boolean licence) {
        super(first_Name, last_Name, age, licence);
    }

    @Override
    public void setVehicleObj(vehicle vehicleObj) {
        if(vehicleObj instanceof car){
            this.vehicleObj = vehicleObj;
            System.out.println(this.getFirst_Name() + " Araci almaya uygun");
        }else{
            System.out.println(this.getFirst_Name() + " Araci almaya uygun degil");
        }
    }

    @Override
    public double getSalary() {
        return wage * 2;
    }

    @Override
    public String toString() {
        return super.toString()+"associativeProf{" +
                "wage=" + getSalary() +
                '}';
    }
}
