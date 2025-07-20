/** Program to Create a CallExample Class and Call methodTwo() from methodOne() Using this Keyword
    @K Vivek  IMCA -13 **/
class Call {
    void method1() {
        System.out.println("Inside method1");
        this.method2();
    }

    void method2() {
        System.out.println("Inside method2");
    }

    public static void main(String[] args) {
        System.out.println("Program to Create a CallExample Class and Call methodTwo() from methodOne() Using this Keyword\nK Vivek  IMCA -13");
        Call ce = new Call();
        ce.method1();
    }
}
