package classHomework.oop_homework;

class Customer {

    private String name;
    private boolean member = false;
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;

        if (!this.member) {
            this.memberType = "Regular";
        }
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String type) {
        this.memberType = type;

        if ("Regular".equalsIgnoreCase(this.memberType)) {
            this.member = false;
        }
    }

    public String toString() {
        return "Customer(" + name + ", " + member + ", " + memberType + ")";
    }
}