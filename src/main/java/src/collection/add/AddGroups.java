package collection.add;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class AddGroups {
    public void addGroupsTest() {
        Collection<Integer> collection =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(collection); // [1, 2, 3, 4, 5]
    }

    public static void main(String[] args) {

        // new ArrayList<>(Arrays.asList(1, 3, 7, 9))
        Collection<Integer> collection =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(collection);

        // addAll(Arrays.asList([array]))
        Integer[] nums = {244, 51, null};
        collection.addAll(Arrays.asList(nums));
        System.out.println(collection);
        // [1, 2, 3, 4, 5, 244, 51, null]

        // Collections.addAll([collection], element_which_add_to_collection, ...)
        Collections.addAll(collection, 2, 14);
        System.out.println(collection);
//        [1, 2, 3, 4, 5, 244, 51, null, 2, 14]

        // Collections.addAll([collection], array_which_add_to_collection, ...)
        Collections.addAll(collection, nums);
        System.out.println(collection);
        // [1, 2, 3, 4, 5, 244, 51, null, 2, 14, 244, 51, null]
    }
}
