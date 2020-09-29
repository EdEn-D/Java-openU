package a2018;
// made the silly mistake here by thinking that im not going to recurssivly check all possibilities
// I thought simply always moving to the lowest value will give me the lowest cost
// but in this example that is not the case {2, 8, 3, 4, 5, 8, 3, 2}
// I need to skip the 4 and instead go to the 5

// this solution of checking all options and returning the minimum is the correct solution
public class a2018_1b {
    public static int cheapestRoute(int[] stations) {
        return cheapestRoute(stations, 0, 0);
    }

    private static int cheapestRoute(int[] stations, int i, int cost) {
        cost = cost + stations[i];

        if (i == stations.length - 1)
            return cost;
        if (i == stations.length - 2)
            return cheapestRoute(stations, i + 1, cost);

        int x = cheapestRoute(stations, i + 1, cost);
        int y = cheapestRoute(stations, i + 2, cost);

        return Math.min(x, y);
    }

    public static void main(String[] ars) {
        int[] x = {2, 8, 3, 4, 5, 8, 3, 2};
        System.out.println(cheapestRoute(x));
    }
}
