public class Person extends Customer {
    private String NationelIdentity;
    private String FName;
    private String LName;

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }
    public String getNationelIdentity() {
        return NationelIdentity;
    }

    public void setNationelIdentity(String nationelIdentity) {
        NationelIdentity = nationelIdentity;
    }


}
