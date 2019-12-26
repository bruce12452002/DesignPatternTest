package interpreter;

import java.util.stream.Stream;

public class InterpreterTest {
    // 直譯器模式：類似文字過濾器的功能

    public static void main(String[] args) {
        display(new AutoPlusExpression(), new Context("369"));

        /*
        Context ctx = new Context("369");
        List<Expression> list = List.of(new AutoPlusExpression(), new AutoPlusExpression(), new AutoPlusExpression());
        list.forEach(e -> {
            e.interpreter(ctx);
            System.out.println(ctx.getInput() + "=" + ctx.getOutput());
        });
        */
    }

    private static void display(Expression expression, Context ctx) {
//    private static void display(AutoPlusExpression expression, Context ctx) {
//        for (var i = 0; i < 10; i++) {
//            expression.interpreter(ctx);
//            System.out.println(ctx.getInput() + "=" + ctx.getOutput());
//        }


        Stream.iterate(expression, ex -> new AutoPlusExpression()).limit(10).forEach(e -> {
            e.interpreter(ctx);
            System.out.println(ctx.getInput() + "=" + ctx.getOutput());
        });

        /*
        Stream.iterate(expression, ex -> {
                    try {
                        return ex.clone();
                    } catch (CloneNotSupportedException e) {
                        System.err.println(e.getMessage());
                    }
                    return null;
                }
        ).limit(3).forEach(e -> {
            e.interpreter(ctx);
            System.out.println(ctx.getInput() + "=" + ctx.getOutput());
        });
        */
    }
}
