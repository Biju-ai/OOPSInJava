package OOPSFile;

import static com.sun.tools.javac.jvm.ByteCodes.ret;

interface CC {
    void ret();
}
public class LambdaExpression {
    public static void main(String[] args) {
        CC obj = ()->
                System.out.println("fhvff");
        obj.ret();
            }
        }

