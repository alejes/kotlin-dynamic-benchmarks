package org.sample;


import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.sample.groovy.GroovyRunnerDynamic;
import org.sample.groovy.GroovyRunnerInvokeDynamic;
import org.sample.groovy.GroovyRunnerStatic;
import org.sample.kotlin.KotlinRunnerDynamic;
import org.sample.kotlin.KotlinRunnerStatic;

import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class MyBenchmark {
    private int n = 5;

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(MyBenchmark.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(5)
                .forks(1)
                .jvmArgs("-Xmx16m")
                .build();

        new Runner(opt).run();
    }

    @Benchmark
    public int kotlinDynamicMethod0_0() {
        return KotlinRunnerDynamic.method0_0Proxy();
    }

    @Benchmark
    public int kotlinDynamicMethod3_3() {
        return KotlinRunnerDynamic.method3_3Proxy(n);
    }

    @Benchmark
    public int kotlinDynamicMethod5_1_default3Proxy() {
        return KotlinRunnerDynamic.method5_1_default3Proxy(n);
    }

    @Benchmark
    public int kotlinDynamicMethod5Proxy() {
        return KotlinRunnerDynamic.method5_5Proxy(n);
    }

    @Benchmark
    public int kotlinDynamicMethod5_10() {
        return KotlinRunnerDynamic.method5_10Proxy(n);
    }


    @Benchmark
    public int KotlinDynamicMethod5_15() {
        return KotlinRunnerDynamic.method5_15Proxy(n);
    }

    @Benchmark
    public int KotlinDynamicMethod5_20() {
        return KotlinRunnerDynamic.method5_20Proxy(n);
    }

    @Benchmark
    public int KotlinDynamicMethod7_10() {
        return KotlinRunnerDynamic.method7_10Proxy(n);
    }

    @Benchmark
    public int KotlinDynamicMethod10_10() {
        return KotlinRunnerDynamic.method10_10Proxy(n);
    }

    @Benchmark
    public int KotlinDynamicMethod13_10() {
        return KotlinRunnerDynamic.method13_10Proxy(n);
    }

    @Benchmark
    public int KotlinStaticMethod0_0() {
        return KotlinRunnerStatic.method0_0Proxy();
    }

    @Benchmark
    public int KotlinStaticMethod3_3() {
        return KotlinRunnerStatic.method3_3Proxy(n);
    }

    @Benchmark
    public int KotlinStaticMethod5_1_default3Proxy() {
        return KotlinRunnerStatic.method5_1_default3Proxy(n);
    }

    @Benchmark
    public int KotlinStaticMethod5Proxy() {
        return KotlinRunnerStatic.method5_5Proxy(n);
    }

    @Benchmark
    public int KotlinStaticMethod5_10() {
        return KotlinRunnerStatic.method5_10Proxy(n);
    }

    @Benchmark
    public int KotlinStaticMethod5_15() {
        return KotlinRunnerStatic.method5_15Proxy(n);
    }

    @Benchmark
    public int KotlinStaticMethod5_20() {
        return KotlinRunnerStatic.method5_20Proxy(n);
    }

    @Benchmark
    public int KotlinStaticMethod7_10() {
        return KotlinRunnerStatic.method7_10Proxy(n);
    }

    @Benchmark
    public int KotlinStaticMethod10_10() {
        return KotlinRunnerStatic.method10_10Proxy(n);
    }

    @Benchmark
    public int KotlinStaticMethod13_10() {
        return KotlinRunnerStatic.method13_10Proxy(n);
    }


    @Benchmark
    public int GroovyStaticMethod0_0() {
        return GroovyRunnerStatic.method0_0Proxy();
    }

    @Benchmark
    public int GroovyStaticMethod3_3() {
        return GroovyRunnerStatic.method3_3Proxy(n);
    }

    @Benchmark
    public int GroovyStaticMethod5_1_default3Proxy() {
        return GroovyRunnerStatic.method5_1_default3Proxy(n);
    }

    @Benchmark
    public int GroovyStaticMethod5Proxy() {
        return GroovyRunnerStatic.method5_5Proxy(n);
    }

    @Benchmark
    public int GroovyStaticMethod5_10() {
        return GroovyRunnerStatic.method5_10Proxy(n);
    }

    @Benchmark
    public int GroovyDynamicMethod0_0() {
        return GroovyRunnerDynamic.method0_0Proxy();
    }

    @Benchmark
    public int GroovyDynamicMethod3_3() {
        return GroovyRunnerDynamic.method3_3Proxy(n);
    }

    @Benchmark
    public int GroovyDynamicMethod5_1_default3Proxy() {
        return GroovyRunnerDynamic.method5_1_default3Proxy(n);
    }

    @Benchmark
    public int GroovyDynamicMethod5Proxy() {
        return GroovyRunnerDynamic.method5_5Proxy(n);
    }

    @Benchmark
    public int GroovyDynamicMethod5_10() {
        return GroovyRunnerDynamic.method5_10Proxy(n);
    }

    @Benchmark
    public int GroovyDynamicMethod5_15() {
        return GroovyRunnerDynamic.method5_15Proxy(n);
    }

    @Benchmark
    public int GroovyDynamicMethod5_20() {
        return GroovyRunnerDynamic.method5_20Proxy(n);
    }

    @Benchmark
    public int GroovyDynamicMethod7_10() {
        return GroovyRunnerDynamic.method7_10Proxy(n);
    }

    @Benchmark
    public int GroovyDynamicMethod10_10() {
        return GroovyRunnerDynamic.method10_10Proxy(n);
    }

    @Benchmark
    public int GroovyDynamicMethod13_10() {
        return GroovyRunnerDynamic.method13_10Proxy(n);
    }


    @Benchmark
    public int GroovyInvokeDynamicMethod0_0() {
        return GroovyRunnerInvokeDynamic.method0_0Proxy();
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod3_3() {
        return GroovyRunnerInvokeDynamic.method3_3Proxy(n);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod5_1_default3Proxy() {
        return GroovyRunnerInvokeDynamic.method5_1_default3Proxy(n);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod5Proxy() {
        return GroovyRunnerInvokeDynamic.method5_5Proxy(n);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod5_10() {
        return GroovyRunnerInvokeDynamic.method5_10Proxy(n);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod5_15() {
        return GroovyRunnerInvokeDynamic.method5_15Proxy(n);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod5_20() {
        return GroovyRunnerInvokeDynamic.method5_20Proxy(n);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod7_10() {
        return GroovyRunnerInvokeDynamic.method7_10Proxy(n);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod10_10() {
        return GroovyRunnerInvokeDynamic.method10_10Proxy(n);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod13_10() {
        return GroovyRunnerInvokeDynamic.method13_10Proxy(n);
    }

}
