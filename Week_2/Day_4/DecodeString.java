public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int count = 0;
        String curr ="";
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');
            }
            else if (ch == '[') {
                countStack.push(count);
                stringStack.push(curr);
                count = 0;
                curr = "";
            }
            else if (ch == ']') {
                int repeat = countStack.pop();
                String decodedString = stringStack.pop();

                String temp = "";

                for (int i = 0; i < repeat; i++) {
                    decodedString += curr;
                }

                curr = decodedString;
            }
             else {
                curr += ch;
            }
        }    
        return curr;
 
    }
}
