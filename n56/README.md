## 合并区间
排序思路，按照左节点排序，按照右节点倒序（减少一点点更新）
然后判断下一个左节点，跟当前右节点比较，如果小，比较右节点，如果大，就更新一个值。