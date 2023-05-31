package part2.ArrayTest;

public class ArrayMakeTest {
    public static void main(String[] args) {
        // Q. 정수 5개를 저장 할 [배열을 생성]하시요

        int [] a = new int[5];
        a[0] = 10;
        a[1] = 10;
        a[2] = 10;
        a[3] = 10;
        a[4] = 10;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);

        System.out.println("\n"
                + "위 형식으로 하면 장점이 없다." + "\n"
                + "그러므로 반복문을 사용하자." + "\n");

        System.out.println("\n" +"------------------------------" + "\n");

        System.out.println("반복문(for, while)" + "\n");


        for (int i=0; i<a.length; i++){
            a [i] = 10;
            System.out.println(a[i]);
        }


        // Q. [책] 3권을 저장 할  [배열을 생성]히고 책 3권의 데이터를 저장하고 출력하시요.

        Book_[] books = new Book_[3];  // 책 3권을 저장하 배열을 생성
        books[0] = new Book_();
        books[0].title = "java";
        books[0].price = 30000;
        books[0].company = "한빛";
        books[0].author = "공상욱";
        books[0].page = 500;
        books[0].isbn = "11889900";

        System.out.print(books[0].title + books[0].price + books[0].company + books[0].author + books[0].page + books[0].isbn + "\n");


        books[1] = new Book_();
        books[1].title = "Java";
        books[1].price = 45000;
        books[1].company = "한빛";
        books[1].author = "공배";
        books[1].page = 400;
        books[1].isbn = "11338800";

        System.out.print(books[1].title + books[1].price + books[1].company + books[1].author + books[1].page + books[1].isbn + "\n");


        books[2] = new Book_();
        books[2].title = "JAVA";
        books[2].price = 60000;
        books[2].company = "한빛";
        books[2].author = "공열";
        books[2].page = 5000;
        books[2].isbn = "11667700";

        System.out.print(books[2].title + books[2].price + books[2].company + books[2].author + books[2].page + books[2].isbn + "\n" + "\n");

        for (int i = 0; i<books.length; i++){
            System.out.print(books[i].title + books[i].price + books[i].company + books[i].author + books[i].page + books[i].isbn + "\n");

        }
    }
}
