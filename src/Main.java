import java.lang.Math;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        TextTools textTools = new TextTools();
        Vigenere vigenere = new Vigenere();
        FriedmannTest friedmannTest = new FriedmannTest();
        KasiskiTest kasiskiTest = new KasiskiTest();
        Caesar caesar = new Caesar();

        String password = "MORPHEUS";
        String clearText = "Ach, wie schön, dass niemand weiß, dass ich Rumpelstielzchen heiß";
        String secret = "KFEKWIFHZBJRTUBOWRIMHBTUOOJAXIUBVNTFWYCWEDZFHJTCPVSORSZSANVNBFDLPNFKAYSIYOXPYWMWBLSOUJISWSLXEKQMMWTUZVUUGBZDHJNWWWQMKFXIQIQVTUDJEIHEXIZFYHTUZYFZXTKFCCZSPMNEFKAYSCDEXQFTTFVNVLHJKFWYCQCULTHJBYDDRXUQEEXOSKHGMWMWQJGYSXMOQWNNHENZFOLLNGAYKFCCZSNERZEIMWFHHPVSCPXIXACUCWNALIQXRDTSRDEKWAWGUUGBOTXPXZTUZQVSFOCOQGNNURTFZDTUHPHGEIFZTAXPVMJUHCKAFOWBIMHBFBVIRQLKOLWYQJKGKFJRUQHPVBZDUARQUKFUTCFUYOHSMWTURCUFHJRDFOWAHORGCUEKWQKFOTZJZARRXPTUQYSAMWSOCVYENBHJNWHBMQKFGYXVAGDGXTSOHBOYXIDWNNHBMQRGCVSZEICVCCQMWUKAVSZFHEMTKOSOSLTULKKVJRCOFBKFOYQZIUVNVJNNLXLXKIGXLXDMHKHCWWRMZQQYCVKFCCTSNZNAXCNQBEVSNUXTRDDZRGKNUQNNRJKGCCTUQGDEHCWWZDZDZXIKNCBFSDSMDEQCFOWBQYZXZVZBXPOIOTZJBIDJKGHBTULKLMBFIPWYGCNFZSCVCQJNEKGQXVYOXPEKWWBFPEUUWUKAWUKAZVBYSYHJKFWERRIJHHWYTSXFFYOSRHHJNNURBNIKYHTULKWRFBBGRKYENBYMZXFBHJNWMIRHXPEKWWMWKFEKXSCHXTLIIKCVXPNNEQKIDYCHFZHEOJXVSODVVJTUZQIMCUGQJRNWRQTUFOGBUQFHUUKFWYRGUMXTBFKFSOEDMKGUHPIONWHCHEZVZDSOFRHJVSFOFUKFZDYACMHGMWHPYOECNNQUFKBIVAQJKGKFEKWYMWTFFBZIXOPMLXVSPCRXMQMLKOOCNNHDPRRDFZWUKAVIRQBYQRBHXPDXRGHBUQWAMSZQTCGQWGQVTUHPPMHBBLZDPCMWZDRDTGBYEDHJKFEKUUCVKAGFHJNWCQTXWKXFVKOLEKDJRDFRHJNWISREOLNNGCJWNWVKZVRRVKMLVNHSWQKFKFPPXPQKRGYYUUHPJRTUHPPMHBKIUBTUTXOSQVHSZIANTBSODCTHCCMWEKOEHECVECGVHJNWVFMQRKGQXVNFQCGCSLFHRXZFDMHPUUCVTUZQMIZQKFRXWGUADLRUUUKFYMRMZQUOOSRHYMFBXSJUFUNXBRNH";

		/*
		String cipheredText = vigenere.cipher(clearText, password);
		System.out.println(cipheredText);


		String decipheredText = vigenere.decipher(secret, password);
		System.out.println(decipheredText);


		textTools.formatText(clearText, true);
		textTools.frequencyAnalysis(secret);
		*/

        //System.out.println("Die ermittelte Länge des Schlüssels durch den Friedmanntest beträgt " + friedmannTest.estimateKeyLength(secret) + " Zeichen");

		/*
		for(int i=0; i<splittedText.length;i++) {
			System.out.println(splittedText[i]);
		}
		*/

        //System.out.println(kasiskiTest.euklidAlgorithmOld(27, 77));
        System.out.println(Math.pow(283,257));

    }
}