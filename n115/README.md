## 查找重复字串

比较重要的思想是，如果abcba结尾重复cba，就要递归查询，abcba里面abcb里面查询cba的次数+abcb里查询cb的次数，递归合计