## 解码异或后的排列
以下为数学特性。
既然我们知道了perm = [A, B, C, D, E]，那么encoded = [AB, BC, CD, DE]；
根据perm，我们可以得到ABCDE,根据encoded的BC和DE，我们可以得到BCDE；
将ABCDE和BCDE进行异或运算，得到A，即perm的第一个元素。这时候，今天的题目转换成上面的第一题。

重要的是步长2的迭代， 可以遍历全部原始案件。
