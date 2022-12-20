package academic;

import java.util.ArrayList;

public class ResearchFellow extends Academician{
    private String currentResearchTopic;

    // Constructor
    public ResearchFellow(String identificationNumber, String name, String surname, Department department) {
        super(identificationNumber, name, surname, department);
    }

    // Getter setters
    public String getCurrentResearchTopic() {
        return currentResearchTopic;
    }

    protected void setCurrentResearchTopic(String currentResearchTopic) {
        this.currentResearchTopic = currentResearchTopic;
    }
}
