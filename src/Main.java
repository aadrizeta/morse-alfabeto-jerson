import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la palabra");
        String palabra = scanner.nextLine();



        System.out.println("Palabra traducida de morse "+morseALetras(palabra));

    }
public static String morseALetras(String mor){
    HashMap<String, String> codigoMorse = new HashMap<String, String>();
    codigoMorse.put( ".-","A");
    codigoMorse.put("-...","B");
    codigoMorse.put("-.-.","C");
    codigoMorse.put("-..","D");
    codigoMorse.put(".","E");
    codigoMorse.put("..-.","F");
    codigoMorse.put( "--.","G");
    codigoMorse.put("....","H");
    codigoMorse.put("..","I");
    codigoMorse.put(".---","J");
    codigoMorse.put("-.-","K");
    codigoMorse.put(".-..","L");
    codigoMorse.put("--","M");
    codigoMorse.put("-.","N");
    codigoMorse.put("---","O");
    codigoMorse.put(".--.","P");
    codigoMorse.put("--.-","Q");
    codigoMorse.put(".-.","R");
    codigoMorse.put("...","S");
    codigoMorse.put("-","T");
    codigoMorse.put("..-","U");
    codigoMorse.put( "...-","V");
    codigoMorse.put(".--","W");
    codigoMorse.put("-..-","X");
    codigoMorse.put("-.--","Y");
    codigoMorse.put("--..","Z");
    codigoMorse.put("/"," ");

    String codT[] = mor.split(" ");
    String palabra = "";

    for (int i = 0; i < codT.length;i++) {
        palabra+=codigoMorse.get(codT[i]);

    }

    String retorno=" " +palabra;
    return retorno;

}
}