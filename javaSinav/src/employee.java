public class employee {

    private String first_Name;
    private String last_Name;
    private int age;
    private boolean licence;

    public String getFirst_Name() {
        return first_Name;
    }

    public employee(String first_Name, String last_Name, int age, boolean licence) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.age = age;
        this.licence = licence;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isLicence() {
        return licence;
    }

    public void setLicence(boolean licence) {
        this.licence = licence;
    }

    @Override
    public String toString() {
        return "employee{" +
                "first_Name='" + first_Name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", age=" + age +
                ", licence=" + licence +
                '}';
    }




}
