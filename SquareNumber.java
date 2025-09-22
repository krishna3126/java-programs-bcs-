 class squarenumber {
    public static void main(String[] args) {
        if (args.length > 0) {
            int num = Integer.parseInt(args[0]);  // Convert string to integer
            int square = num * num;
            System.out.println("Square of " + num + " is: " + square);
        } else {
            System.out.println("Please provide a number as command line argument.");
        }
    }
}