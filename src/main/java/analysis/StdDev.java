package analysis;

import java.util.List;

public class StdDev implements Analysis {

    @Override
    public double analyze(List<Integer> list) {
        if (list == null || list.isEmpty()) return Double.NaN;

        double mean = 0;
        for (Integer v : list) mean += v;
        mean /= list.size();

        double sumsqr = 0;
        for (Integer v : list) sumsqr += (v - mean) * (v - mean);

        return Math.sqrt(sumsqr / list.size());
    }
}
