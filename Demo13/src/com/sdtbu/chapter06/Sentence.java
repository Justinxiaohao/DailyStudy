package com.sdtbu.chapter06;

import java.util.Objects;

public class Sentence {
    private String sentence;
    private int index;
    private int length;

    public Sentence(String sentence, int index, int length) {
        this.sentence = sentence;
        this.index = index;
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sentence sentence1 = (Sentence) o;
        return index == sentence1.index && length == sentence1.length && Objects.equals(sentence, sentence1.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentence, index, length);
    }

    //没有重写会默认去打印对象的地址，重写了会打印出具体的对象
    @Override
    public String toString() {
        return "Sentence{" +
                "sentence='" + sentence + '\'' +
                ", index=" + index +
                ", length=" + length +
                '}';
    }
}
