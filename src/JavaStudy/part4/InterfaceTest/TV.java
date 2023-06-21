package JavaStudy.part4.InterfaceTest;

public class TV implements RemoCon{
    // chUp(), chDown(), volUp(), volDown()

    @Override
    public void chUp() {
        System.out.println("TV 채널이 올라간다");
    }

    @Override
    public void chDown() {
        System.out.println("TV 채널이 내려간다");
    }

    @Override
    public void volUp() {
        System.out.println("TV 소리가 올라간다");
    }

    @Override
    public void volDown() {
        System.out.println("TV 소리가 내려간다");
    }

    @Override
    public void internet() {
        System.out.println("TV는 인터넷 지원 가능");
    }

}
