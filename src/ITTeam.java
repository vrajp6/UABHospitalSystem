public class ITTeam extends HospitalEmployee {

    private String team;

    public ITTeam(String role, String blazerID, String name, String team) {
        super(role, blazerID, name);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + "   BlazerId: " + this.getBlazerID() + "   Team: " + team + "\n";
    }
}

