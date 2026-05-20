class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for (String str : strs) {
            sb.append(str.length())
              .append('#')
              .append(str);
        }

        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j = i;

            // find delimiter #
            while (str.charAt(j) != '#') {
                j++;
            }

            // length of string
            int length = Integer.parseInt(str.substring(i, j));

            // actual string starts after #
            j++;

            String str_new = str.substring(j, j + length);

            result.add(str_new);

            // move to next encoded string
            i = j + length;
        }

        return result;
    }
}
