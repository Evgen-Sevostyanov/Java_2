package ru.gb;
public interface Gamer {
    String getName();

    int getMaxLength();

    int getMaxHeight();

    boolean getSuccess();

    void setSuccess(boolean success);

    String runStr();

    String jumpStr();
}
