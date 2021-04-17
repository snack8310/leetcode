## 存在重复元素 III
核心是滑动窗口，放一个数组，添加nums[i],移除nums[i-k].
中间使用treeset的比较方法ceiling，比较是否有小于t的值