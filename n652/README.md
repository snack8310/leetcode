## 重复的子树
使用递归，先序排序，所有从根节点的先序队列写入map，比较重复数据。
官方答案，有个很巧妙的使用，
 preoderMap.put(rtn, preoderMap.getOrDefault(rtn, 0) + 1);
 当且仅当值==2，才做插入，有效避免了多次插入的问题。
我原本用了新空间去重