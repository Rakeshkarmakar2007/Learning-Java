class ThreadLearning{
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        a.start();
        b.start();
    }
}