package com.aosamesan.calculator;

import com.aosamesan.model.CalculationResult;
import com.aosamesan.parser.CalculatorLexer;
import com.aosamesan.parser.CalculatorParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BooleanCalculator {
    private static Logger logger = LoggerFactory.getLogger(BooleanCalculator.class);

    public static CalculationResult calculate(String expr) {
        try {
            CharStream stream = CharStreams.fromString(expr);
            Lexer lexer = new CalculatorLexer(stream);
            TokenStream tokenStream = new BufferedTokenStream(lexer);
            CalculatorParser parser = new CalculatorParser(tokenStream);
            parser.setErrorHandler(new BailErrorStrategy());
            ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
            BooleanCalculatorListener listener = new BooleanCalculatorListener();

            parseTreeWalker.walk(listener, parser.statement());

            return listener.getResult();
        } catch (Exception e) {
            logger.error("Error", e);
            return null;
        }
    }
}
