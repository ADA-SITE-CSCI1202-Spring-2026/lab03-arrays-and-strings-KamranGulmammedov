public class ex11 {

    public static String swap(String s) {
        
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.length() > 1) {
               
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                String middle = word.substring(1, word.length() - 1);
                sb.append(last).append(middle).append(first);
            } else {
               
                sb.append(word);
            }

       
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "This is PP2 Fall 2021";
        String output = swap(input);
        System.out.println(output); 
    }
}
        
