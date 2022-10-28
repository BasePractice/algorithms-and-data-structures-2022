package ru.mirea.practice.task9;

public abstract class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.buildDictionary("A regular expression (shortened as regex or regexp; sometimes referred to as"
                + " rational expression) is a sequence of characters that specifies a search pattern in text. "
                + "Usually such patterns are used by string-searching algorithms for find or find and replace "
                + "operations on strings, or for input validation. Regular expression techniques are developed "
                + "in theoretical computer science and formal language theory."
                + "The concept of regular expressions began in the 1950s, when the American mathematician "
                + "Stephen Cole Kleene formalized the concept of a regular language. They came into common use with "
                + "Unix text-processing utilities. Different syntax's for writing regular expressions have existed "
                + "since the 1980s, one being the POSIX standard and another, widely used, being the Perl syntax."
                + "Regular expressions are used in search engines, in search and replace dialogs of word processors "
                + "and text editors, in text processing utilities such as sed and AWK, and in lexical analysis. "
                + "Most general-purpose programming languages support regex capabilities either natively "
                + "or via libraries, including Python, C, C++, Java, Rust, OCaml, and JavaScript.[10]");
    }
}
