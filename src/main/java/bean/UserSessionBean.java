package bean;

import java.time.LocalDateTime;


public class UserSessionBean {
    private String userName;
    private LocalDateTime expiredTime;

    public UserSessionBean(String userName, LocalDateTime expiredTime) {
        this.userName = userName;
        this.expiredTime = expiredTime;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDateTime getExpiredTime() {
        return expiredTime;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setTime(LocalDateTime time) {
        this.expiredTime = time;
    }
}
