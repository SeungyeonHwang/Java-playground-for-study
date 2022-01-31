package Jcommander.ex2;

import com.beust.jcommander.JCommander;

public class ArgumentBuilder {
    public static Argument build(String[] args) {
        Argument argument = new Argument();
        JCommander.newBuilder()
                .addObject(argument)
                .build()
                .parse(args);
        return argument;
    }
}