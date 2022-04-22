package MXN;
import java.util.concurrent.ConcurrentHashMap;
public class Main {

    public static void years(int year) {

        // First Exercise

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("the year " + year + " is a leap year");
        } else {
            System.out.println("the year " + year + " is not a leap year");
        }
    }

    // Second Exercise

    public static void clientOS(int clientIos, int clientAndroid) {

        if ((clientIos == 1 && clientIos <= 2015) || (clientIos == 0 && clientIos > 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        } else {
            System.out.println("Приложение будет работать корректно ");
        }

        if ((clientAndroid == 1 && clientAndroid <= 2015) || (clientAndroid == 0 && clientAndroid > 2015)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        } else {
            System.out.println("Приложение будет работать корректно ");
        }
    }

    // Third exercise (Уверен, что не так выполнил)...

    public static void Delivery(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("доставка заӣмет " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("доставка заӣмет " + (deliveryDays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("доставка заӣмет " + (deliveryDays + 2));
        } else if (deliveryDistance > 100) {
            System.out.println("на такое расстояние нет доставки ");
        }
    }

    private static void print(int[] array, int index) {
        try {
            int element = array[index];
            print(array, index + 1);
            System.out.println(element);
        } catch (ArrayIndexOutOfBoundsException ignored) {
        }
    }

        public static void main(String[] args) {

            years(2021);
            clientOS(1, 0);
            Delivery(10);

            // Fifth Exercise

            //    String[] power = {" 3," , " 2, ", " 1, ", " 6, ", " 5, "};
            //    for (int i = 0; i < power.length; i++) {
            //        System.out.print(power[i]);
            //    }
            //     System.out.println();
            //     int great = power.length;
            //     String temp;

            //      for (int i = 0; i < great/2; i++) {
            //          temp = power[great-i-1];
            //         power[great-i-1] = power[i];
            //          power[i] = temp;
            //       }
            //       for (int i = 0; i < power.length; i++) {
            //         System.out.print(power[i]);

            {
                int[] a = {3, 2, 1, 6, 5};
                print(a, 0);
            }
            int[] array = {3, 2, 1, 6, 5};

//// попробовал разными вариантами

            for (int i = 0, j = array.length - 1; i < j; ++i, --j) {
                int alex = array[i];
                array[i] = array[j];
                array[j] = alex;
            }

            for (int i : array)
                System.out.print(i + " ");

            System.out.println();


            // Fourth Exercise


                String s = "aabccddefgghiijjkk";

                String[] sorting = s.trim().split("");

                ConcurrentHashMap<String, Integer> hm = new ConcurrentHashMap<>();
                for (int i = 0; i < sorting.length; i++) {
                    if (!hm.containsKey(sorting[i])) {
                        hm.put(sorting[i], 1);
                    } else {
                        hm.put(sorting[i], hm.get(sorting[i]) + 1);
                    }
                }
                for (String ele : hm.keySet()) {
                    if (hm.get(ele) > 1) {
                        hm.remove(ele);
                    }
                }
                for (String key : hm.keySet()) {
                    System.out.print(key);
                }
            }
        }

