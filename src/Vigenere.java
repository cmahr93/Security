public class Vigenere {

    TextTools textTools = new TextTools();

    public String cipher(String text, String password) {

        text = textTools.formatText(text, true);

        password = password.toUpperCase();
        System.out.println(text);
        System.out.println(password);

        char result[] = new char[text.length()];
        String cipheredText = "";
        int j = 0; // Passwort-Index

        for(int i=0; i < text.length(); i++) { // i = Text-Index
            if (j >= password.length())
                j = 0;
            char p = password.charAt(j);
            char c = text.charAt(i);

            result[i] = (char)(c+p-65);

            if(result[i] > 90)
                result[i] -= 26;

            j++;
        }

        cipheredText = String.valueOf(result);
        return cipheredText;
    }


    public String decipher(String text, String password) {

        text = textTools.formatText(text, false);

        password = password.toLowerCase();
        System.out.println(text);
        System.out.println(password);

        char result[] = new char[text.length()];
        String decipheredText = "";
        int j = 0; // Passwort-Index

        for(int i=0; i < text.length(); i++) { // i = Text-Index
            if (j >= password.length())
                j = 0;

            char p = password.charAt(j);
            char s = text.charAt(i);

            result[i] = (char)(s-p+97);

            if(result[i] < 97)
                result[i] += 26;

            j++;
        }

        decipheredText = String.valueOf(result);
        return decipheredText;
    }


    public int getVigenereShift(char keyChar) {

        int vigenereShift = (int) keyChar - 65;

        return vigenereShift;
    }
}