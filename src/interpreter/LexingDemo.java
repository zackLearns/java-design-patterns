package interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static interpreter.BinaryOperationType.*;
import static interpreter.TokenType.*;

public class LexingDemo {

    public static void main(String[] args) {

        String input = "(13+4)-(12+1)";
        List<Token> tokens = lex(input);
        System.out.println(tokens.stream()
            .map(token -> token.toString())
            .collect(Collectors.joining("\t")));

        Element parsed = parse(tokens);
        System.out.println(input + " = " + parsed.eval());
    }

    static List<Token> lex(String input) {
        List<Token> result = new ArrayList<>();
        for(int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            switch(currentChar) {
                case '+':
                    result.add(new Token(PLUS, "+"));
                    break;
                case '-':
                    result.add(new Token(MINUS, "-"));
                    break;
                case '(':
                    result.add(new Token(LPAREN, "("));
                    break;
                case ')':
                    result.add(new Token(RPAREN, ")"));
                    break;
                default:
                    StringBuilder stringBuilder = new StringBuilder("" + currentChar);
                    for(int j = i + 1; j < input.length(); ++j) {
                        if( Character.isDigit(input.charAt(j)) ) {
                            stringBuilder.append(input.charAt(j));
                            ++i;
                        } else {
                            result.add(new Token(INTEGER, stringBuilder.toString()));
                            break;
                        }
                    }
                    break;
            }
        }
        return result;
    }

    static Element parse(List<Token> tokens) {

        BinaryOperation result = new BinaryOperation();
        boolean haveLHS = false;
        for(int i = 0; i < tokens.size(); i++) {
            Token token = tokens.get(i);

            switch(token.tokenType) {
                case INTEGER:
                    Integer integer = new Integer(java.lang.Integer.parseInt(token.text));
                    if(!haveLHS) {
                        result.left = integer;
                        haveLHS = true;
                    } else {
                        result.right = integer;
                    }
                    break;
                case PLUS:
                    result.type = ADDITION;
                    break;
                case MINUS:
                    result.type = SUBTRACTION;
                    break;
                case LPAREN:
                    int j = i + 1;
                    for(; j < tokens.size(); j++)
                        if(tokens.get(j).tokenType != RPAREN) continue;
                        else break;
                    List<Token> subexpression = tokens.stream()
                            .skip(i + 1)
                            .limit(j - i - 1)
                            .collect(Collectors.toList());
                    Element element = parse(subexpression);
                    if(!haveLHS) {
                        result.left = element;
                        haveLHS = true;
                    } else {
                        result.right = element;
                        i = j;
                        break;
                    }

            }
        }
        return result;
    }
}
