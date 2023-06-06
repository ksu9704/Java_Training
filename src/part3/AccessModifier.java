package part3;

import model.DTO.MemberDOT;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDOT memberDOT = new MemberDOT();
        memberDOT.name = "공상욱";
        memberDOT.phone = "010-4228-9999";
        System.out.println(memberDOT.name + "\t" + memberDOT.phone + "\t");
        memberDOT.payly();
    }
}
