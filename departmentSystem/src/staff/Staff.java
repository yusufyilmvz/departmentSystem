package staff;

public class Staff {
    private String identificationNumber;
    private String taskInformation;
    private int workingHours;

    public Staff(String identificationNumber, String taskInformation, int workingHours) {
        this.identificationNumber = identificationNumber;
        this.taskInformation = taskInformation;
        this.workingHours = workingHours;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getTaskInformation() {
        return taskInformation;
    }

    public void setTaskInformation(String taskInformation) {
        this.taskInformation = taskInformation;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
