public class Driver {

    public static String compressor(String orig){
        char[] chars = orig.toCharArray();
        StringBuilder ret = new StringBuilder();
        char prev = '0';
        int count = 1;
        for (char c : chars){
            if(prev == '0') prev = c;
            else if (c == prev){
                count++;
            } else {
                ret.append(prev);
                ret.append(count);
                count = 1;
                prev = c;
            }
        }
        ret.append(prev);
        ret.append(count);
        if(orig.length() <= ret.length()) return orig;
        else return ret.toString();
    }

    public static void main (String[] args){
        System.out.println(compressor("aabcccccaaa"));
        System.out.println(compressor("MaryHadALittleLamb"));
    }
}
