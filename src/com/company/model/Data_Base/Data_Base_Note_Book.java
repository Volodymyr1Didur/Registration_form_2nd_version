package com.company.model.Data_Base;

public enum Data_Base_Note_Book {
    NOTE_ONE("Taras", "taras123"),
    NOTE_TWO("Nikola","nik12345"),
    NOTE_THREE ("Petro","shoko123");

    private final String firstName;
    private final String login;

    Data_Base_Note_Book(String firstName, String login) {
        this.firstName = firstName;
        this.login = login;
    }
    public static boolean checkLogin (String loginData){
        for (Data_Base_Note_Book note : Data_Base_Note_Book.values()){
            if (note.getLogin().equals(loginData)){return true;}
        }
        return  false;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLogin() {
        return login;
    }


}


