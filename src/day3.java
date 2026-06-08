void main() {
    /*
    int n=5;
    for(int row=1;row<=n;row++){
        for(int column=1;column<=n;column++){
            if (row == 1 &&  column == 1 ||row==1&&column==2||row==1&&column==3||row==1&&column==4||row==2&&column==1||row==2&&column==2||row==2&&column==3||row==3&&column==1||row==3&&column==2||row==4&&column==1) {
                System.out.print("  ");continue;
            }
            System.out.print("* ");
        }
        System.out.println();
    }
    */

    int[] arr = {87, 32, 44, 89, 32};
    System.out.println(arr[0]);
    System.out.print("Pass mark:");
    for (int i = 0; i <= 4; i++) {
        int val = arr[i];
        if (val >= 40) {
            System.out.print(val+",");
        }
    }
    System.out.print("\nFail mark:");
    for (int i = 0; i <= 4; i++) {
        int val = arr[i];
        if (val < 40) {
            System.out.print(val+",");
        }
    }
}

