package interpreter;

public class Token {

    public TokenType tokenType;
    public String text;

    public Token(TokenType tokenType, String text) {
        this.tokenType = tokenType;
        this.text = text;
    }

    @Override
    public String toString() {
        return "`" + text + "`";
    }
}
