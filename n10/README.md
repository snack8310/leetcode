## 正则表达式匹配
这个动态规划的状态转移方程过于复杂，没有想清楚。
定义dp[i][j]为s的前i和p的前j个字符是否匹配的状态。dp[m][n]为能否匹配的状态结果。
转移方程要参照p[j-1]是否为*有不同对待。p[j-1]不等于*比较简单。字符匹配即可。
p[j-1]==*，需要考虑需要考虑当前位置和上一个位置的比较

时间复杂度O(mn) 一般这种二维数组的状态转移方程时间复杂度为O(mn)全部要迭代一遍。
空间复杂度为O(1)