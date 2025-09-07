package analysis.Analysis;

import java.util.Collections;
import java.util.List;

public class P90NearestRank implements Analysis {

    @Override
    public double analyze(List<Integer> list) {
        if (list == null || list.isEmpty()) return Double.NaN;

        Collections.sort(list);
        int n = list.size();
        int rank = (int) Math.ceil(0.9 * n);  // ترتيب 90% حسب nearest-rank (1-based)

        return list.get(rank - 1);  // طرح 1 لتحويله إلى 0-based index
    }
}
