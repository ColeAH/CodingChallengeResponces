//https://www.hackerrank.com/challenges/java-static-initializer-block/problem

//Write your code here
static boolean flag = false;
static int B,H;

static {
    Scanner scanner = new Scanner(System.in);
    B = scanner.nextInt();
    H = scanner.nextInt();
    if (B <= 0 || H <= 0) {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        System.exit(0);
    }
    scanner.close();
    flag = true;
}

