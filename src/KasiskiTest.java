public class KasiskiTest implements VigenereTest {

    public int estimateKeyLength(String text){

        int keyLength = 0; //Schlüssellänge

        String compareString = "";
        int wordLength = 6;
        int distances[] = new int[100];
        int distanceCounter = 0;

        for(int i = 0; i < (text.length() - wordLength); i++) {

            compareString = text.substring(i, i+wordLength);

            for(int j = i+1; j < text.length() - wordLength; j++) {
                if(compareString.equals(text.substring(j, j+wordLength)) && distanceCounter < 100) {
                    distances[distanceCounter] = j-i;
                    distanceCounter++;
                }
            }
        }

        keyLength = euklidAlgorithmOld(distances[0], distances[1]);

        if(distances.length > 2) {
            for(int k = 2; k < distances.length; k++) {
                keyLength = euklidAlgorithmOld(keyLength, distances[k]);
            }
        }
        return keyLength;
    }


    public int euklidAlgorithmOld(int a, int b) {
        int result = 0;

        if(a==0)
            result = b;
        else {
            while(b != 0) {
                if(a > b)
                    a = a-b;
                else
                    b = b - a;
            }
            result = a;
        }
        return result;
    }
}