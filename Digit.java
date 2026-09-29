 class Digit {
    public static void main(String[] args) {
        int num = 121;
        int count = 0;
        if(num == 0){
            System.out.println(1);
            return;
        }
        while(num !=0){
            num = num/10;
            count++;
        }
        System.out.println(count);
    }
}
