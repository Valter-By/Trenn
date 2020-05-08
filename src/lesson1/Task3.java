package lesson1;

import java.math.BigDecimal;

public class Task3 {
    public static void main(String[] args) {

        // BigDecimal x = new BigDecimal(1);



        Event[] evs = new Event[5];

        for (int i = 0; i < 5; i++) {
                evs[i] = new Event(i + 1001, i, i, Integer.toString(i) + " name ");
        }

        //sortEvents(evs);

        for (int i = 0; i < 5; i++) {
           System.out.println(evs[i].name + " name ");
        }

    }

    static class Event {

        static int d;
        static int m;
        static int y;
        static String name;

        public Event() {
            d = 0;
            m = 0;
            y = 0;
            name = null;
        }
        public Event(int d, int m, int y, String name) {
            this.d = d;
            this.m = m;
            this.y = y;
            this.name = name;
        }
    }

    static void sortEvents(Event[] arr) {
        int n = arr.length;
        Event t = new Event();

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i - 1; k++) {
                if (arr[k].y > arr[k + 1].y ||
                        arr[k].y == arr[k + 1].y && arr[k].m > arr[k + 1].m ||
                        arr[k].y == arr[k + 1].y && arr[k].m == arr[k + 1].m  &&
                                arr[k].d > arr[k + 1].d) {
                    t = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = t;
                }
            }
        }
    }

}
