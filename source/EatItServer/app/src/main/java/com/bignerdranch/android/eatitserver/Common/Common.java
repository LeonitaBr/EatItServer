package com.bignerdranch.android.eatitserver.Common;

import com.bignerdranch.android.eatitserver.Model.User;

/**
 * Created by leoni on 4/30/2018.
 */

public class Common {
    public  static User currentUser;
     public  static  final String UPDATE="update";
    public  static  final String DELETE="delete";
    public static final  int  PICK_IMAGE_REQUEST=71;

    public  static  String convertCodeToStatus(String status)
    {
        if(status.equals("0"))
            return "Placed";
        else if(status.equals("1"))
            return "On my  way";
        else
            return  "Shipped";
    }
}
