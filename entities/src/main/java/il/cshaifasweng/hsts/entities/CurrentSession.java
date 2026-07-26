package il.cshaifasweng.hsts.entities;

public class CurrentSession {
    private AuthorizedUser currentUser;

    public CurrentSession(AuthorizedUser currentUser){
        this.currentUser = currentUser;
    }

    public AuthorizedUser getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(AuthorizedUser currentUser) {
        this.currentUser = currentUser;
    }

    public String getUserId() {
        return "user id?";
    }

    public String getRole(){
        return "role?";
    }

}
