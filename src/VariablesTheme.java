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
        char pc_name = 'А';
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
        int discount = 11;
        double i = (100 - discount) / 100;
        System.out.println((book_price + pen_price) /i );
    }
}
