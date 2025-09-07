package analysis.Analysis;

import java.util.List;

public class Mean implements Analysis {

    @Override
    public double analyze(List<Integer> list) {
        if (list == null || list.isEmpty()) return Double.NaN;

        double sum = 0;
        for (Integer v : list) {
            sum += v;
        }

        return sum / list.size();
    }
}
