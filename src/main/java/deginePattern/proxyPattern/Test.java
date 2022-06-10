package deginePattern.proxyPattern;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws Exception {
        //Proxy 패턴 적용 전
        CommandExecutorImpl commandExecutor = new CommandExecutorImpl();
        try {
            commandExecutor.runCommand("Example cmd");
        } catch (IOException e) {
            throw new Exception();
        }

        //Proxy 패턴 적용 후

        CommandExecutor executor = new CommandExecutorProxy("ReadyKim", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand("rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }

    }
}
