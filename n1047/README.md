## 栈的应用
1. 暴力循环，明显性能超标，最差O(2^n)
2. 使用Stringbuffer模拟栈，官方好像这个方案
3. 直接使用栈，再次转换成字符串，性能忽略不计O(n)