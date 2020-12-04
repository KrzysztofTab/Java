class UpAndDown {
    public static void main(String[] args) {
        int num = 3;

        // postfiksow - najpierw wyświetla, później zwiększa
        System.out.println(num++);
        System.out.println(num);

        // prefiksowa - najpierw zwiększa, później wyświetla
        System.out.println(++num);
        System.out.println(num);

        // Inkrementacja x++
        // Dekrementacja x--
    }
}