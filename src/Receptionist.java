public class Receptionist extends HospitalEmployee {

    private String department;
    private String answering;

    public Receptionist(String role, String blazerID, String name, String department, String answering) {
        super(role, blazerID, name);
        this.department = department;
        this.answering = answering;
    }

    public String getDepartment() {
        return department;
    }

    public String getAnswering() {
        return answering;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setAnswering(String answering) {
        this.answering = answering;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "   BlazerId: " + this.getBlazerID() + "   Department: " + department + "   Answering: " + answering + "\n";
    }
}
