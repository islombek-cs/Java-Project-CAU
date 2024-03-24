public class Basic_Learning {
    public static void main(String[] args){

        /* String[] cars = {"Volvo", "Cadillac", "Chevrolet", "BMW", "Mercedes Benz"};
        System.out.println(cars[0]);
        cars[1] = "Opel";
        System.out.println(cars[1]);
        System.out.println(cars.length);
        System.out.println();
        for (int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }
        System.out.println();
        for (String i: cars){
            System.out.println(i);
        }
        System.out.println();
        int[][] myNumbers = {{1,2,3,4}, {5,6,7}};
        System.out.println(myNumbers[1][1]);
        myNumbers[0][3] = 9;
        System.out.println(myNumbers[0][3]);
        System.out.println();
        for (int i=0; i<myNumbers.length; i++){
            for (int j=0; j<myNumbers[i].length; j++){
                System.out.print(myNumbers[i][j] + " ");
            }
        } */

        /* for (int i=1; i<5; i++){
            if (i==4){
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i=1; i<7; i++){
            if (i==5){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        int i=0;
        while (i<8){
            if (i==4){
                break;
            }
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        int j=0;
        while (j<=5){
            if (j==3){
                j++;
                continue;
            }
            System.out.print(j + " ");
            j++;
        } */

        /* for(int i = 1; i<=2; i++){
            System.out.println("\nOuter loop: " + i);
            for (int j=1; j<=3; j++){
                System.out.print(" Inner loop: " + j);
            }
        }
        System.out.println();
        String[] cars = {"BMW", "Volvo", "Ford", "Deluxe"};
        for (String i: cars){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i=0; i<cars.length; i++){
            System.out.println(cars[i]);
        }*/

        /*int i = 0; int j = 0;
        while (i < 5){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        do{
            System.out.print(j + " ");
            j++;
        }
        while(j <= 5);*/

        /* char operator = '+';
        double num1 = 12; double num2 = 6;
        double result;
        switch (operator){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        System.out.println("Result: " + result);

        String month = "April";
        int month_num;
        switch(month){
            case "January":
                month_num = 1;
                break;
            case "February":
                month_num = 2;
                break;
            case "March":
                month_num = 3;
                break;
            case "April":
                month_num = 4;
                break;
            case "May":
                month_num = 5;
                break;
            case "June":
                month_num = 6;
                break;
            case "July":
                month_num = 7;
                break;
            case "August":
                month_num = 8;
                break;
            case "September":
                month_num = 9;
                break;
            case "October":
                month_num = 10;
                break;
            case "November":
                month_num = 11;
                break;
            case "December":
                month_num = 12;
                break;
            default:
                month_num = 0;
                break;
        }
        if (month_num != 0){
            System.out.println("Month num for " + month + " is: " + month_num);
        }else {
            System.out.println("Invalid month!");
        } */

        /* int time = 6;
        String result = (time > 12) ? "Good day!" : "Good Morning!";
        System.out.println(result);
        System.out.println((time<12) ? "Good morning!" : "Good day!"); */

        /* if (20>18){
            System.out.println("20 is greater than 18!");
        }else{
            System.out.println("error");
        }

        int time = 20;
        if(time <= 11 && time >= 6){
            System.out.println("Good morning!");
        }else if(time <= 18 && time >= 12){
            System.out.println("Good day!");
        }else{
            System.out.println("Good evening!");
        } */

        /*System.out.println(Math.max(34,5));
        System.out.println(Math.min(23,46));
        System.out.println(Math.sqrt(110));
        System.out.println(Math.random());
        int random_num = (int)(Math.random() * 101);
        System.out.println(random_num);*/

        /*String txt = "Hello ";
        int age = 20;
        System.out.println(txt+age);*/

        /*String my_txt = "Hello World, my java codes";
        String txt1 = "Islombek"; String txt2 = " Abdurakhmonov";
        System.out.println("Length: " + my_txt.length());
        System.out.println(my_txt.toLowerCase());
        System.out.println(my_txt.toUpperCase());
        System.out.println(my_txt.indexOf("my"));
        System.out.println(txt1.concat(txt2));*/

        /*byte num = -127;  byte num1 = 127;
        short x, y; x = 2345; y = 3134; short z = (short) (x+y);
        System.out.println(z);
        long lng = 922337203685477580L; System.out.println(lng);
        double dbl = 4535.3533; System.out.println(dbl);*/

        /* String f_name = "Islombek"; String l_name = "Abdurakhmonov";
        int age = 20; final int year = 2004;
        float my_height = 1.75f; float my_weight =57.50f;
        char my_sex = 'M';
        boolean active = true; boolean tired = false;
        System.out.println(f_name + " " + l_name + " " + age + ", " + year + ". Height & Weight "
                + my_height + " and " + my_weight + ". Sex: " + my_sex + ". \n" + active + " " + tired); */

        /* System.out.println("Hello World");
        System.out.println("I am learning Java basics");
        System.out.println('Hello Islombek'); -> It will produce an error
        System.out.println(35);
        System.out.println(4+5); */

    }
}