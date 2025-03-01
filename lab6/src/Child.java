public class Child extends Parent{
    private String nickname;
    String university;

    public Child() {
        super();
        this.nickname = "_";
        this.university = "_";
    }
    public Child(String securityId , String name , String city , String nickname , String university) {
        super(securityId,name,city);
        this.nickname = nickname;
        this.university = university;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getUniversity() {
        return this.university;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public void showPersonalInfo() {
        super.showPersonalInfo();
        System.out.println("Print from Child >> ...");
        System.out.println("\t nickname: " + this.nickname);
        System.out.println("\t university: " + this.university);
    }
}
