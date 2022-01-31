package Jcommander.ex2;

import com.beust.jcommander.Parameter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
public class Argument {
    @Parameter(names = {
            "-profile"
    }, required = true, description = "profile")
    private String profile;

    @Parameter(names = {
            "-execution_date"
    }, converter = LocalDateTimeArgumentConverter.class, required = true, description = "실행 시간")
    private LocalDateTime executionDate;

    @Parameter(names = {
            "-mail_send"
    }, description = "mail 전송 여부")
    private Boolean isMailSend;
}

