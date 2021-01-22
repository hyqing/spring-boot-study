### 参考资料：

* [Spring使用@Async注解](https://www.cnblogs.com/wlandwl/p/async.html)
* [Spring中@Async用法总结](https://www.cnblogs.com/jpfss/p/10273129.html)
* [Spring中异步注解@Async的使用、原理及使用时可能导致的问题](https://blog.51cto.com/14890701/2518888#h0)
* [SpringBoot 实现异步事件Event](https://blog.csdn.net/superylcfly/article/details/103978422)

#### 何为异步调用

同步调用：同步就是整个处理过程顺序执行，当各个过程都执行完毕，并返回结果
异步调用：只是发送了调用命令，调用者无需等待被调用的方法完全执行完毕，而是继续执行下面的流程

例如：在某个调用中，需要顺序调用A,B,C三个过程方法;如果他们是同步调用，则需要将他们都顺序执行
完毕之后，方算过程执行完毕；如果B为一个异步的调用方法，则在执行完A之后，调用B，并不等待B完成，
而是执行开始调用C，待C执行完毕之后，就意味着这个工程执行完毕了。


#### @Async的基本使用

这个注解的作用在于可以让被标注的方法异步执行，但是有两个前提

1.配置类上添加@EnableAsync注解
2.需要异步执行的方法的所在类由Spring管理
3.需要异步执行的方法上添加了@Async注解

#### @Async有返回值的用法

1.使用Future类型

#### @Async自定义线程池模式

从Spring3开始提供了@Async注解，该注解可以被标注在方法上，以便异步调用该方法。

调用者将在调用时立即返回，方法的实际执行将提交给Spring TaskExecutor的任务中，该方法由TaskExecutor中的线程来执行


**Spring 已经实现的线程池：**
1.SimpleAsyncTaskExecutor:不是真正的线程池，这个类不重用线程，默认每次调用都会创建一个新的线程
2.SyncTaskExecutor：这个类没有实现异步调用，只是一个同步操作。只适用于不需要多线程的地方
3.ConcurrentTaskExecutor
4.SimpleThreadPoolTaskExecutor：是Quartz的SimpleThreadPool的类。线程池同时被quartz和非quartz使用，才需要使用此类。
5.ThreadPoolTaskExecutor：最常使用，推荐。其实质是对java.util.concurrent.ThreadPoolExecutor的包装。

**用法**

* 重新实现接口AsyncConfigurer
* 继承AsyncConfigurerSupport
* 配置自定义的TaskExecutor替代内置的任务执行器

@Async的默认调用规则，会优先查询源码中实现AsyncConfigure这个接口的类，实现这个接口的类为AsyncConfigurerSupport。
但默认配置的线程池和异步处理方法均为空，所以，无论是继承或者重新实现接口，都需指定一个线程。

重新实现public Executor getAsyncExecutor()方法——测试的时候不用也是可以的
TO DO：翻一下源码看看 getAsyncExecutor()方法的作用

@Async注解，使用系统默认或者自定义的线程池（代替默认线程池）。可在项目中设置多个线程，在异步调用时，指明需要调用
的线程池名称，如@Async("newTask")。

**注意点**
* 自定义的线程池，需要声明为Bean


#### @Async异步处理机制

TO DO：
1.具体用法+使用示例

#### @Async调用中的事务处理机制

TO DO：
1.具体用法+使用示例




