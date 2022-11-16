public class Surgeon extends HospitalEmployee {

    private String specialty;
    private String operating;

    public Surgeon(String role, String blazerID, String name, String specialty, String operating) {
        super(role, blazerID, name);
        this.specialty = specialty;
        this.operating = operating;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getOperating() {
        return operating;
    }

    public void setOperating(String operating) {
        this.operating = operating;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "   BlazerId: " + this.getBlazerID() + "   Specialty: " + specialty + "   Operating: " + operating + "\n";
    }
}
