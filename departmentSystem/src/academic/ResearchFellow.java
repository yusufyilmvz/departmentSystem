package academic;

// ResearchFellow class extends Academician class
public class ResearchFellow extends Academician{
    // Attribute(s)
    private String currentResearchTopic; // Current research topic of the research fellow

    // Constructor
    public ResearchFellow(String identificationNumber, String name, String surname, Department department) {
        super(identificationNumber, name, surname, department);
    }

    // Getter(s) - setter(s)
    public String getCurrentResearchTopic() {
        return currentResearchTopic;
    }

    protected void setCurrentResearchTopic(String currentResearchTopic) {
        this.currentResearchTopic = currentResearchTopic;
    }
}
