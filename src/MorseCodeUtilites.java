import java.util.ArrayList;
import java.util.List;

public final class MorseCodeUtilites {

    private MorseCodeUtilites() {
        throw new java.lang.UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static char getNumber(String morseCode) {
        switch (morseCode) {
            case "-----":
                return '0';
            case ".----":
                return '1';
            case "..---":
                return '2';
            case "...--":
                return '3';
            case "....-":
                return '4';
            case ".....":
                return '5';
            case "-....":
                return '6';
            case "--...":
                return '7';
            case "---..":
                return '8';
            case "----.":
                return '9';
            default:
                return 'x';
        }
    }

    public static String getMorseCode(char value) {
        switch (value) {
            case '0':
                return "-----";
            case '1':
                return ".----";
            case '2':
                return "..---";
            case '3':
                return "...--";
            case '4':
                return "....-";
            case '5':
                return ".....";
            case '6':
                return "-....";
            case '7':
                return "--...";
            case '8':
                return "---..";
            case '9':
                return "----.";
            default:
                return null;
        }
    }

    public static String Equus(String text){
        List<String> words = List.of(text.split(" "));
        String ecrypt = "";
        for (String word: words) {
            if(word.length()<=1){
                word = word.concat("eq");
                ecrypt = ecrypt + " " + word;

            } else {
                char temp = word.charAt(0);
                word = word.substring(1)+temp+"eq";
                ecrypt = ecrypt + " " + word;
            }
        }
        return(ecrypt.trim());
    }

    public static String DEquus(String text){
        List<String> words = List.of(text.split(" "));
        String decrypt = "";
        for (String word: words) {
            if(word.length()<=1){
                word = word.replace("eq","");
                decrypt = decrypt + " " + word;
            } else {
                word = word.substring(0,word.length()-2);
                String last_char = String.valueOf(word.charAt(word.length()-1));
                word = last_char + word.substring(0,word.length()-1);
                decrypt = decrypt + " " + word;

            }

        }
        return(decrypt.trim());
    }

}
