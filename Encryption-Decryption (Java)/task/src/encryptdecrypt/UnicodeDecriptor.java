package encryptdecrypt;

public class UnicodeDecriptor extends Algorithm {
    @Override
    String process(String message, int key) {

        StringBuilder cryptodata = new StringBuilder();

        for (char next : message.toCharArray()){
            cryptodata.append((char)(next-key));
        }

        return cryptodata.toString();
    }
}
