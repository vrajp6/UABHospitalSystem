import java.io.*;
import java.util.*;

public class tester {
    private static ArrayList<HospitalEmployee> E = new ArrayList<>();
    private static ArrayList<Administrator> A = new ArrayList<>();
    private static ArrayList<Doctor> D = new ArrayList<>();
    private static ArrayList<Janitor> J = new ArrayList<>();
    private static ArrayList<Nurse> N = new ArrayList<>();
    private static ArrayList<Receptionist> R = new ArrayList<>();
    private static ArrayList<Surgeon> S = new ArrayList<>();
    private static ArrayList<ITTeam> I = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        File f = new File("uabEmployee.txt");
        Scanner reader = new Scanner(f);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        int count = 0;
        int hCount = 0;
        int dCount = 0;
        int aCount = 0;
        int rCount = 0;
        int jCount = 0;
        int sCount = 0;
        int iCount = 0;
        int nCount = 0;
        while (line != null) {
            if (line.startsWith("E")) {
                String t[] = line.split(" ");
                String role = t[0];
                String blazerID = t[2];
                String name = t[1];
                E.add(new HospitalEmployee(role, blazerID, name));
                count++;
                hCount++;
                line = br.readLine();
            } else if (line.startsWith("D")) {
                String t[] = line.split(" ");
                String role = t[0];
                String blazerID = t[2];
                String name = t[1];
                String specialty = t[3];
                D.add(new Doctor(role, blazerID, name, specialty));
                count++;
                dCount++;
                line = br.readLine();
            } else if (line.startsWith("N")) {
                String t[] = line.split(" ");
                String role = t[0];
                String blazerID = t[2];
                String name = t[1];
                String numOfPatients = t[3];
                N.add(new Nurse(role, blazerID, name, numOfPatients));
                count++;
                nCount++;
                line = br.readLine();
            } else if (line.startsWith("A")) {
                String t[] = line.split(" ");
                String role = t[0];
                String blazerID = t[2];
                String name = t[1];
                String department = t[3];
                A.add(new Administrator(role, blazerID, name, department));
                count++;
                aCount++;
                line = br.readLine();
            } else if (line.startsWith("R")) {
                String t[] = line.split(" ");
                String role = t[0];
                String blazerID = t[2];
                String name = t[1];
                String department = t[3];
                String answering = t[4];
                R.add(new Receptionist(role, blazerID, name, department, answering));
                count++;
                rCount++;
                line = br.readLine();
            } else if (line.startsWith("J")) {
                String t[] = line.split(" ");
                String role = t[0];
                String blazerID = t[2];
                String name = t[1];
                String specialty = t[3];
                String sweeping = t[4];
                J.add(new Janitor(role, blazerID, name, specialty, sweeping));
                count++;
                jCount++;
                line = br.readLine();
            } else if (line.startsWith("S")) {
                String t[] = line.split(" ");
                String role = t[0];
                String blazerID = t[2];
                String name = t[1];
                String specialty = t[3];
                String operating = t[4];
                S.add(new Surgeon(role, blazerID, name, specialty, operating));
                count++;
                sCount++;
                line = br.readLine();
            } else if (line.startsWith("I")) {
                String t[] = line.split(" ");
                String role = t[0];
                String blazerID = t[2];
                String name = t[1];
                String team = t[3];
                I.add(new ITTeam(role, blazerID, name, team));
                count++;
                iCount++;
                line = br.readLine();
            }
        }
        System.out.println("Welcome to the UAB Employee System!\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press (1) To Display The Employee List\n" +
                "Press (2) To Add An Employee\n" +
                "Press (3) To Update The Database\n" +
                "Press (4) To Remove An Employee\n" +
                "******************************************************\n");
        int value = scanner.nextInt();
        FileWriter myWriter = new FileWriter("uabEmployee.txt", true);
        while (true) {
            if (value == 1) {
                System.out.println("The UAB Hospital System has the following employees: \n" +
                        "\n" +
                        "Total Number of employees = " + count + "\n" +
                        "\n" +
                        "Hospital Employees: " + hCount + "\n" +
                        E.toString().replace("[", "").replace("]", "").replace(",", "") + "\n" +
                        "Doctors: " + dCount + "\n" +
                        D.toString().replace("[", "").replace("]", "").replace(",", "") + "\n" +
                        "Surgeons: " + sCount + "\n" +
                        S.toString().replace("[", "").replace("]", "").replace(",", "") + "\n" +
                        "Nurses: " + nCount + "\n" +
                        N.toString().replace("[", "").replace("]", "").replace(",", "") + "\n" +
                        "Administrators: " + aCount + "\n" +
                        A.toString().replace("[", "").replace("]", "").replace(",", "") + "\n" +
                        "Receptionists: " + rCount + "\n" +
                        R.toString().replace("[", "").replace("]", "").replace(",", "") + "\n" +
                        "Janitors: " + jCount + "\n" +
                        J.toString().replace("[", "").replace("]", "").replace(",", "") + "\n" +
                        "IT Team: " + iCount + "\n" +
                        I.toString().replace("[", "").replace("]", "").replace(",", "") + "\n");
                break;
            } else if (value == 2) {
                System.out.println("What is the role of the employee you would like to add?");
                String empRole = scanner.next();
                if (empRole.equals("Doctor") || empRole.equals("D")) {
                    String role = "D";
                    System.out.println("What is the doctor's name?");
                    String name = scanner.next();
                    System.out.println("What is the doctor's BlazerID?");
                    String BlazerID = scanner.next();
                    System.out.println("What is the doctor's specialty?");
                    String specialty = scanner.next();
                    Doctor doctor = new Doctor(role, BlazerID, name, specialty);
                    System.out.println("The new employee has been successfully added!");
                    myWriter.write("\nD " + doctor.getName() + " " + doctor.getBlazerID() + " " + doctor.getSpecialty());
                    myWriter.close();
                    break;
                }
                if (empRole.equals("Surgeon") || empRole.equals("S")) {
                    String role = "S";
                    System.out.println("What is the surgeon's name?");
                    String name = scanner.next();
                    System.out.println("What is the surgeon's BlazerID?");
                    String BlazerID = scanner.next();
                    System.out.println("What is the surgeon's specialty?");
                    String specialty = scanner.next();
                    System.out.println("Is this surgeon operating?");
                    String operating = scanner.next();
                    Surgeon surgeon = new Surgeon(role, BlazerID, name, specialty, operating);
                    myWriter.write("\nS " + surgeon.getName() + " " + surgeon.getBlazerID() + " " + surgeon.getSpecialty() + " " + surgeon.getOperating());
                    myWriter.close();
                    break;
                }
                if (empRole.equals("Administrator") || empRole.equals("A")) {
                    String role = "A";
                    System.out.println("What is the administrator's name?");
                    String name = scanner.next();
                    System.out.println("What is the administrator's BlazerID?");
                    String BlazerID = scanner.next();
                    System.out.println("What department is the administrator in?");
                    String department = scanner.next();
                    Administrator administrator = new Administrator(role, BlazerID, name, department);
                    myWriter.write("\nA " + administrator.getName() + " " + administrator.getBlazerID() + " " + administrator.getDepartment());
                    myWriter.close();
                    break;
                }
                if (empRole.equals("Hospital Employee") || empRole.equals("E")) {
                    String role = "E";
                    System.out.println("What is the hospital employee's name?");
                    String name = scanner.next();
                    System.out.println("What is the hospital employee's BlazerID?");
                    String BlazerID = scanner.next();
                    HospitalEmployee hospitalEmployee = new HospitalEmployee(role, BlazerID, name);
                    System.out.println("The new employee has been successfully added!");
                    myWriter.write("\nE " + hospitalEmployee.getName() + " " + hospitalEmployee.getBlazerID());
                    myWriter.close();
                    break;
                }
                if (empRole.equals("ITTeam") || empRole.equals("I")) {
                    String role = "I";
                    System.out.println("What is the IT team member's name?");
                    String name = scanner.next();
                    System.out.println("What is the IT team member's BlazerID?");
                    String BlazerID = scanner.next();
                    System.out.println("What team is the IT member on?");
                    String team = scanner.next();
                    ITTeam itTeam = new ITTeam(role, BlazerID, name, team);
                    System.out.println("The new employee has been successfully added!");
                    myWriter.write("\nI " + itTeam.getName() + " " + itTeam.getBlazerID() + " " + itTeam.getTeam());
                    myWriter.close();
                    break;
                }
                if (empRole.equals("Janitor") || empRole.equals("J")) {
                    String role = "J";
                    System.out.println("What is the janitor's name?");
                    String name = scanner.next();
                    System.out.println("What is the janitor's BlazerID?");
                    String BlazerID = scanner.next();
                    System.out.println("What department is the janitor in?");
                    String department = scanner.next();
                    System.out.println("Is this janitor sweeping?");
                    String sweeping = scanner.next();
                    Janitor janitor = new Janitor(role, BlazerID, name, department, sweeping);
                    System.out.println("The new employee has been successfully added!");
                    myWriter.write("\nJ " + janitor.getName() + " " + janitor.getBlazerID() + " " + janitor.getDepartment() + " " + janitor.getSweeping());
                    myWriter.close();
                    break;
                }
                if (empRole.equals("Nurse") || empRole.equals("N")) {
                    String role = "N";
                    System.out.println("What is the nurse's name?");
                    String name = scanner.next();
                    System.out.println("What is the nurse's BlazerID?");
                    String BlazerID = scanner.next();
                    System.out.println("How many patients does this nurse have?");
                    String numOfPatients = scanner.next();
                    Nurse nurse = new Nurse(role, BlazerID, name, numOfPatients);
                    System.out.println("The new employee has been successfully added!");
                    myWriter.write("\nN " + nurse.getName() + " " + nurse.getBlazerID() + " " + nurse.getNumOfPatients());
                    myWriter.close();
                    break;
                }
                if (empRole.equals("Receptionist") || empRole.equals("R")) {
                    String role = "R";
                    System.out.println("What is the receptionist's name?");
                    String name = scanner.next();
                    System.out.println("What is the receptionist's BlazerID?");
                    String BlazerID = scanner.next();
                    System.out.println("What department is the receptionist in?");
                    String department = scanner.next();
                    System.out.println("Is this receptionist answering?");
                    String answering = scanner.next();
                    Receptionist receptionist = new Receptionist(role, BlazerID, name, department, answering);
                    System.out.println("The new employee has been successfully added!");
                    myWriter.write("\nR " + receptionist.getName() + " " + receptionist.getBlazerID() + " " + receptionist.getDepartment() + " " + receptionist.getAnswering());
                    myWriter.close();
                    break;
                }
            } else if (value == 3) {
                System.out.println("This feature is not required as employees are added to the text file!");
                break;
            } else if (value == 4) {
                    System.out.println("Did not implement this feature because it was optional!");
                    break;
            } else {
                System.out.println("Please try running again with a valid number!");
                break;
            }
        }
    }
}