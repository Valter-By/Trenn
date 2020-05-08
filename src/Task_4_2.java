public class Task_4_2 {

    public void move(Qu q, int[][] imap, Dot t) {

        int x = t.x;
        int y = t.y;
        //left
        if (y >= 1 && imap[t.x][t.y - 1] == 1) {
            q.put(new Dot(t.x, t.y - 1));

        }
        //right
        if (y < imap[0].length - 1 && imap[t.x][t.y + 1] == 1) {
            q.put(new Dot(t.x, t.y + 1));
        }



    }

    static class Dot {

        public int x;
        public int y;

        Dot(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public static void main(String[] args) {







        String[] map = new String[] {
                ".......fx",
                ".xx.xxxxx",
                ".x..x.xs.",
                "...xx.xx.",
                "........." };
        int n = map.length;
        int m = map[0].length();
        int[][] imap = new int[n][m];

        System.out.println("size: " + n + "x" + m);

        Dot start = new Dot(0, 0);
        Dot finish = new Dot(0, 0);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = map[i].charAt(j);
                switch (c) {
                    case 46: //.
                        imap[i][j] = 1;
                        break;
                    case 102: //f
                        imap[i][j] = 2;
                        finish = new Dot(i, j);
                        break;
                    case 115: //s
                        imap[i][j] = 3;
                        start = new Dot(i, j);
                        break;
                }
            }
        }
        Qu<Dot> q = new Qu<Dot>(start);
        start = q.get();
        System.out.println("x: " + start.x + "; y: " + start.y);
        q.put(start);

        Dot cur = new Dot(start.x, start.y);

        while (!cur.equals(finish)) {

        }

    }
}
