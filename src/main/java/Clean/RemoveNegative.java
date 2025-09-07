package Clean;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveNegative implements  Clean{
    @Override
    public List<Integer> clean(List<Integer> list) {
        return list.stream()
                .filter(x -> x >=0)
                .collect(Collectors.toList());
    }
}
