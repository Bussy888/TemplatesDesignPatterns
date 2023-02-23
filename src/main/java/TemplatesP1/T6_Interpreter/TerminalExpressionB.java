package TemplatesP1.T6_Interpreter;

public class TerminalExpressionB extends AbstractExpression{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("B")){
            context.output=context.output+"2";
            context.input=context.input.substring(1);
        }

    }
}
