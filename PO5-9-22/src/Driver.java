import challenges.MagicIndex;

public class Driver {

    private static MagicIndex magicIndex;

    public static void main(String[] args){

        int[] array = new int[10000];

        for (int i = 0; i < 50; i++) array[i] = i - 1;
        array[50] = 50;
        for (int i = 51; i < array.length; i++) array[i] = i + 2;

        magicIndex = new MagicIndex();
        System.out.println(magicIndex.findMagicIndexDistinct(array));

    }
}
