public class Softwareentwicklung {

    private String dozent;

    public Softwareentwicklung(String dozent) {
        this.dozent = dozent;
        System.out.println("Dozent: " + this.dozent);
    }

    public String getDozent() {
        return this.dozent;
    }

    public void setDozent(String dozent) {
        this.dozent = dozent;
    }

    public boolean lernen(int dauer) {
        if (dauer < 15) {
            System.out.println(dauer + " Minuten sind viel zu kurz zum Lernen!!!");
            return false;
        } else {
            System.out.println("Lernen für " + dauer + " Minuten");
            return true;
        }
    }
}
