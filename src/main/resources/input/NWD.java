package agh.edu.pl;

public class NWD {

    public static int najwiekszyWspolnyDzielnik(int x, int y) {
        if (y == 0) return x;
        return najwiekszyWspolnyDzielnik(y, x % y);
    }

    public static void main(String[] args) {
        System.out.println(program.Program.najwiekszyWspolnyDzielnik(45, 60));
        System.out.println(program.Program.najwiekszyWspolnyDzielnik(5, 25));
        System.out.println(program.Program.najwiekszyWspolnyDzielnik(13, 17));
    }

}
