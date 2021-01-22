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



#### @Async异步处理机制

TO DO：
1.具体用法+使用示例

#### @Async调用中的事务处理机制

TO DO：
1.具体用法+使用示例




