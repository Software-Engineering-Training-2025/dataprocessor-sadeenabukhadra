package analysis.Analysis;

import java.util.Collections;
import java.util.List;

public class Median implements Analysis {

    @Override
    public double analyze(List<Integer> list) {
        if (list == null || list.isEmpty()) return Double.NaN;

        Collections.sort(list);
        int n = list.size();

        if (n % 2 == 0) {
            return (list.get(n / 2 - 1) + list.get(n / 2)) / 2.0;
        } else {
            return list.get(n / 2);
        }
    }
}
