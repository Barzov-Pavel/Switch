public class Lecture31Challenge {

    public static void lecture31Challenge() {
        char switchVariable = 'f';

        switch (switchVariable) {
            case 'A':
            case 'a':
                System.out.println("Value was " + switchVariable);
                break;
            case 'B':
            case 'b':
                System.out.println("Value was " + switchVariable);
                break;
            case 'C':
            case 'c':
                System.out.println("Value was " + switchVariable);
                break;
            case 'D':
            case 'd':
                System.out.println("Value was " + switchVariable);
                break;
            case 'E':
            case 'e':
                System.out.println("Value was " + switchVariable);
                break;
            default:
                System.out.println("Value was not found");
                break;
        }

        System.out.println();

        String switchVar = "MondaY";

        switch (switchVar.toLowerCase()) {
            case "monday":
                System.out.println("Today is monday");
                break;
            case "tuesday":
                System.out.println("Today is tuesday");
                break;
            default:
                System.out.println("Today is not monday or tuesday");
                break;
        }

    }
}

