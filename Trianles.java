public class Trianles {
    static void LeftTriangle(int n) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void rightTriangle(int n) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void mirrorLeftTriangle(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void mirrorRightTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void dimendPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void boxPattern(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) {

                    System.out.print("&");
                }

            }
            System.out.println();
        }
    }

    static void pascalTriangle(int n) {
        int[][] pascal = new int[n][];

        for (int i = 0; i < pascal.length; i++) {
            pascal[i] = new int[i];
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < pascal[i].length; j++) {
                pascal[i][j] = 1;
            }
        }

        int pascalcal = 0;

        for (int i = 2; i < pascal.length; i++) {
            while (pascalcal <= pascal[i].length - 1) {
                if (pascalcal == 0 || pascalcal == pascal[i].length - 1) {
                    pascal[i][pascalcal] = 1;
                } else {
                    pascal[i][pascalcal] = pascal[i - 1][pascalcal - 1] + pascal[i - 1][pascalcal];
                }
                pascalcal += 1;
            }
            pascalcal = 0;
        }

        for (int i = 0; i < pascal.length; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < pascal[i].length; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void butterFly(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (n - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i <= 2 || i == n) {
                    System.out.print("*");
                }
                if (i > 2 && i < n) {
                    if (j == 1 || j == i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("LeftTriangle");
        LeftTriangle(5);
        System.out.println();

        System.out.println("rightTriangle");
        rightTriangle(5);
        System.out.println();

        System.out.println("mirrorLeftTriangle");
        mirrorLeftTriangle(5);
        System.out.println();

        System.out.println("mirrorRightTriangle");
        mirrorRightTriangle(5);
        System.out.println();

        System.out.println("dimendPattern");
        dimendPattern(5);
        System.out.println();

        System.out.println("boxPattern");
        boxPattern(5);
        System.out.println();

        System.out.println("pascalTriangle");
        pascalTriangle(5);
        System.out.println();

        System.out.println("rombus");
        rombus(5);
        System.out.println();

        System.out.println("butterFly");
        butterFly(5);
        System.out.println();

        System.out.println("hollowTriangle");
        hollowTriangle(8);
        System.out.println();

    }
}
