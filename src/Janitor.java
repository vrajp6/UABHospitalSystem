public class Janitor extends HospitalEmployee {
    private String department;
    private String sweeping;

    public Janitor(String role, String blazerID, String name, String department, String sweeping) {
        super(role, blazerID, name);
        this.department = department;
        this.sweeping = sweeping;
    }

    public String getDepartment() {
        return department;
    }

    public String getSweeping() {
        return sweeping;
    }

    public void setDepartment(String specialty) {
        this.department = department;
    }

    public void setSweeping(String sweeping) {
        this.sweeping = sweeping;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "   BlazerId: " + this.getBlazerID() + "   Department: " + department + "   Sweeping: " + sweeping + "\n";
    }
}
