public class Doctor extends HospitalEmployee {
    private String specialty;

    public Doctor(String role, String blazerID, String name, String specialty) {
        super(role, blazerID, name);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "  BlazerId: " + this.getBlazerID() + "  Specialty: " + specialty +"\n";
    }
}
