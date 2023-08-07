package testextrasg1;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class ExtrasG1 {

//    1. Crear un método que dado un tiempo en minutos leído desde teclado, calcular su equivalente en
//días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
//equivalente: 1 día, 2 horas.
    public static void diasYhoras() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de minutos que quiera calcular");
        int min = leer.nextInt();
        int dias = min / 1440;
        int horas = (min % 1440) / 60;

        System.out.printf("%d Minutos equivalen a %d Dias y %d Horas", min, dias, horas);

    }

//    2. Crear un método dentro del cual tendrá cuatro variables de tipo entero A, B, C y D y asignarle
//un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que: B
//tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar
//los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
    public static void abcd() {

        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        int aux = B;

        System.out.println("El valor inicial de A es: " + A);
        System.out.println("El valor inicial de B es: " + B);
        System.out.println("El valor inicial de C es: " + C);
        System.out.println("El valor inicial de D es: " + D);

        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("El valor de A es: " + A);
        System.out.println("El valor de B es: " + B);
        System.out.println("El valor de C es: " + C);
        System.out.println("El valor de D es: " + D);

    }

//    3. Elaborar un método en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso
//contrario mostrar un mensaje.
    public static void letra() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        char let = leer.next().charAt(0);
        let = Character.toLowerCase(let);

        if (let == 'a' || let == 'e' || let == 'i' || let == 'o' || let == 'u') {

        } else {
            System.out.println("Letra incorrecta.");
        }

    }

//    4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente
//en romano.
    public static void gerardoromano() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número entre 1 y 10");
        int num = leer.nextInt();

        switch (num) {

            case 1:

                System.out.println("I");
                break;

            case 2:

                System.out.println("II");
                break;

            case 3:

                System.out.println("III");
                break;
            case 4:

                System.out.println("IV");
                break;
            case 5:

                System.out.println("V");
                break;
            case 6:

                System.out.println("VI");
                break;
            case 7:

                System.out.println("VII");
                break;
            case 8:

                System.out.println("VIII");
                break;
            case 9:

                System.out.println("IX");
                break;
            case 10:

                System.out.println("X");
                break;
            default:
                System.out.println("Mal");
                break;

        }

    }

//    5. Una obra social tiene tres clases de socios:
// Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos
//los tipos de tratamientos.
// Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los
//mismos tratamientos que los socios del tipo A.
// Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
//tratamientos.
//Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente
//el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho
//socio. Crear un método con el algoritmo para dar solución a lo propuesto.
    public static void chorros() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la clase de socio a la que pertenezca: ");

        String clase = leer.next();
//        char clase = leer.next().charAt(0);
//        clase = Character.toLowerCase(clase);

//        Este sout tiene que ir adentro del switch para que cuando ingresemos la clase no valida, justamente no podamos ingresar un costo de tratamiento.
//        System.out.println("Ingrese el costo del tratamiento: ");
//        double costo = leer.nextDouble();
        switch (clase) {

            case "A":
                System.out.println("Ingrese el costo del tratamiento: ");
                double costo = leer.nextDouble();
                double totalpagar = costo * 0.5;
                System.out.println("La clase A abona: " + totalpagar);
                break;

            case "B":
                System.out.println("Ingrese el costo del tratamiento: ");
                costo = leer.nextDouble();
                totalpagar = costo - (costo * 0.35);
                System.out.println("La clase B abona: " + totalpagar);
                break;

            case "C":
                System.out.println("Ingrese el costo del tratamiento: ");
                costo = leer.nextDouble();
                totalpagar = 0.0;
                System.out.println("La clase C abona: " + costo);
                break;

            default:
                System.out.println("La clase ingresada no es válida.");
                break;

        }
    }

//    6. Crear un método dentro del cual permita la entrada desde teclado de la altura de N personas y 
//determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de 
//estaturas en general.
    public static void enanos() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas a promediar");
        int per = leer.nextInt();

        double altura;
        double suma = 0, sum = 0;
        int cont = 0;

        for (int i = 1; i <= per; i++) {
            System.out.println("Ingrese la altura");
            altura = leer.nextDouble();
            suma = suma + altura;
            if (altura < 1.60) {
                sum = sum + altura;
                cont = cont + 1;
            }
        }
        System.out.println("Altura promedio de todas las personas ingresadas: " + (suma / per));
        System.out.println("Alturas promedio menor a 1.60 mts: " + (sum / cont));

    }

//    7. Realice un método que calcule y visualice el valor máximo, el valor mínimo y el promedio de 
//n números (n>0). El valor de n se solicitará al principio del programa y los números serán 
//introducidos por el usuario. Realice dos versiones del método, una usando el bucle “while” y otra 
//con el bucle “do - while”.
    public static void valminmaxprom() {

        System.out.println("Valores maximo, minimo y promedio");

        Scanner leer = new Scanner(System.in);

        System.out.println("¿Cuantos números va a ingresar?");
        int limite = leer.nextInt();

        int aux = 1;
        int num, suma = 0;
        int max = 0, min = 0;

        System.out.println("Ingrese el número");
        num = leer.nextInt();
        suma = suma + num;
        min = num;
        if (max < num) {
            max = num;
        }
        if (min > num) {
            min = num;
        }
        aux++;

        while (limite > 0 && aux < (limite + 1)) {
            System.out.println("Ingrese el número");
            num = leer.nextInt();
            suma = suma + num;

            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
            aux++;
        }
        System.out.println("El promedio es: " + (suma / limite));
        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);

    }

    public static void valminmaxpromv2() {
        Scanner leer = new Scanner(System.in);

        System.out.println("¿Cuantos números va a ingresar?");
        int limite = leer.nextInt();

        int aux = 1;
        int num;
        double suma = 0;
        int max = 0, min;
        double promedio;

        System.out.println("Ingrese el número");
        num = leer.nextInt();
        suma = suma + num;
        min = num;
        max = num;

        if (max < num) {
            max = num;
        }
        if (min > num) {
            min = num;
        }
        aux++;

        do {
            System.out.println("Ingrese el número");
            num = leer.nextInt();
            suma = suma + num;

            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
            aux++;

        } while (aux <= limite);

        promedio = suma / limite;
        System.out.println("El promedio es " + promedio);
        System.out.println("El número mayor es: " + max);
        System.out.println("El número menor es: " + min);

    }

