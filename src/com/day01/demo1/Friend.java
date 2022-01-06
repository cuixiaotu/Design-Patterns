package com.day01.demo1;

import java.util.Arrays;

/**
 * 在社交媒体网站上有 n 个用户。给你一个整数数组 ages ，其中 ages[i] 是第 i 个用户的年龄。
 *
 * 如果下述任意一个条件为真，那么用户 x 将不会向用户 y（x != y）发送好友请求：
 *
 * age[y] <= 0.5 * age[x] + 7
 * age[y] > age[x]
 * age[y] > 100 && age[x] < 100
 * 否则，x 将会向 y 发送一条好友请求。
 *
 * 注意，如果 x 向 y 发送一条好友请求，y 不必也向 x 发送一条好友请求。另外，用户不会向自己发送好友请求。
 *
 * 返回在该社交媒体网站上产生的好友请求总数。
 *
 * 分析：条件一  age[y] > 14
 *      条件二是的条件三充分不必须条件   满足三 不一定满足二
 *
 *
* */

public class Friend {

    public static void main(String[] args) {
        int[] ages = {16,17,18};
        //ages = [16,17,18]

        // [20,30,100,110,120]
        int nums =  solution(ages);
        System.out.println(nums);

    }


    public static int solution(int[] ages){
        int n = ages.length;
        Arrays.sort(ages);

        int left =0,right=0,ans=0;
        for (int age : ages){
            if (age<15){
                continue;
            }

            while (ages[left]<= 0.5 * age + 7) {
                left++;
            }

            while (right+1 <n && ages[right+1] <=age)
                right++;

            ans += right - left;
        }


        return  ans;
    }

}
