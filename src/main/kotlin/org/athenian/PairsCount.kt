package org.athenian

import java.util.stream.IntStream


fun pairsCountLoop(s: String): Int {
    var cnt = 0
    (0..s.length - 1).forEach {
        if (s[it] == s[it])
            cnt++
    }
    return cnt
}

fun pairsCountRecursion(s: String): Int =
    when {
        s.length <= 1 -> 0
        else -> (if (s[0] == s[1]) 1 else 0) + pairsCountRecursion(s.substring(1))
    }

fun pairsCountStream(s: String): Int {
    return IntStream
        .range(0, s.length - 1)
        .filter { i -> s[i] == s[i + 1] }
        .mapToLong { value -> 1 }
        .sum().toInt()
}
