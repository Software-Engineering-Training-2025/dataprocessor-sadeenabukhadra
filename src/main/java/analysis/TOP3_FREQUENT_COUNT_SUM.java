package analysis.Analysis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TOP3_FREQUENT_COUNT_SUM implements Analysis {

    @Override
    public double analyze(List<Integer> list) {
        if (list == null || list.isEmpty()) return 0.0;


        Map<Integer, Integer> freqMap = new HashMap<>();
        for (Integer v : list) {
            freqMap.put(v, freqMap.getOrDefault(v, 0) + 1);
        }


        List<Integer> topCounts = freqMap.entrySet().stream()
                .sorted((a, b) -> {
                    int cmp = b.getValue().compareTo(a.getValue());
                    return cmp != 0 ? cmp : a.getKey().compareTo(b.getKey());
                })
                .limit(3)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());


        return topCounts.stream().mapToDouble(Integer::doubleValue).sum();
    }
}
