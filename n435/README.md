## 无重叠区间
使用贪心算法，按照右侧（重合的部分）排序，如果下面跟右侧重合，就要移除，找到下一个。
时间复杂度O(nlogn)，空间复杂度O(logn)排序