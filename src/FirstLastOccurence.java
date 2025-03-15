import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstLastOccurence {
    int[] arr;

    FirstLastOccurence(int[] arr) {
        this.arr = arr;
    }

    int[] findFirstLastOccurence(int target) {

        int first = findElement(target, true);
        int second = findElement(target, false);

        return new int[]{first, second};
    }

    int findElement(int target, boolean isFirstOcurence) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                ans = mid;
                if (isFirstOcurence) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return ans;
    }
}
