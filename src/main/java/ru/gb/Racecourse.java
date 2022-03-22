package ru.gb;
public class Racecourse implements Hurdles{
    private int length;

    public Racecourse(int length) {
        this.length = length;
    }

    public String check(Gamer gamer) {
        gamer.runStr();
        gamer.setSuccess(gamer.getMaxLength() >= length);
        if (gamer.getSuccess()) {
            Assertions.assertTrue(gamer.getSuccess());
            return "Игрок " + gamer.getName() + " проходит дистанцию длиной: " + length + " км";
        } else {
            Assertions.assertFalse(gamer.getSuccess());
            return "Игрок " + gamer.getName() + " не проходит дистанцию длиной: " + length + " км";
        }
    }
}
