public class IGadgetSet {

    private String appliance;

    public IGadgetSet(String appliance)
    {
        this.appliance = appliance;
    }

    public String getAppliance() {
        return appliance;
    }

    public void setAppliance(String appliance) {
        this.appliance = appliance;
    }

    @Override
    public String toString()
    {
        return "(IGadget set { " + "Appliance = " + appliance + "}";
    }
}
