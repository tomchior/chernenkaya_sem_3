public class Poem {
    String[] s;

    public Poem(String[] s) {
        this.s = s;
    }
    public void findRhyme() {
        for (int k = 0; k < s.length - 1; k++) {
            for (int i = 1; i < s.length; i++) {
                if (s[k].substring(s[k].length() - 3, s[k].length() - 1).equals(s[i].substring(s[i].length() - 3, s[i].length() - 1)) && (i != k))
                    System.out.println("Строка " + (k + 1) + " рифмуется со строкой " + (i + 1));
            }
        }
    }

}


