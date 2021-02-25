public class StringProcessor {

    public static String repeatNTimes(String s, int N) {
        if (N < 0) {
            throw new IllegalArgumentException();
        } else if (N == 0) {
            return "";
        } else {
            String result = "";
            for (int i = 0; i < N; i++) {
                result += s;
            }
            return result;
        }
    }

    public static int countOfOccurrences(String str1, String str2) {
        if (str2 == null || str2.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int count = 0;
        int indexOf = 0;
        while (indexOf != -1) {
            indexOf = str1.indexOf(str2, indexOf);
            if (indexOf != -1) {
                count++;
                indexOf += str2.length();
            }
        }
        return count;
    }

    public static String replace123(String str) {
        return str.replace("1", "один").replace("2", "два").replace("3", "три");
    }

    public static StringBuilder deleteEvenChars(StringBuilder str) {
        int len = (int) Math.round(str.length() / 2.);
        for (int i = 0; i < len; i++) {
            str.deleteCharAt(i);
        }
        return str;
    }
}

