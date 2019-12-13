package po;

/**
 * @Author lujing.wang
 * @Description ${DESCRIPTION}
 * @Date 2019/12/7
 * @Param
 * @return
 */
public class User implements Cloneable {

    private String name;
    private Integer age;

    private Friend friend;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public void setFriendRelation(String rel) {
        this.friend.setRelation(rel);
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "姓名： "+ this.getName() + "；年龄："+ this.getAge() + "；朋友关系：" + this.getFriend().getRelation();
    }

}