## 寻找是否是循环指引 n141的扩展
思路是使用快慢指针，如果是循环，一定会有快指针追上慢指针的场合。
我理解循环引用也可以考虑相同的算法。

考核的主要是一个数学公式：
a+(n+1)b+nc=2(a+b)⟹a=c+(n−1)(b+c)