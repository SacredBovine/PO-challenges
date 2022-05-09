package challenges;

public class MagicIndex {

    private static int[] array;



//    Simple Binary search
//    Non-distinct values do not work with this implementation of BS.
    private static int searchDistinct(int left, int right){
        if (right - left == 1){
            if (array[left] == left) return left;
            if (array[right] == right) return right;
            return -1;
        }

        int mid = (( right - left ) / 2 ) + left;

        if (array[mid] == mid) return mid;
        if (array[mid] < mid) return searchDistinct(mid, right);
        if (array[mid] > mid) return searchDistinct(left, mid);
        return -1;
    }

//    returns -1 if no magic index found
    public int findMagicIndexDistinct(int[] array){
        this.array = array;
        return searchDistinct(0, array.length - 1);
    }


}
