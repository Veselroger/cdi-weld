package interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * Методы, аннотированные {@link ProductionLog}, будут пропущены через интерцептор.
 */
@ProductionLog
@Interceptor
public class ProductLogInterceptor {

    @AroundInvoke
    public Object log(InvocationContext ic) throws Exception {
        System.out.println("Invocation method: " + ic.getMethod().getName());
        return ic.proceed();
    }

}