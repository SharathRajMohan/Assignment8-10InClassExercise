

public class SMSMessage implements IEncryptable {

    private String from;
    private String to;
    private String message;

    public SMSMessage(String from, String to, String message) {
        this.from = from;
        this.to = to;
        this.message = message;
    }

    @Override
    public String encrypt() {
        String tempstr = this.from.replace("-","");
        String result = "";
        for(int i=0;i<tempstr.length();i++){
            result = result.concat(MorseCodeUtilites.getMorseCode(tempstr.charAt(i)));
        }
        return(result);
    }

    @Override
    public boolean isOriginal(String text) {
        String decrypt = "";
        int i =0;
        int iter = 0;
        while(iter<10) {
            decrypt = decrypt + MorseCodeUtilites.getNumber(text.substring(i, 5 + i));
            i = i+5;
            iter++;
        }
        return decrypt.equals(this.from.replace("-", ""));
    }

    public void sendMessage() {
        //@NOTE: Do not change this function!
        System.out.println("The following message has been sent by " + this.encrypt() + " to " + this.to);
        System.out.println("\t" + this.message);
    }



}
