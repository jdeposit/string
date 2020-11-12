package jdep.string;

public class StringWrap {

    /**
     * Removes quotes around any string if there are quotes.
     * Example: unquote("\"str\"") returns "str".
     * @param s
     * String to be unquoted.
     * @return
     * Returns string without quotes.
     */
    public static String unquote(String s) {
        String result = unwrap(s, '\"');
        if (result.length() == s.length()) {
            result = unwrap(s, '\'');
        }
        return result;
    }

    /**
     * Removes any character from beginning and ending of any string if there are such wrappers.
     * Example: unwrap("*abc*", '*') returns "abc".
     * @param s
     * String to be unwrapped.
     * @param wrapper
     * Character to be removed from beginning and ending of a string.
     * @return
     * Returns string without wrappers.
     */
    public static String unwrap(String s, char wrapper) {
        if (s == null || s.length() < 2) {
            return s;
        }
        if (s.charAt(0) == wrapper && s.charAt(s.length() - 1) == wrapper) {
            s = s.substring(1, s.length() - 1);
        }
        return s;
    }

}
