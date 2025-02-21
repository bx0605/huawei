package com.huaiwei.e.easy;

public class 二进制求和 {
    public String addBinary(String a, String b) {

        int carry = 0;
        int aa = a.length() - 1;
        int bb = b.length() - 1;
        StringBuilder str = new StringBuilder();
        int n = Math.max(a.length(), b.length());
        for (int i = n - 1; i >= 0; i--) {
            int sum = carry;
            sum += aa >= 0 ? a.charAt(aa) - '0' : 0;
            sum += bb >= 0 ? b.charAt(bb) - '0' : 0;

            str.append(sum % 2);
            carry = sum / 2;
            aa--;
            bb--;
        }
        if (carry == 1) {
            str.append(1);
        }
        return str.reverse().toString();
    }
}
