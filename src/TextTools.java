import javax.lang.model.element.Element;
import java.util.HashMap;
import java.util.Map;

public class TextTools {

    public String formatText(String text, boolean letter) {

        // boolean letter: gibt an, ob der String in Großbuchstaben (UpperCase) oder Kleinbuchstaben
        // (LowerCase) ausgegeben werden soll; true = UpperCase, false = LowerCase

        if(letter == true) {
            text = text.toUpperCase();
            text = text.replaceAll("Ä", "AE");
            text = text.replaceAll("Ö", "OE");
            text = text.replaceAll("Ü", "UE");
        } else {
            text = text.toLowerCase();
            text = text.replaceAll("ä", "ae");
            text = text.replaceAll("ö", "oe");
            text = text.replaceAll("ü", "ue");
        }

        text = text.replaceAll(" ", "");
        text = text.replaceAll(",", "");
        //text = text.replaceAll(".", "");

        //System.out.println("formatierter Text: " + text);

        return text;
    }


    public int[] frequencyAnalysis(String text) {

        text = this.formatText(text, true);
        //char charText[] = text;
        int result[] = new int[26];

        /*
        for(char c : charText){
            if(charText[c] >= 65 && charText[c] <= 90){
                result[(int)(charText[c]) - 65] += 1;
            }
        }
        */

        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) >= 65 && text.charAt(i) <= 90) {
                result[(int)(text.charAt(i)) - 65] += 1;
            }
        }

        for(int i = 0; i < result.length; i++) {
            //System.out.println((char)(i+65) + ": " + result[i] + " = " + (((float)result[i]*100)/text.length()) + " %");
            //System.out.printf((char)(i+65) + ": " + result[i] + " = %.2f %%%n", (((float)result[i]*100)/text.length()));
            //System.out.printf("%.2f %n", (((float)result[i]*100)/text.length()));
            System.out.println(result[i]);
        }

        return result;
    }


    public void frequencyAnalaysisTuple(String text, int combinationLength) {

        HashMap<String, Integer> tuples = new HashMap<>();

        for(int i = 0; i <= text.length()- combinationLength-1;) {

            while(text.length() >= combinationLength) {

                String tuple = text.substring(0, combinationLength);
                String subString1 = "";
                String subString2 = "";

                text = text.substring(combinationLength);
                int counter = 1;

                for(int j = 0; j < text.length() - combinationLength-1;) {
                    if(text.contains(tuple)) {
                        counter++;

                        j = text.indexOf(tuple);

                        subString1 = text.substring(0, text.indexOf(tuple));
                        subString2 = text.substring(text.indexOf(tuple)+combinationLength, text.length());
                        text = subString1.concat(subString2);

                    } else {
                        j = text.length();
                    }
                }

                tuples.put(tuple, counter);
            }
        }

        //HashMap ausgeben
        for(Map.Entry<String, Integer> entry : tuples.entrySet()) {

            if(entry.getValue() > 3) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}