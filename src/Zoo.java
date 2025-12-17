public class Zoo {
    private String zooName;

    public Zoo(String zooName) {
        this.zooName = zooName;
    }

    public String getZooName() {
        return zooName;
    }

    public void showZoo() {
        System.out.println("Zoo name: " + zooName);
    }
}
