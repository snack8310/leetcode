package com.snack.leetcode.n278;

public class VersionControl {
    int version;

    public VersionControl(int version) {
        this.version = version;
    }

    boolean isBadVersion(int version) {
        if (version >= this.version) {
            return true;
        }
        return false;
    }
}
