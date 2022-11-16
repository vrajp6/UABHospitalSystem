public class Administrator extends HospitalEmployee {

    private String department;

    public Administrator(String role, String blazerID, String name, String department) {
        super(role, blazerID, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "   BlazerId: " + this.getBlazerID() + "   Department: " + department + "\n";
    }
}
