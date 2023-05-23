package yandex.practicum.auto;

class Automobile extends Transport {
    protected String direction;
    public Automobile() {
        wheelsNumber = 4;
    }

    public void turnTo(String worldSide) {
        direction = worldSide;
    }
}