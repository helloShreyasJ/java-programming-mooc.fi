public class example {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        Person joan = new Person("joan ball");
        System.out.println(joan);
        Person ball = joan;
        ball.growOlder();
        ball.growOlder();
        System.out.println(joan);
        joan = new Person("Joan B");
        System.out.println(joan);

        Person moan = null;
        moan.growOlder();
        System.out.println(moan);
    }
}
