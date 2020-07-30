package statuses.parent;

import java.util.Collection;

public interface Transition {

    Collection<?> nextStatusesAsCollection();

}
