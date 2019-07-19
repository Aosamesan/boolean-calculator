// Generated from /Users/aosamesan/IdeaProjects/booleancalculator/src/main/java/com/aosamesan/parser/Calculator.g4 by ANTLR 4.7.2
package com.aosamesan.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CalculatorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CalculatorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CalculatorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#imply_expression}.
	 * @param ctx the parse tree
	 */
	void enterImply_expression(CalculatorParser.Imply_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#imply_expression}.
	 * @param ctx the parse tree
	 */
	void exitImply_expression(CalculatorParser.Imply_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_expression(CalculatorParser.Or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#or_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_expression(CalculatorParser.Or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expression(CalculatorParser.And_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expression(CalculatorParser.And_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#xor_expression}.
	 * @param ctx the parse tree
	 */
	void enterXor_expression(CalculatorParser.Xor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#xor_expression}.
	 * @param ctx the parse tree
	 */
	void exitXor_expression(CalculatorParser.Xor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#not_expression}.
	 * @param ctx the parse tree
	 */
	void enterNot_expression(CalculatorParser.Not_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#not_expression}.
	 * @param ctx the parse tree
	 */
	void exitNot_expression(CalculatorParser.Not_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(CalculatorParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(CalculatorParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CalculatorParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CalculatorParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(CalculatorParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(CalculatorParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#true_expression}.
	 * @param ctx the parse tree
	 */
	void enterTrue_expression(CalculatorParser.True_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#true_expression}.
	 * @param ctx the parse tree
	 */
	void exitTrue_expression(CalculatorParser.True_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#false_expression}.
	 * @param ctx the parse tree
	 */
	void enterFalse_expression(CalculatorParser.False_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#false_expression}.
	 * @param ctx the parse tree
	 */
	void exitFalse_expression(CalculatorParser.False_expressionContext ctx);
}