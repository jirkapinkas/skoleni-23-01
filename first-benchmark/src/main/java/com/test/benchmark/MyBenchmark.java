/*
 * Copyright (c) 2014, Oracle America, Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  * Neither the name of Oracle nor the names of its contributors may be used
 *    to endorse or promote products derived from this software without
 *    specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.test.benchmark;

import org.openjdk.jmh.annotations.Benchmark;

import java.util.stream.IntStream;

public class MyBenchmark {

    // 6 315 ops / s
//    @Benchmark
//    public void testMethod() {
//        String result = "";
//        for (int i = 0; i < 1_000; i++) {
//            result += i;
//        }
//    }

    // 85 328 ops / s
//    @Benchmark
//    public void test2() {
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < 1_000; i++) {
//            stringBuilder.append(i);
//        }
//    }

    // 67 704 ops / s
//    @Benchmark
//    public void test2() {
//        StringBuffer stringBuilder = new StringBuffer();
//        for (int i = 0; i < 1_000; i++) {
//            stringBuilder.append(i);
//        }
//    }

//# Warmup Iteration   1: 3484.477 ops/s
//# Warmup Iteration   2: 7475.582 ops/s
//# Warmup Iteration   3: 4273.168 ops/s
//# Warmup Iteration   4: 3743.249 ops/s
//# Warmup Iteration   5: 3762.549 ops/s
//                # Warmup Iteration   1: 3 490 728.961 ops/s
//                # Warmup Iteration   2: 3707765.665 ops/s
    @Benchmark
    public void test1() {
        int sum = IntStream.range(0, 100)
                .sum();
    }

//# Warmup Iteration   1: 6281.721 ops/s
//# Warmup Iteration   2: 6957.900 ops/s
//# Warmup Iteration   3: 7019.427 ops/s
//# Warmup Iteration   4: 7144.437 ops/s
//# Warmup Iteration   5: 7173.738 ops/s
//            # Warmup Iteration   1: 32 316.960 ops/s
//            # Warmup Iteration   2: 31699.982 ops/s
//    @Benchmark
//    public void test2() {
//        int sum = IntStream.range(0, 100)
//                .parallel()
//                .sum();
//    }

//    private static final int MAX_SIZE = 2_000_000;
//
    // 641
//    @Benchmark
//    public int[] testPrimitiveIntegers() {
//        int[] ints = new int[MAX_SIZE];
//        for (int i=0; i < MAX_SIZE; i++) {
//            //boxing here -> object instantiation
//            ints[i] = i;
//        }
//        return ints;
//    }

    // 19
//    @Benchmark
//    public Integer[] testIntegerBoxing() {
//        Integer[] ints = new Integer[MAX_SIZE];
//        for (int i=0; i < MAX_SIZE; i++) {
//            //boxing here -> object instantiation
//            ints[i] = i;
//        }
//        return ints;
//    }

    // 168
//    @Benchmark
//    public int[] testIntegerInclUnboxing() {
//        int[] ints = new int[MAX_SIZE];
//        for (int i=0; i < MAX_SIZE; i++) {
//            //manual boxing here, after that automatic unboxing
//            ints[i] = Integer.valueOf(i);
//        }
//        return ints;
//    }


}
