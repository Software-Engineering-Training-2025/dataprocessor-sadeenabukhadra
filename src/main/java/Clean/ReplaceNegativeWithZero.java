package Clean;

import java.util.List;
import java.util.stream.Collectors;

public class ReplaceNegativeWithZero implements Clean {

    @Override
    public List<Integer> clean(List<Integer> list) {
        return list.stream()
                .map(x -> x < 0 ? 0 : x)
                .collect(Collectors.toList());
    }
}
