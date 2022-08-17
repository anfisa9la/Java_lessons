public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Создание переменных и вывод их значений на консоль");
        boolean is_windows = true;
        byte core_number = 1;
        short ram = 16;
        int discharge = 64;
        long cpu = 330;
        float current_available_ram = 19044.1889f;
        double os_assembly = 15.9;
        char pc_name = 'a';
        System.out.println(is_windows + " - являяется ли ОС на ПК Windows \n" +
                core_number + " - количество ядер на ПК \n" +
                ram + " - объем оперативной памяти \n" +
                discharge + " - разрадность системы \n" +
                cpu + " - процессор \n" +
                current_available_ram + " - текущий объем свободной оперативной памяти \n" +
                os_assembly + " - сборка ОС \n" +
                pc_name + " - имя ПК \n"
            );


        System.out.println("2. Расчет стоимости товара со скидкой");
        int book_price = 200;
        int pen_price = 100;
        double discount = 11;
        double sum = (book_price + pen_price) * ((100 - discount) / (double)100);
        System.out.println(sum + "\n");


        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a  ");
        System.out.println("   J   a a  v   v  a a    ");
        System.out.println("J  J  aaaaa  V V  aaaaa   ");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println("\n");


        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 9223372036854775807L;
        System.out.println(num1 + num1-(byte)1 +  num1+(byte)1);
        System.out.println(num2 + num2-(short)1 +  num2+(short)1);
        System.out.println(num3 + num3-1 +  num3+1);
        System.out.println(num4 + num4-(long)1 +  num4+(long)1 + "\n");



        System.out.println("5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.println(" \n Перестановка с помощью третьей переменной");
        System.out.println("исходные значения переменных: a = " + a + ", b = " + b);
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("новые значения переменных: a = " + a + ", b = " + b);

        System.out.println(" \n Перестановка с помощью арифметических операций");
        System.out.println("исходные значения переменных: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("новые значения переменных: a = " + a + ", b = " + b);

        System.out.println(" \n Перестановка с помощью побитовой операции");
        System.out.println("исходные значения переменных: a = " + a + ", b = " + b);
        a ^= b ^= a ^= b;
        System.out.println("новые значения переменных: a = " + a + ", b = " + b);


        System.out.println("6. Вывод символов и их кодов");
        char task_6_num1 = 35;
        char task_6_num2 = 38;
        char task_6_num3 = 64;
        char task_6_num4 = 94;
        char task_6_num5 = 95;
        System.out.println(task_6_num1 + " |  " + (int) task_6_num1);
        System.out.println(task_6_num1 + " |  " + (int) task_6_num2);
        System.out.println(task_6_num1 + " |  " + (int) task_6_num3);
        System.out.println(task_6_num1 + " |  " + (int) task_6_num4);
        System.out.println(task_6_num1 + " |  " + (int) task_6_num5);


        System.out.println("7. Отображение количества сотен, десятков и единиц числа");
        int task_7_num = 123;
        System.out.println("Число " + task_7_num + " содержит:");
        int x = task_7_num / (int) 100;
        int y = (task_7_num - (int) 100 * x) / (int)10;
        int z = (task_7_num - (int) 100 * x) - y * 10;
        System.out.println(x + " сотен");
        System.out.println(y + " десятков");
        System.out.println(z + " единиц");


        System.out.println("8. Вывод на консоль ASCII-арт Дюка");
        // не хочу тратить на это время

        System.out.println("9. Произведение и сумма цифр числа");
        int task_9_num = 345;
        int task_9_x = task_7_num / (int) 100;
        int task_9_y = (task_7_num - (int) 100 * x) / (int)10;
        int task_9_z = (task_7_num - (int) 100 * x) - y * 10;
        int task_9_sum = task_9_x + task_9_y + task_9_z;
        int task_9_multiplication = task_9_x * task_9_y * task_9_z;
        System.out.println("сумма цифр числа " + task_9_num + " = " + task_9_sum);
        System.out.println("произведение цифр числа " + task_9_num + " = " + task_9_multiplication);

    }
}
