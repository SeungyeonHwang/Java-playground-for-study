package deginePattern.proxyPattern;

public class CommandExecutorProxy implements CommandExecutor {
    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {
        if ("ReadyKim".equals(user) && "correct_pwd".equals(pwd)) {
            isAdmin = true;
            executor = new CommandExecutorImpl();
        }
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed for non-admin usrs.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}
