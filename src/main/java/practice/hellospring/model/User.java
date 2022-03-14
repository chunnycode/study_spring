package practice.hellospring.model;

public class User {
    private int userNo;
    private String userName;

    public User(){

    }

    public User(int userNo, String userName){
        this.userNo = userNo;
        this.userName = userName;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
