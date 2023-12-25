package _231225;

class Sports {
    String getName() {
        return "아직 결정되지 않음";
    }

    int getPlayers() {
        return 0;
    }
}

class Soccer2 extends Animal {
    String getName() {
        return "축구";
    }

    int getPlayers() {
        return 11;
    }
}

public class Soccer {
    public static void main(String[] args) {
        Soccer2 s = new Soccer2();
        System.out.println("경기이름 : " + s.getName());
        System.out.println("경기자수 : " + s.getPlayers());
    }
}

