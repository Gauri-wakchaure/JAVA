public class String_Builder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Gauri");
        System.out.println(sb);

        // char At index 0
        System.out.println(sb.charAt(0));

        // Set chat At index 0
        sb.setCharAt(4, 'i');
        System.out.println(sb);

        // insert
        sb.insert(0, 'g');
        System.out.println(sb);

        // delete
        sb.delete(2,3);
        System.out.println(sb);

        // Append
        StringBuilder sb2 = new StringBuilder("H");
        sb2.append("e");
        sb2.append("l");
        sb2.append("l");
        sb2.append("o");
        sb2.append("o");
        System.out.println(sb2);

        // length
        System.out.println(sb.length());

        // Reverse String
        StringBuilder sb3 = new StringBuilder("Hello");
        for(int i= 0; i<sb3.length()/2; i++) {
          int front = i;
          int back = sb3.length() - 1 - i;

          char frontChar = sb3.charAt(front);
          char backChar = sb3.charAt(back);

          sb3.setCharAt(front, backChar);
          sb3.setCharAt(back, frontChar);
        }
        System.out.println(sb3);
    }
}
