package demo;

import po.Friend;
import po.User;

/**
 * 描述:
 * test
 *
 * @author lujing.wang
 * @create 2019-12-06 4:58 PM
 */
public class CopyDemo {

    /**
     * 理解下浅拷贝概念
     * 值类型变量 拷贝值，引用类型变量，拷贝引用。
     * 拷贝的时候，String ，Integer等包装类是不可变对象，修改不可变对象的值，创建新的对象存放新的值，将原引用指向新的引用，
     * @param args
     */
    public static void main(String[] args) {
        User user1 = new User();
        user1.setAge(10);
        user1.setName("王路静");
        Friend friend = new Friend();
        friend.setRelation("好朋友");
        user1.setFriend(friend);
        User user2 = (User) user1.clone();
        user2.setName("王路静2");
        user2.setFriendRelation("好朋友2");
        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}