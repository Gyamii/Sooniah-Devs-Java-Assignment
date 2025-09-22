
public class Main{
    static class User {
        int id;
        String profile;
        String setting;
    }

    static class Profile{
        String username;
        String email;


        void userProfile(){
            System.out.println("This is your username :" + username + ",and this is your email :" + email);
        }
    }

    static class Settings{
        String theme;
        boolean notifications;

        void userSettings(){
            System.out.println("This is your theme :" + theme);
        }

    }

    public static void main(){
       Profile profile1 = new Profile();
       profile1.username= "Gyamiish";
       profile1.email = "gyamiish1@gmail.com";

       profile1.userProfile();


       Settings setting1 = new Settings();
        setting1.theme= "Black";

        setting1.userSettings();
    }

}
