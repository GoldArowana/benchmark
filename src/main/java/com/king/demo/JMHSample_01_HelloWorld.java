package com.king.demo;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class JMHSample_01_HelloWorld {

    //http://hg.openjdk.java.net/code-tools/jmh/file/tip/jmh-samples/src/main/java/org/openjdk/jmh/samples/

    /**
     * 给待测试的方法加上@Benchmark注解
     */
    @Benchmark
    public void wellHelloThere() {
        // 这里是一个空实现
    }

    /*
     * ============================== HOW TO RUN THIS TEST: ====================================
     *
     * You are expected to see the run with large number of iterations, and
     * very large throughput numbers. You can see that as the estimate of the
     * harness overheads per method call. In most of our measurements, it is
     * down to several cycles per call.
     *
     * a) Via command-line:
     *    $ mvn clean install
     *    $ java -jar target/benchmarks.jar JMHSample_01
     *
     * JMH generates self-contained JARs, bundling JMH together with it.
     * The runtime options for the JMH are available with "-h":
     *    $ java -jar target/benchmarks.jar -h
     *
     * b) Via the Java API:
     *    (see the JMH homepage for possible caveats when running from IDE:
     *      http://openjdk.java.net/projects/code-tools/jmh/)
     */

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(JMHSample_01_HelloWorld.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
