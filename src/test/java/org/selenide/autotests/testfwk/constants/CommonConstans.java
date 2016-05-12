package org.selenide.autotests.testfwk.constants;

/**
 * Created by Oleg Voronchenko on 4/28/2016.
 */
public class CommonConstans {
    public static final int DEFAULT_TIMEOUT = 20000;

    //region - Gmail address
    public static final String COMMON_GMAIL_URL = "https://gmail.com";
    //endregion

    //region - Element identifiers section

    //region Authorization section
    public static final String EMAIL_TEXT_BOX_ID = "Email";
    public static final String PWD_TEXT_BOX_ID = "Passwd";
    public static final String NEXT_BUTTON_ID = "next";
    public static final String ENTER_BUTTON_ID = "signIn";
    //endregion

    //region Emails section
    public static final String USER_ACCOUNT_BOX_CLASS_NAME = "gb_7a";
    public static final String SIGN_OUT_BUTTON_ID = "gb_71";
    public static final String USER_ACCOUNT_EMAIL_CLASS_NAME = "gb_pb";
    //endregion
    //endregion

    //region - Predefined user's data section
    public static final String USER_NAME = "Xxx Yyy";
    public static final String USER_EMAIL_ADDRESS = "xx.xx.xx.yy.yy.yy.zz.zz@gmail.com";
    public static final String USER_PASSWORD = "qwerty123456@";
    //endregion

    //region - Additional site elements
    public static final String ERROR_MSG = ".error-msg";
    public static final String LOADING = "Loading";
    //endregion
}
