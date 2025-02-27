class A {

    public void run() {

        System.out.println("I am running");

    }

}

class Outer {

    static A obj = new A() {
    };

    public static void main(String[] args) {

        obj.run();

    }

}
