package com.snack.leetcode.n341;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class NestedIterator implements Iterator<Integer> {

    private Stack<NestedInteger> stack;

    public NestedIterator(List<NestedInteger> nestedIntegerList) {
        stack = new Stack();
        for (int i = nestedIntegerList.size() - 1; i >= 0; i--) {
            stack.push(nestedIntegerList.get(i));
        }

    }

    @Override
    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }
        NestedInteger nestedInteger = stack.peek();
        if (nestedInteger.isInteger()) {
            return true;
        }
        List<NestedInteger> nestedIntegers = nestedInteger.getList();
        stack.pop();
        for (int i = nestedIntegers.size() - 1; i >= 0; i--) {
            stack.push(nestedIntegers.get(i));
        }
        return hasNext();
    }

    @Override
    public Integer next() {
        return stack.pop().getInteger();
    }
}
