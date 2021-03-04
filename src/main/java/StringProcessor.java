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
        String str2 = str;
return str2.replace("1","один").replace("2","два").replace("3","три");
    }

    public static void StringBuilder deleteEvenChars(StringBuilder str) {
       for(int i=1; i < str.length/2; i++) {
            str.deleteCharAt(i);
        }
    }
}

