public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        if (Overdrive(23.0, 18.0)) {
        }

        System.out.println("Можно идти гулять");
        if (Overdrive(16.0, 20.0)) {
        }

        System.out.println("Можно идти гулять");
        if (Overdrive(55.0, 29.0)) {
        }

        System.out.println("Оставайтесь дома");
        if (Overdrive(12.0, -4.0)) {
        }

        System.out.println("Оставайтесь дома");
        if (Overdrive(34.0, 8.0)) {
        }

        System.out.println("Можно идти гулять");
        System.out.println(Overdrive(23.0, 18.0));
    }

    public static boolean Overdrive(double age, double temperature) {
        return true;
    }
}