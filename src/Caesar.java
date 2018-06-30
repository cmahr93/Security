public class Caesar {

    public String shiftText(String text, int shiftValue) {

        char resultArray[] = new char[text.length()];
        String result = "";
        char newValue;

        for(int i = 0; i < text.length(); i++) {

            newValue = (char) (text.charAt(i) - shiftValue);

            if(newValue < 65)
                newValue = (char) (newValue + 26);
            resultArray[i] = newValue;
        }

        result = String.valueOf(resultArray);

        return result;
    }
}