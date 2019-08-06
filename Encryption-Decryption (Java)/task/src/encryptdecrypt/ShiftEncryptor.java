package encryptdecrypt;

class ShiftEncryptor extends Algorithm {
    @Override
    String process(String message, int key) {
        StringBuilder cryptodata = new StringBuilder();

        for (char next : message.toLowerCase().toCharArray()){
            if(' '!=next&&next>='a'&&next<='z'){
                int res = next+key;
                if (res>'z'){
                    cryptodata.append((char)('a'+res%'z'-1));
                }else cryptodata.append((char)res);
            }else cryptodata.append(next);
        }

        return cryptodata.toString();

    }
}
