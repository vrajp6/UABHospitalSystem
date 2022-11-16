public class HospitalEmployee {
    private String role;
    private String blazerID;
    private String name;

    public HospitalEmployee(String role, String blazerID, String name) {
        this.role = role;
        this.blazerID = blazerID;
        this.name = name;
    }

    public HospitalEmployee() {

    }

    public String getRole() {
        return role;
    }

    public String getBlazerID() {
        return blazerID;
    }

    public String getName() {
        return name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setBlazerID(String blazerID) {
        this.blazerID = blazerID;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Name: " + name + "  BlazerId: " + blazerID + "\n";
    }
}
