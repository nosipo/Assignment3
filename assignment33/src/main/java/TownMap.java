public class TownMap {
    private String name;
    private String province;

    public TownMap()
    {

    }

    public TownMap(String name, String province)
    {
        this.name = name;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString()
    {
        return "Town Maps { " + "Town Name: '" + name + '\'' + " , Province '" + province + '\'' + '}';
    }
}
