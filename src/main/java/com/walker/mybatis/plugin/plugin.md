# Plugins

了解MyBatis的插件机制...       
[官网](https://mybatis.org/mybatis-3/zh/configuration.html#plugins)
> MyBatis允许对已映射语句执行过程中的某一点进行拦截调用，默认情况下，允许拦截的方法调用
> - Executor(update, query, flushStatements, commit, rollback, getTransaction, close, isClosed)
> - ParameterHandler(getParameterObject, setParameters)
> - ResultSetHandler(handleResultSets, handleOutputParameters)
> - StatementHandler(prepare, parameterize, batch, update, query)

1. 如何实现分页插件，SQL执行时间等插件？     
    实现`Interceptor`接口，重写其中方法，实现自己的业务逻辑
    ```java
    import org.apache.ibatis.plugin.Interceptor;
    import org.apache.ibatis.plugin.Intercepts;
    @Intercepts({@Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class,
            RowBounds.class, ResultHandler.class})})
    public class PagePlugin implements Interceptor {
       
    }
    ```
   注册自己实现的插件
2. 插件的解析，加载，执行的过程？      
    配置文件的解析；        
    spring boot 环境下Java Config配置；       
    如何加载？       
    如何执行？
3. 设计思想？
