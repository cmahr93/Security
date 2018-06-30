import java.util.Arrays;

public class FriedmannTest implements VigenereTest {

    private static double iRan = 0.0385;
    private static double iGer = 0.0762;

    TextTools textTools = new TextTools();

    public double IndexOfCoincidence(String text) {

        int[] frequencies = textTools.frequencyAnalysis(text);
        double iChiffre = 0;
        double n = (double)text.length(); // Anzahl Zeichen des Textes
        int sum = 0;

        for(int i=0; i<26; i++) {
            sum += frequencies[i] * (frequencies[i] - 1);
        }

        iChiffre = (1/(n*(n-1))) * sum;

        return iChiffre;
    }

    public int estimateKeyLength(String chiffre) {

        int keyLength;
        double iChi = IndexOfCoincidence(chiffre);
        int n = chiffre.length(); // Anzahl Zeichen des Textes

        keyLength = (int)((n * (iGer - iRan)) / (iChi*(n-1) + iGer - n * iRan));

        return keyLength;
    }

    public String[] splitText(String text, int keyLength) {

        String splittedText[] = new String[keyLength];
        Arrays.fill(splittedText, "");
        int j = 0;

        for(int i = 0; i<text.length(); i++) {
            //splittedText[j] = splittedText[j].concat(String.valueOf(text.charAt(i)));
            splittedText[j] = splittedText[j] + String.valueOf(text.charAt(i));
            j++;

            if(j >= keyLength) {
                j=0;
            }
        }

        return splittedText;
    }
}