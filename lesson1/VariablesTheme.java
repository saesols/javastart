public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte cpuCores = 7;
        short numberOfFilesInHomeDirectory = 24222;
        int timeSinceEpoch = 1_659_788_719;
        long ramBytes = 17_179_869_184L;
        float cpuFrequency = 4.2F;
        double piNumberDouble = 3.1415926535897932384626433832795;
        char mainDiskLabel = 'C';
        String processorName = "Intel core i7";
        boolean cyberpunk2077Compatible = true;
        System.out.printf("Total number of the processor cores: %d", cpuCores);
        System.out.printf("%nTotal number of files in home directory: %d", numberOfFilesInHomeDirectory);
        System.out.printf("%nTime since epoch: %d", timeSinceEpoch);
        System.out.printf("%nRam in bytes: %d", ramBytes);
        System.out.printf("%nCpu frequency: %f GHz", cpuFrequency);
        System.out.printf("%nPi stored in double: %f", piNumberDouble);
        System.out.printf("%nOs disk letter: %c", mainDiskLabel);
        System.out.printf("%nProcessor: %s", processorName);
        System.out.printf("%nCan run Cyberpunk 2077: %b", cyberpunk2077Compatible);

        System.out.printf("%n%n2. Расчёт стоимости товаров со скидкой");
        int penPrice = 100;
        int bookPrice = 200;
        float discount = (penPrice + bookPrice) * 0.11f;
        float discountPrice = (penPrice + bookPrice) * 0.89f;
        System.out.printf("%nСумма скидка: %.2f %nОбщая стоимость товаров: %.2f", discount, discountPrice);

        System.out.printf("%n%n3. Вывод на консоль слова JAVA");
        System.out.println("""
                   J    a  v     v  a
                   J   a a  v   v  a a
                J  J  aaaaa  V V  aaaaa
                 JJ  a     a  V  a     a""");

        System.out.println();
        System.out.print("4. Отображение min и max значений числовых типов данных");
        byte byteIncrTest = 127;
        System.out.printf("%nByte initial value: %d", byteIncrTest);
        System.out.printf("%nByte after incr: %d", ++byteIncrTest);
        System.out.printf("%nByte after decr: %d", --byteIncrTest);

        short shortIncrTest = 32_767;
        System.out.printf("%nShort initial value: %d", shortIncrTest);
        System.out.printf("%nShort after incr: %d", ++shortIncrTest);
        System.out.printf("%nShrt after decr: %d", --shortIncrTest);

        int intIncrTest = 2_147_483_647;
        System.out.printf("%nByte initial value: %d", intIncrTest);
        System.out.printf("%nInt after incr: %d", ++intIncrTest);
        System.out.printf("%nInt after decr: %d", --intIncrTest);

        long longIncrTest = 9_223_372_036_854_775_807l;
        System.out.printf("%nByte initial value: %d", longIncrTest);
        System.out.printf("%nLong after incr: %d", ++longIncrTest);
        System.out.printf("%nLong after decr: %d", --longIncrTest);

        System.out.printf("%n%n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.printf("%nПерестановка c помощью 3й переменной");
        System.out.printf("%nИсходные значения a:%d b:%d", a, b);
        int c = a;
        a = b;
        b = c;
        System.out.printf("%nЗначения после перестановки a:%d b:%d", a, b);

        System.out.printf("%nПерестановка с помощью арифметических операций");
        System.out.printf("%nИсходные значения a:%d b:%d", a, b);
        a += b;
        b = a - b;
        a -= b;
        System.out.printf("%nЗначения после перестановки a:%d b:%d", a, b);

        System.out.printf("%nПерестановка с помощью побитовых операций");
        System.out.printf("%nИсходные значения a:%d b:%d", a, b);
        a ^= b;
        b = a ^ b;
        a ^= b;
        System.out.printf("%nЗначения после перестановки a:%d b:%d", a, b);

        System.out.printf("%n%n6. Вывод символов и их кодов");
        char c1 = 35;
        char c2 = 38;
        char c3 = 64;
        char c4 = 94;
        char c5 = 95;
        System.out.printf("%n%d : %c", (int) c1, c1);
        System.out.printf("%n%d : %c", (int) c2, c2);
        System.out.printf("%n%d : %c", (int) c3, c3);
        System.out.printf("%n%d : %c", (int) c4, c4);
        System.out.printf("%n%d : %c", (int) c5, c5);

        System.out.printf("%n%n7. Отображение количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = (number % 100) % 10;
        System.out.printf("%n%d сотня%n%d десятков%n%d единиц", hundreds, tens, ones);

        System.out.printf("%n%n8. Вывод на консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightPrenthesis = ')';
        char space = ' ';
        System.out.println();
        System.out.println("" + space + space + space + space + slash + backslash);
        System.out.println("" + space + space + space + slash + space + space + backslash);
        System.out.println("" + space + space + slash + underscore + leftParenthesis + space + rightPrenthesis + backslash);
        System.out.println("" + space + slash + space + space + space + space + space + space +backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash
        + backslash + underscore + underscore + backslash);

        System.out.println();
        System.out.print("9. Произведение и сумма цифр числа");
        number = 345;
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int lastDigit = number % 10;
        System.out.printf("%nсумма цифр числа %d=%d", number, firstDigit + secondDigit + lastDigit);
        System.out.printf("%nпроизведение цифр числа %d=%d", number, firstDigit * secondDigit * lastDigit);

        System.out.printf("%n%n10. Преобразование секунд");
        int secondsCount = 86399;
        int hours = secondsCount / 3600;
        secondsCount = secondsCount % 3600;
        int minutes = secondsCount / 60;
        secondsCount = secondsCount % 60;
        System.out.printf("%n%d:%d:%d", hours, minutes, secondsCount);

    }
}
