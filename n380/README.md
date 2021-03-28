## O(1)时间的操作
arraylist底层实现是动态数组，长度不固定，会存在扩容的行为，类似hashmap，
存储和删除的时候，数据堆中的远足，都要根据插入或删除元素的位置，向后或向前移动，最差时间是O(n)

LinkedList，在插入删除的时候不会涉及位置改动，时间是O(1)