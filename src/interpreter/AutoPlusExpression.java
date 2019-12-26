package interpreter;

public class AutoPlusExpression implements Expression {
    @Override
    public void interpreter(Context ctx) {
        Integer i = Integer.valueOf(ctx.getInput());
        Integer integer = ++i;
        // ctx.setInput(String.valueOf(integer)); // 也可在 setter 寫
        ctx.setOutput(integer);
    }

//    @Override
//    public AutoPlusExpression clone() throws CloneNotSupportedException {
//        return (AutoPlusExpression) super.clone();
//    }
}
