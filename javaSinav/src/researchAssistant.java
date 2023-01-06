public class researchAssistant extends academicians{


    public researchAssistant(String first_Name, String last_Name, int age, boolean licence) {
        super(first_Name, last_Name, age, licence);
    }

    @Override
    public void setVehicleObj(vehicle vehicleObj) {
        if(vehicleObj instanceof schooter){
            this.vehicleObj = vehicleObj;
            System.out.println(this.getFirst_Name() + " Araci almaya uygun");
        }else{
            System.out.println(this.getFirst_Name() + " Araci almaya uygun degil");
        }
        }


    @Override
    public double getSalary() {
        return wage * 1.5;
    }

    @Override
    public String toString() {
        return super.toString()+"researchAssistant{" +
                "wage=" + getSalary() +
                '}';
    }

}
