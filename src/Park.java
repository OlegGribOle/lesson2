public class Park {
    private static String parkName;
    private static String city;

    Park(String parkName, String city) {
        this.parkName = parkName;
        this.city = city;
    }

    public static class Attraction {

        private String attrName;
        private String timeWork;
        private int cost;

        Attraction(String attrName, String timeWork, int cost) {
            this.attrName = attrName;
            this.timeWork = timeWork;
            this.cost = cost;
        }

        void getAttraction() {
            System.out.println(attrName + "  " + timeWork + "  " + cost);
        }

        void getParkAttr() {
            System.out.println(parkName + "  " + city + "  " + attrName + "  " + timeWork + "  " + cost);
        }

    }
}