//    8. Escriba un método que lea números enteros. Si el número es múltiplo de cinco debe detener la 
//lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de 
//números impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
//Nota: recordar el uso de la sentencia break.
    public static void parMulti() {
        Scanner leer = new Scanner(System.in);
        int num;

        int contPar = 0, contImpar = 0, acum = 0;

        do {
            System.out.println("Ingrese el número");
            num = leer.nextInt();
            if (num < 0) {
                continue;
            }
            if (num % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            //acum=acum+num; 
            acum++;
        } while (num % 5 != 0);

        System.out.println("La cantidad de números ingresados son: " + acum);
        System.out.println("La cantidad de números Par son: " + contPar);
        System.out.println("La cantidad de números Impar son: " + contImpar);

    }

//      9. Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
//realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el 
//dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, 
//y el número de restas realizadas es el cociente. Por ejemplo: 50 / 13: 
//50 – 13 = 37 una resta realizada 
//37 – 13 = 24 dos restas realizadas 
//24 – 13 = 11 tres restas realizadas 
//Crear un método con el algoritmo necesario para dar solución a lo propuesto.
    public static void divisionResta() {//ESTA COMPLETO

//        Scanner leer = new Scanner(System.in);
//        System.out.println("");
//        System.out.println("------- DIVISION UTILIZANDO RESTA -------");
//        System.out.println("Ingrese divisor ");
//        int divisor = leer.nextInt();
//        System.out.println("Ingrese dividendo ");
//        int dividendo = leer.nextInt();
//        int cont = 1;
//        int resultado = divisor - dividendo;
//        while (resultado >= dividendo) {
//            resultado = resultado - dividendo;
//            cont++;
//        }
//        System.out.println("el cociente es " + cont);
//        System.out.println("el resto es " + resultado);
        Scanner leer = new Scanner(System.in);
        int divisor, dividendo;
        System.out.println("Ingrese el divisor (numero entero)");
        divisor = leer.nextInt();
        System.out.println("Ingrese el dividendo (numero entero)");
        dividendo = leer.nextInt();
        int i = 0, resultado = dividendo;
        while (resultado >= divisor) {
            i++;
            System.out.println(resultado + " - " + divisor + " = " + (resultado - divisor) + " " + i + " restas realizadas ");
            resultado = resultado - divisor;
        }
        System.out.println("El residuo de la division es: " + resultado);
        System.out.println("El cociente de la division es: " + i);

    }

//    10. Realice un método para que el usuario adivine el resultado de una multiplicación entre dos 
//números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta 
//es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su 
//respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función 
//Math.random() de Java.
    public static void adivinadorderesultado() {
        Scanner leer = new Scanner(System.in);
        int resultado;
        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);
        int multiplicacion = num1 * num2;
        //System.out.println(multiplicacion);
        System.out.println("Adivine el resultado de la multiplicacion: ");
        do {
            resultado = leer.nextInt();
            if (resultado == multiplicacion) {
                System.out.println("ADIVINASTE!");
                break;
            } else {
                System.out.println("Sigue intentando.");
            }
        } while (resultado != multiplicacion);
    }

//    11. Escribir un método que lea un número entero y devuelva el número de dígitos que componen 
//ese número. Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
//Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. Nota: recordar 
//que las variables de tipo entero truncan los números o resultados.
    public static void devolverdigitos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num = leer.nextInt();
        int i = 0;
        do {
            num = num / 10;
            i++;
        } while (num != 0);
        System.out.println("El numero ingresado tiene : " + i + " digitos.");
    }

//    12. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 
//al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
//    0-0-0
//    0-0-1
//    0-0-2
//    0-0-E
//    0-0-4
//    0-1-2
//    0-1-E
//Crear un método que dé solución a lo propuesto en el enunciado. 
    public static void contador3E() {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if (i == 3) {
                        System.out.print("E " + " - ");
                    } else {
                        System.out.print(i + " - ");
                    }
                    if (j == 3) {
                        System.out.print("E " + " - ");
                    } else {
                        System.out.print(j + " - ");
                    }
                    if (k == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(k);
                    }
                    System.out.println();
                }

            }

        }

    }

//    13. Crear un método que dibuje una escalera de números, donde cada línea de números comience 
//en uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar. 
//Ejemplo: si se ingresa el número 3: 
//1
//12
//123
    public static void escaleradenums() {
        Scanner leer = new Scanner(System.in);
        int altura;
        System.out.println("Ingrese la altura de la escalera");
        altura = leer.nextInt();
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
