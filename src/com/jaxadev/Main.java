package com.jaxadev;

public class Main {

    public static void main(String[] args) {

//        byte	1 byte	Stores whole numbers from -128 to 127
//        short	2 bytes	Stores whole numbers from -32,768 to 32,767
//        int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
//        long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
//        double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
//        boolean	1 bit	Stores true or false values
//        char	2 bytes	Stores a single character/letter or ASCII values

//        byte numberByte = 127;
//
//        short numberShort = 32767;
//
//        int numberInt = 2147483647;
//
//        long numberLong = 92233722;
//
//        float numberFloat = 454815.55F;
//
//        double numberDouble = 454865486.4545F;
//
//        boolean trueBoolean = true;
//
//        char symbolChar = 'h';

        //Arfimetik Operatorlar

//        int a = 10;
//
//        int b = 3;
//
//        int c = a % b;
//
//        System.out.println(c);

        //Tenglash Operatorlar

//        int a = 7;
//
//        a -= 10;
//
//        System.out.println(a);

        //Taqqoslash operatorlari

//        int a = 7;
//
//        int b = 45;
//
//        System.out.println(a != b);

        //Manitiqiy operatorlar

//        boolean a = true;
//
//        boolean b = false;
//
//        System.out.println(!a);

//        int a = 85;
//
//        int b = 60;
//
//        if(a < 15){
//            System.out.println("Tezroq zaprafkaga borish kerak");
//        }else if (a > 15 && a < 30){
//            System.out.println("Benzin hali bor ekan, zaprafkaga borish shart emas hozircha");
//        }else {
//            System.out.println("Zaprafkaga borish shart enas");
//        }

//        int time = 7;
//
//        if (time < 12 && time > 6){
//            System.out.println("Hayrli tong");
//        }else if (time < 18 && time > 12){
//            System.out.println("Hayrli kun");
//        }else {
//            System.out.println("Hayrli tun");
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Ismingizni kirting!");
//
//        String name = scanner.nextLine();
//
//        System.out.println("name = " + name);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("1 - sonni kirting: ");
//
//        int a = scanner.nextInt();
//
//        System.out.print("2 - sonni kirting: ");
//
//        int b = scanner.nextInt();
//
//        System.out.println("Sonlar ustida qaysi amalni bajarmoqchi ekanligingizni kiriting : ");
//
//        String amal = scanner.next();
//
//        switch (amal) {
//            case "+":
//                System.out.println("a + b = " + (a + b));
//                break;
//            case "-":
//                System.out.println("a - b = " + (a - b));
//                break;
//            case "*":
//                System.out.println("a * b = " + (a * b));
//                break;
//            case "/":
//                System.out.println("a / b = " + (a / b));
//                break;
//            default:
//                System.out.println("Siz noto'g'ri buyruqni kirtin yuborindingiz!");
//                break;
//        }

//        String[] androidDevelopers = {"Azamat", "Abdulaziz", "Jahongir", "Bobur", "Ali", "Sanjar", "Usmon", "Mirzakomil"};
//
//        int[] numbers = new int[5];
//
//        numbers[0] = 5;
//        numbers[1] = 5;
//        numbers[2] = 5;
//        numbers[3] = 5;
//        numbers[4] = 5;
//
//        System.out.println(androidDevelopers[0]);
//
//        androidDevelopers[0] = "Azamat aka Senior";
//
//        System.out.println(androidDevelopers[0]);


//        int a = 560;
//
//        while (a != 0) {
//            a = a / 2;
//            System.out.println(a);
//        }

//        int a = 0;
//
//        do {
//
//            a = a / 2;
//            System.out.println(a);
//
//        } while (a != 0);

//        String[] androidDevelopers = {"Azamat", "Abdulaziz", "Jahongir", "Bobur", "Ali", "Sanjar", "Usmon", "Mirzakomil"};

//        for (int i = 0; i <= androidDevelopers.length - 1; i++) {
//
//            System.out.println(androidDevelopers[i]);
//
//        }

//        for (String developer:androidDevelopers) {
//            System.out.println(developer);
//        }


//        myMethod("Jahongir ");

//        int b = plusNumber(50,50);
//
//        System.out.println(b);


//        Human human = new Human();
//
//        human.fName = "Abdulaziz";
//
//        human.age = 18;
//
//        human.humanInfo(human);


//        Human jaxongir = new Human("Jahongir","Mannonov",18);
//
//        System.out.println(jaxongir.lName);
//
//        Human bobur = new Human("Bobur","Hayitboyev");
//
//        Human mirza = new Human();
//
//        mirza.humanInfo(bobur);


        Car car = new Car("Nexia", 120, "Black");


        Cobalt cobalt = new Cobalt("Cobalt", 120,"White","Salon zo'r");



    }

//    static int plusNumber(int a, int b) {
//
//        int c = a + b;
//
//        return c;
//
//    }
//
//    static void myMethod(String developer) {
//
//        System.out.println(developer + "Android developer");
//
//    }

}
