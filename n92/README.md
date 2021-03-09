## 递归思想
1. 第一个节点，对后面节点的递归，把后面的节点看成整体a，head.next = a, 修改的方案是a.next = head, head.next = null;
递归a
2. 前n个节点翻转，就是到递归最底层的节点的next = n+1的节点为止，head.next = a, a.next = a+1.next;修改为，a.next = head, head.next = a+1.next;递归a
3. m到n的节点翻转，一直走到m-1节点，开始前n各节点翻转。

## 递归想法
一定要作为整体看要递归的内容，否则很难想清楚