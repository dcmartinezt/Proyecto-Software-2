package com.google.devrel.training.conference.form;

/**
 * Pojo representing a profile form on the client side.
 */
public class ProfileForm {
    /**
     * Any string user wants us to display him/her on this system.
     */
    private String displayName;
    private String cedula;
    private String emailopcional;

    /**
     * T shirt size.
     */
    private TeeShirtSize teeShirtSize;

    private ProfileForm () {}

    /**
     * Constructor for ProfileForm, solely for unit test.
     * @param displayName A String for displaying the user on this system.
     * @param notificationEmail An e-mail address for getting notifications from this system.
     */
    public ProfileForm(String displayName, TeeShirtSize teeShirtSize,String emailopcional,String cedula) {
        this.displayName = displayName;
        this.teeShirtSize = teeShirtSize;
        this.cedula = cedula;
        this.emailopcional = emailopcional;
    }

    public ProfileForm(String displayName, TeeShirtSize teeShirtSize) {
        this.displayName = displayName;
        this.teeShirtSize = teeShirtSize;
    }
    public String getDisplayName() {
        return displayName;
    }

    public TeeShirtSize getTeeShirtSize() {
        return teeShirtSize;
    }
    public String getCedula() {
        return cedula;
    }
    public String getTeEmailopcional() {
        return emailopcional;
    }
    
    public static enum TeeShirtSize {
    	NOT_SPECIFIED,
        XS,
        S,
        M,
        L, 
        XL, 
        XXL,
        XXXL
    }
}
