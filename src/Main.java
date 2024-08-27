public class Main {
    public static void main(String[] args) {
        student st1;
        student st2;

        st1 = new student(3248,"Yahya","KHI");
        st1.study();
        st1.ShowFullDetail();

        System.out.println("");

        st2 = new student(3927,"Tayyaba", "KHI");
        st2.study();
        st2.ShowFullDetail();

    }
}