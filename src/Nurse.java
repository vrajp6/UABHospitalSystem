public class Nurse extends HospitalEmployee {

    private String numOfPatients;

    public Nurse(String role, String blazerID, String name, String numOfPatients) {
        super(role, blazerID, name);
        this.numOfPatients = numOfPatients;
    }

    public String getNumOfPatients() {
        return numOfPatients;
    }

    public void setNumOfPatients(String numOfPatients) {
        this.numOfPatients = numOfPatients;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "   BlazerId: " + this.getBlazerID() + "   Number Of Patients: " + numOfPatients + "\n";
    }
}
