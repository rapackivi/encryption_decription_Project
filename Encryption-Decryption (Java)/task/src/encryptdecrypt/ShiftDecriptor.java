package encryptdecrypt;

class ShiftDecriptor extends Algorithm {
    @Override
    String process(String mess,int key) {
        StringBuilder cryptodata = new StringBuilder();

        for (char next : mess.toCharArray()){
            if(' '!=next&&next>='a'&&next<='z'){
                int res = next-key;
                if (res<'a'){
                    cryptodata.append((char)('z'-('a'-res-1)));
                }else cryptodata.append((char)res);
            }else cryptodata.append(next);
        }

        return cryptodata.toString();
    }
}
