public class TwitterTweet implements IEncryptable{
    private String username;
    private int numCharacters;
    private String tweet;

    public TwitterTweet(String username, String tweet) {
        this.username = username;
        this.tweet = tweet;
        if (this.hasReachedMaximum() == true) {
            this.numCharacters = -1;
        }
        else {
            this.numCharacters = this.tweet.length();
        }

    }

    public boolean hasReachedMaximum() {
        if (this.tweet.length() > 140) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getTweet() {
        return this.tweet;
    }


    @Override
    public String encrypt() {
        String tempstr = this.tweet;
        return MorseCodeUtilites.Equus(tempstr);
    }

    @Override
    public boolean isOriginal(String text) {
        return this.tweet.equals(MorseCodeUtilites.DEquus(text));
    }
}
