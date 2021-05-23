package nullObject;

import java.lang.reflect.Proxy;

public class NullObjectDemo {

    public static <T> T noOp(Class<T> itf) {
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[]{itf},
                (proxy, method, args) -> {
                    if(method.getReturnType().equals(Void.TYPE))
                        return null;
                    else
                        return method.getReturnType().getConstructor().newInstance();
                }
        );
    }

    public static void main(String[] args) {

        Log log = noOp(Log.class);

        BankAccount bankAccount = new BankAccount(log);
        bankAccount.deposit(100);
        bankAccount.withdraw(200);
    }
}
