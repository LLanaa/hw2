public class BonusMilesService {

    public int calculate(int cost) {
        int miles = 0;
        if (cost > 1000) {
            miles = cost / 100;
        }
        return miles;
    }
}
