public class BigBoss {
    int seasonNumber;
    String hostName;
    String winnerName;
    int totalContestants;
    boolean isLiveShow;
    int prizeAmount;
    static String showName;
    static String channelName;
    static int startedYear;

    static {
        showName = "Big Boss";
        channelName = "Reality TV Network";
        startedYear = 2006;
    }

    public BigBoss(int seasonNumber, String hostName, String winnerName, int totalContestants, boolean isLiveShow, int prizeAmount) {
        this.seasonNumber = seasonNumber;
        this.hostName = hostName;
        this.winnerName = winnerName;
        this.totalContestants = totalContestants;
        this.isLiveShow = isLiveShow;
        this.prizeAmount = prizeAmount;
    }

    public static void main(String[] args) {
        BigBoss season1 = new BigBoss(1, "Salman Khan", "Rahul Roy", 15, true, 1000000);
        System.out.println(season1.seasonNumber);
        System.out.println(season1.hostName);
        System.out.println(season1.winnerName);
        System.out.println(season1.totalContestants);
        System.out.println(season1.isLiveShow);
        System.out.println(season1.prizeAmount);
        System.out.println(showName);
        System.out.println(channelName);
        System.out.println(startedYear);

        BigBoss season2 = new BigBoss(2, "Amitabh Bachchan", "Ashutosh Kaushik", 20, true, 1500000);
        System.out.println(season2.seasonNumber);
        System.out.println(season2.hostName);
        System.out.println(season2.winnerName);
        System.out.println(season2.totalContestants);
        System.out.println(season2.isLiveShow);
        System.out.println(season2.prizeAmount);
        System.out.println(showName);
        System.out.println(channelName);
        System.out.println(startedYear);
		
		BigBoss season3 = new BigBoss(3, "Sudeep", "Chandan", 15, false, 1500000);
        System.out.println(season3.seasonNumber);
        System.out.println(season3.hostName);
        System.out.println(season3.winnerName);
        System.out.println(season3.totalContestants);
        System.out.println(season3.isLiveShow);
        System.out.println(season3.prizeAmount);
        System.out.println(showName);
        System.out.println(channelName);
        System.out.println(startedYear);
    }
}

