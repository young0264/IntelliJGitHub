package javalang;

public class Member {
    public String id;

    public Member(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member member = (Member) obj;
            if(id.equals(member.id)){
                return true; //id가같다면 true반납
            }
        }
        return false;
    }
}
