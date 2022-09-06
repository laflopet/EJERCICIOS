public class ejercicioSwitch {
    public static void main(String[] args) {
        int estacion = 7;

        switch (estacion){
            case 1:
                System.out.println("La estacion es primavera");
                break;
            case 2:
                System.out.println("La estacion es verano");
                break;
            case 3:
                System.out.println("La estacion es otoño");
                break;
            case 4:
                System.out.println("La estacion es invierno");
                break;
            default:
                System.out.println("La estacion esta fuera del rango");
        }
    }
}
