package JavaStudy.part4.EmployeeEX;


// 일반 사원
public class RempVO extends Employee {
    public RempVO(){
        super();
    }

    public RempVO(String name, int age, String phone, String empDate, String dept, boolean marriage){
        // 초기화(자식이 부모의 기억공간에 쵝화 하는 경우)
        super(name,age,phone,empDate,dept,marriage);
//        this.name = name;
//        this.age = age;
//        this.phone = phone;
//        this.empDate = empDate;
//        this.dept = dept;
//        this.marriage =marriage;
    }
}
