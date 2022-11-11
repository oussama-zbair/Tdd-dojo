package com.nespresso.exercises.train.procedural;


public class Train {


    private String structure;

    public Train(String structure) {
        this.structure = structure;
    }


    public String print() {
        StringBuilder train = new StringBuilder();
        char[] chars = parse();
        for (int i = 0; i < chars.length; i++) {
            final char wagon = chars[i];
            switch (wagon) {
                case 'H':
                    train.append("<HHHH");
                    break;
                case 'T':
                    train.append("HHHH>");
                    break;
                case 'P':
                    train.append("|OOOO|");
                    break;
                case 'R':
                    train.append("|hThT|");
                    break;
                case 'C':
                    train.append("|____|");
                    break;
                case 'F':
                    train.append("|^^^^|");
                    break;

            }
            train.append("::");


        }
        train.delete(train.length() - 2, train.length());
        return train.toString();
    }

    private char[] parse() {
        char[] chars = structure.toCharArray();
        if (chars[chars.length - 1] == 'H') {
            chars[chars.length - 1] = 'T';
        }
        return chars;
    }

    public void detachEnd() {
        this.structure = this.structure.substring(0, this.structure.length() - 1);

    }

    public void detachHead() {
        this.structure = this.structure.substring(1, this.structure.length());

    }


    public boolean fill() {
        if (this.structure.contains("C")) {
            this.structure = this.structure.replaceFirst("C", "F");
            return true;
        }
        return false;
    }
}
